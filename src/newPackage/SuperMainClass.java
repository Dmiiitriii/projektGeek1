package newPackage;

import java.util.Arrays;

public class SuperMainClass {
    public static void main(String args[]) {
        System.out.println("Hello!");
        //1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] arr1 = {1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1};

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 1) {
                arr1[i] = 0;
            } else if (arr1[i] == 0) {
                arr1[i] = 1;
            }
            if (arr1[i] < 0 || arr1[i] > 1) {
                int b = i + 1;
                System.out.println("Значение " + b + " в массиве неверное");
                break;
            }

        }
        System.out.println(Arrays.toString(arr1));

        //2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

        int[] arr2 = new int[8];
        int j = 0;

        for (int i = 0; i < arr2.length * 3; i++) {
            if (i == 0 || j % 3 == 0) {
                arr2[j] = i;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr2));

        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] = arr3[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr3));

        //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

        int[][] arr4 = new int[5][5];
        //arr4[0] = new int[4];

        for (int i = 0; i < arr4.length; i++) {
            for (int z = 0; z < arr4.length; z++) {

                if (i == z || z + i == arr4.length - 1) {
                    arr4[i][z] = 1;

                }
                System.out.printf("%6s", arr4[i][z]);
            }
            System.out.println();
        }

        //5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);

        int[] arr5 = {1, 5, 3, 2, 11, 4, 5, 2, 4, -55, 9, 1};
        int max = arr5[0];
        int min = arr5[arr5.length - 1];

        for (int i = 0, q = arr5.length - 1; i < arr5.length; i++, q--) {

            if (arr5[i] >= max) {
                max = arr5[i];
            }
            if (arr5[q] < min) {
                min = arr5[i];
            }
        }
        System.out.println("Максимальное число массива: " + max);
        System.out.println("Минимальное число массива: " + min);

        //6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.

        int[] arr6 = {1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1};
        int sum1 = 0;
        int sum2 = 0;
        int score = 0;


        for (int i = 0; i < arr5.length; i++) {
            sum1 += arr6[i];
            score++;
            for (int g = arr5.length - 1; g>i; g--){
                sum2 += arr6[g];

                if (sum1 == sum2){
                    System.out.println("Суммы сошлись c " + score +" раза!");}



            }

        }
        System.out.println("Сума чисел массива: " + sum1 +" и " + sum2);
        System.out.println(Arrays.toString(arr6));


    }

}
