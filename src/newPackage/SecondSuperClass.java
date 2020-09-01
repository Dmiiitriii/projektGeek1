package newPackage;

import java.util.Scanner;

public class SecondSuperClass {
    public static void main(String[] args) {


        int b = 0;
        int countTry = 3;

        Scanner sc = new Scanner(System.in);
        //Scanner sc2 = new Scanner(System.in);

        System.out.println("угадайте число от 0 до 9: ");
        int randomNumber = b + (int) (Math.random() * 10);
        System.out.println(randomNumber);

        for (int i = 1; i <= countTry; i++) {


            int a = sc.nextInt();


            if (a == randomNumber) {
                System.out.println("Поздравляю, вы угадали с " + i + "раза");
                System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
                int z = sc.nextInt();
                if (z ==0) {return;}
                if (z ==1) {i=0;}

            }
            if (a > randomNumber) {
                System.out.println("Вы ввели большее число, чем загаданное, попробуйте еще. У вас осталось " + (countTry - i) + " попыток");
            }
            if (a < randomNumber) {
                System.out.println("Вы ввели число меньше, чем загаданное, попробуйте еще. У вас осталось " + (countTry - i) + " попыток");
            } if (i>=3){
                System.out.println("У Вас не осталось попыток. Сыграть еще раз? 1 – да / 0 – нет");
                int z = sc.nextInt();
                if (z ==0) {break;}
                if (z ==1) {return;}
            }



        }         sc.close();













    }
}