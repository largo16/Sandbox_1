package org.example;

import java.util.Arrays;

public class FibonacciNumbers {

    public static void main(String[] args) {

        int sequenceLength = 12;

        int[] fiboInts = createFiboSequenceForLoop(sequenceLength);

        System.out.println(Arrays.toString(fiboInts));

        int[] startArray = {0, 1};

        int[] moreFiboInts = createFiboSequenceRecursion(startArray, sequenceLength);

        System.out.println(Arrays.toString(moreFiboInts));

    }

    public static int[] createFiboSequenceForLoop(int length) {

        int[] fiboInts = new int[length];

        fiboInts[1] = 1;    // is this ok?  It was given in the setup info

        for(int i = 2; i < length; i++) {

            fiboInts[i] = fiboInts[i-2] + fiboInts[i-1];
        }

        return fiboInts;
    }

    public static int[] createFiboSequenceRecursion(int[] previousArray, int length) {

        int[] newArray = new int[previousArray.length + 1];

        while (previousArray.length < length) {

            for (int i = 0; i < previousArray.length; i++) {
                newArray[i] = previousArray[i];
            }
            newArray[previousArray.length] = previousArray[previousArray.length - 2]
                    + previousArray[previousArray.length - 1];

            createFiboSequenceRecursion( newArray, length );

        }

        return newArray;
    }
}
