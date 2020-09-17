package HW8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame { //создаем окно с экспортом JFrame

    public MyWindow() {
        setBounds(400,400,800,600); //задаем параметры окна. Этим же оператором можно задать габариты кнопки
        setDefaultCloseOperation(EXIT_ON_CLOSE); //создаем значек х для закрытия окошка
        setTitle("MyWindow"); //название окна

        JButton button1 = new JButton("btn1"); //создаем кнопку
        button1.setPreferredSize(new Dimension(100,100)); //задаем размеры(ширину) кнопки
        add(button1,BorderLayout.EAST); //задаем расположение кнопки

        JButton button2 = new JButton("btn2");
        add(button2, BorderLayout.SOUTH);

        JTextArea textArea = new JTextArea("ffffffffff"); //создаем текс в центре пустого поля
        add(textArea, BorderLayout.CENTER);

        JPanel topPanel = new JPanel(new GridLayout(1, 4, 10, 5)); //добавляем верхню (NORTH) панель из 4 частей и одной строки и задаем расстояние между ними
        for (int i = 0; i<4; i++){ //циклом создаем кнопки в этой панели
            JButton button = new JButton("Button" + i); //задаем название кнопки
            button.setBackground(Color.yellow);
            topPanel.add(button); //запускаем метод добавления кнопки
        }
        topPanel.setBackground(Color.green); // задаем цвет панели (но не кнопок)
        add(topPanel,BorderLayout.NORTH); //указываем расположение кнопки

        /*button2.addActionListener(new ActionListener() {  //задаем событие при нажатии на кнопку
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("Hello!\n");
            }
        });*/

        button2.addActionListener(e-> {    //то же самое событие, но в сокращенном виде, используя лямбда-выражения e-> (применимо для интерфейсов с одним методом)
                textArea.append("Hello ");
        });

        button1.addActionListener(e-> {
            textArea.append(" WORLD!\n");
        });

        setVisible(true); //задаем видимость окна

    }
}
