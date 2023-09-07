package org.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OnlyOddNumbers {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays. asList( 2, 4, 6, 7, 10, 12, 16));

        for (Integer anInt : numbers) {
            if ((anInt % 2) != 0) {
                System.out.println("There is an odd number in this list!");
                return;
            }
        }

        System.out.println("There are no odd numbers in this list.");




    }
}
