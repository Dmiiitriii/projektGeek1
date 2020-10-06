package Lesson_5_HW;

import java.util.Arrays;

public class Array1 {

     int size;

    public Array1(int size) {
        this.size = size;
    }

    public void array1 (int size){

        float [] arr1 = new float[size];
        for (int i = 0; i < size; i++) {
            arr1[i] = 1;
        }
        String a1 = Arrays.toString(arr1);
        //System.out.println(a1);
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            arr1[i] = (float) (arr1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        String a11 = Arrays.toString(arr1);
        //System.out.println(a11);
        System.out.println("Время расчета массива 1, мс: " + elapsed);

    }





}
