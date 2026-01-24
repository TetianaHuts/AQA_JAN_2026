package org.prog.session3;

import java.util.Random;

public class NotHM {
    public static void main(String[] args) {
        System.out.println("Random array");
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
            System.out.println("i = " + array[i]);
        }
        System.out.println("Sort \"For\"");
        for (int i = 0; i < array.length;) {
            if (i != 0 && array[i] < array[i - 1]) {
                int current = array[i];
                array[i] = array[i - 1];
                array[i - 1] = current;
                i--;
            } else {
                i++;
            }
        }
        for (int element : array) {
            System.out.println(element + "");
        }

        System.out.println("New random array");
        int b;
        for ( b = 0; b < array.length; b++) {
            array [b] = random.nextInt(100);
            System.out.println("i = " + array [b]);}

        System.out.println("Sort \"While\"");
        b = 0;
        while ( b < array.length){
            if (b != 0 && array[b] < array[b - 1]){
                int current = array[b];
                array[b] = array[b - 1];
                array[b - 1] = current;
                b--;
            }
            else {
                b++;
            }
        } for (b = 0; b < array.length; b++) {
            System.out.println(array[b]);
        }
    }
}
