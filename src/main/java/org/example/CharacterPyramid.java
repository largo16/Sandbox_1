package org.example;

import java.util.Arrays;

public class CharacterPyramid {

    // 16. Can you create a pyramid of characters in Java?

    public static void main(String[] args) {

        int counter = 0;
        int rows = 16;

        for (; counter < rows; counter++) {
            rowPrint(counter, rows);
        }

    }

    public static void rowPrint(int counter, int max) {
        char[] stars = new char[counter];
        Arrays.fill(stars, '*');

        char[] blanks = new char[(max - counter)/2];
        Arrays.fill(blanks, ' ');

        char[] result = new char[stars.length + blanks.length];

        System.arraycopy(blanks, 0, result, 0, blanks.length);
        System.arraycopy(stars, 0, result, blanks.length, stars.length);


        System.out.println(result);
    }

}
