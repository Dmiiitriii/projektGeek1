package HW_6_lesson;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {

        ServerSocket server = null;
        Socket clientSocket = null;
        final int PORT = 8189; //порт, который будем слушать
        Scanner scanner = new Scanner(System.in);

        try {
            server = new ServerSocket(PORT);
            System.out.println("Сервер запущен");
            clientSocket = server.accept(); //блокирующий оператор тормозит поток до тех пор, пока не появится запрос. при появлении запроса соедниния, выдает сокет для соединения
            System.out.println("Клиент подключен, Адрес: " + clientSocket.getRemoteSocketAddress());

            DataInputStream in = new DataInputStream(clientSocket.getInputStream()); // считывает входящий поток - все что приходит из потока
            DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());// класс для отправки текстовых сообщений в удобной форме (отправляй PrintWriter на исходящий канал сокета), отправляем собщения на исходящий канал OutputStream клиентского сокета socet и освобождаем внутренний буфер после отправки (autoFlush:true)


            Thread thread1 = new Thread(() -> {
                while (true) {
                    //String str = in.nextLine(); //считывает то, что приходит от потока считываемое сканером in...
                    // out.writeUTF(in.nextLine());
                    try {
                        out.writeUTF(scanner.nextLine());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    //if (str.equals("/end")){ //команда от клиента, чтобы выйти из цикла и закрыть каналы
                    //   break;
                    //}
                    //System.out.println("Клиент: " + str); // ...и выводит на печать
                    //out.println("echo: " + str);
                }
            });
            thread1.setDaemon(true);
            thread1.start();

            while (true) {
                String str = in.readUTF();
                if (str.equals("/close")) {
                    System.out.println("Клиент покинул сервер");
                    out.writeUTF("/close");
                    break;
                }else {
                    System.out.println("Клиент: " + str );
                }

            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                clientSocket.close(); //закрывает сокет клиента
                server.close(); //закрывает сокет сервера
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
