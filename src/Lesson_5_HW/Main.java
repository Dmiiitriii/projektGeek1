package Lesson_5_HW;

public class Main {

    public static void main(String[] args) {

        Array1 a1 = new Array1(5);
        Array2 a2 = new Array2("a2");

        a1.array1(10000000);
        System.out.println("\nРасчет массива 2\n");
        a2.start();

    }
}
