package org.example;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class NumberSwap {

    public static void main(String[] args) {

        int numberOne = 42;
        int numberTwo = 28;
        System.out.println("Prior to swap...");
        System.out.println("numberOne: " + numberOne + "  numberTwo: " + numberTwo);

        numberTwo = numberOne + numberTwo;
        numberOne = numberTwo - numberOne;
        numberTwo = numberTwo - numberOne;

        System.out.println("After swap...");
        System.out.println("numberOne: " + numberOne + "  numberTwo: " + numberTwo);


    }
}
