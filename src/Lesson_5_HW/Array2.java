package Lesson_5_HW;

import java.util.Arrays;

public class Array2 extends Thread {
    int size = 10000000;
    int h = size/2;

    String name;

       public Array2(String name) {
        super(name);
        this.size = size;
    }

    @Override
    public void run() {
        super.run();

        float [] arr2 = new float[size];
        for (int i = 0; i < size; i++) {
            arr2[i] = 1;
        }
        String a2 = Arrays.toString(arr2);
        //System.out.println(a2);
        float[] a3 = new float[h];
        float[] a4 = new float[h];
        long razb1 = System.currentTimeMillis();
        System.arraycopy(arr2, 0, a3, 0, h);
        System.arraycopy(arr2, h, a4, 0, h);
        long razb2 = System.currentTimeMillis();
        long razb = razb2 - razb1;
        System.out.println("Время разбивки, мс: " + razb);
        long rasch1 = System.currentTimeMillis();
        for (int i = 0; i < h; i++) {
            a3[i] = (float) (a3[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        for (int i = 0, k=h; i < h; i++, k++) {
            a4[i] = (float) (a4[i] * Math.sin(0.2f + k / 5) * Math.cos(0.2f + k / 5) * Math.cos(0.4f + k / 2));
        }
        long rasch2 = System.currentTimeMillis();
        long rasch = rasch2 - rasch1;
        System.out.println("Время рассчета, мс: " + rasch);
        long sklei1 = System.currentTimeMillis();
        System.arraycopy(a3, 0, arr2, 0, h);
        System.arraycopy(a4, 0, arr2, h, h);

        long sklei2 = System.currentTimeMillis();
        long sklei = sklei2 - sklei1;
        System.out.println("Время склейки, мс: " + sklei);
        String a21 = Arrays.toString(arr2);
        long fullTime = sklei + rasch + razb;
        System.out.println("Общее время обработки, мс: " + fullTime);
        //System.out.println(a21);

    }

}
