package org.example;

import java.util.Arrays;
import java.util.Random;

public class ArraySort {

    public static void main(String[] args) {

        int[] numArray = generateRandomInts(12);

        System.out.println("Original Array: " + Arrays.toString(numArray));

        Arrays.sort(numArray);
        System.out.println("Sorted Array: " + Arrays.toString(numArray));
    }

    public static int[] generateRandomInts(int length) {
        Random random = new Random();

        int[] outArray = new int[length];

        for (int i=0; i<length; i++) {
            outArray[i] = random.nextInt(100);
        }
        return outArray;
    }
}
