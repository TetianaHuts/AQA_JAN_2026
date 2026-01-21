package org.prog.session3;

import java.util.Random;

public class HomeWork3 {
    public static void main (String[] args) {
        System.out.println("Random array");
        int[] array = new int[10];
            Random random = new Random();
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(100);
                System.out.println("i = " + array [i]);
            }
System.out.println("Bubble Sort");
        boolean condition = true;

        while (condition) {
            condition = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int current = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = current;
                    condition = true;


                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print("i = " + array[i] + ",");


        }
    }
}


