package org.prog.session3;

import java.util.Random;

public class GeminiExercise {
    public static void main (String[] args) {
        System.out.println("Random array");
        int[] array = new int [20];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.println("i = " + array[i]);
        }
        System.out.println("Max int");
        int max = array[0];
        int maxIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;

            }
        }
        System.out.println(max);

        System.out.println("Четное");
        int evenCount = 0;
        int nonCount = 0;
        for (int element : array) {
            if (element % 2 == 0) {
                evenCount++;
            }
            else {
                nonCount++;
            }
            System.out.println("+" + evenCount);
            System.out.println("-" + nonCount);
        }
        System.out.println("Last");
        int countBig = 0;
        for ( int element : array) {
            if (element > 50) {
                countBig++;
            }

        }
            System.out.println(countBig);

            int[] filteredArray = new int[countBig];
            int j = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] > 50) {
                    filteredArray[j] = array[i];
                    j++;
                }
            }
            System.out.println("Новый отфильтрованный массив:");
            for (int num : filteredArray) {
                System.out.print(num + " ");
            }

        }

    }

