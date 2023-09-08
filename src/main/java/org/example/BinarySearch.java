package org.example;

import java.util.Arrays;
import java.util.Random;

public class BinarySearch {

    // 14. How do you implement a binary search in Java?

    // something is a little wrong with my implementation of birarySearch
    public static void main(String[] args) {

        int length = 24;
        int searchInt = 80;
        int[] inputChars = generateRandomInts(length);

        System.out.println("Searching for: " + searchInt);
        System.out.println("Original array: " + Arrays.toString(inputChars));

        // sort the array
        Arrays.sort(inputChars);

        System.out.println("Sorted array: " + Arrays.toString(inputChars));

//        int result = binarySearch(inputChars, searchInt);
        int result = anotherBinarySearch(inputChars, 0, inputChars.length, searchInt);

        switch (result) {
            case 0:
                System.out.println(searchInt + " was found in the array.");
                break;
            case -1:
                System.out.println(searchInt + " was not found in the array.");
                break;
            default:
                System.out.println("Something unexpected has happened!");
        }

    }

    public static int binarySearch(int[] inputArray, int searchInt) {
        // inputArray is the sorted array in integers

        int mid = inputArray.length / 2;
        if (mid == 0) return -1;

        int result = Integer.compare(inputArray[mid], searchInt);

        if (result > 0) {
            // search the lower half of the array
            int[] newArray = Arrays.copyOfRange(inputArray, 0, mid);
            binarySearch(newArray, searchInt);

        } else if (result < 0) {
            // search the upper half of the array
            int[] newArray = Arrays.copyOfRange(inputArray, mid, inputArray.length);
            binarySearch(newArray, searchInt);

        } else {
            System.out.println("Did we find the integer for which we were looking?");
            return 0;
        }
        return -1;
    }

    public static int anotherBinarySearch(int[] arr, int low, int high, int key) {
        int mid = (low + high) / 2;

        while (low <= high) {
            if (arr[mid] < key) {
                low = mid + 1;
            } else if (arr[mid] == key) {
                return mid;
            } else {
                high = mid - 1;
            }
            mid = ( low + high) / 2;
        }
        if (low > high) {
            return -1;
        }
        return -1;
    }

    public static int[] generateRandomInts(int length) {
        Random random = new Random();

        int[] outArray = new int[length];
        for (int i=0; i < length; i++) {
            outArray[i] = random.nextInt( 100 );
        }

        return outArray;
    }
}
