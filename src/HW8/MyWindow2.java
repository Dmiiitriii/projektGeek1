package HW8;

import javax.swing.*;
import java.awt.*;

public class MyWindow2 extends JFrame {
    public MyWindow2() {
            setBounds(400,400,800,600); //задаем параметры окна. Этим же оператором можно задать габариты кнопки
            setDefaultCloseOperation(EXIT_ON_CLOSE); //создаем значек х для закрытия окошка
            setTitle("MyWindow"); //название окна
           /* setLayout(new FlowLayout()); // FlowLayout - заполняются строки кнопок, GridLayout - заполняется не строками, а количеством заданных элементов 3х3 или 4х4 итп
            setLayout(new GridLayout(4,4));

        for (int i = 0; i<16; i++) { //циклом создаем кнопки в этой панели
            JButton button = new JButton("Button" + i); //задаем название кнопки
            add(button);
        }*/

        JTextArea textArea = new JTextArea(); //создаем текстовую область, куда можно вносить текст в центре
        add(textArea, BorderLayout.CENTER);

        JTextField textField = new  JTextField();//создаем текстовую область, куда можно вносить текст в нижней (южной) части окна
        add(textField,BorderLayout.SOUTH);

        JButton button = new JButton("send"); // создаем кнопку с надписью send на востоке окна
        add(button,BorderLayout.EAST);
        button.addActionListener(e->{ //задаем действие кнопки - при нажатии текст переходит из textField в textArea
            textArea.append(textField.getText() + "\n");
            textField.setText("");
        });
        textField.setText(""); //делает поле textField пустым после нажатия send
        textField.requestFocus();
    setResizable(false); //делает размер окна неизменяемым
    setVisible(true);
    }
}
