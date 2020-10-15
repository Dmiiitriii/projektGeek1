import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private static final String SERVER_ADDRESS = "localhost";
    private static final int SERVER_PORT = 8189;

    public static void main(String[] args) {
        Socket socket = null;
        Scanner scanner = new Scanner(System.in);


        try {
            socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
            System.out.println("Клиент подключен");

            DataInputStream in = new DataInputStream(socket.getInputStream()); // считывает входящий поток - все что приходит из потока
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());// класс для отправки текстовых сообщений в удобной форме (отправляй PrintWriter на исходящий канал сокета), отправляем собщения на исходящий канал OutputStream клиентского сокета socet и освобождаем внутренний буфер после отправки (autoFlush:true)


            Thread thread2 = new Thread(() -> {
                while (true) {
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
            thread2.setDaemon(true);
            thread2.start();

            while (true) {
                String str = in.readUTF();
                if (str.equals("/close")) {
                    System.out.println("Дисконнект");
                    out.writeUTF("/close");
                    break;
                } else {
                    System.out.println("Сервер: " + str );
                }

            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close(); //закрывает сокет клиента

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
