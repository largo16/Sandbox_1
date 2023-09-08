package org.example;

public class Factorial {

    // 12. How can you find the factorial of an integer in Java?

    public static void main(String[] args) {

        int input = 6;

        System.out.println("Starting integer: " + input);

        int result = calculateFactorial(input);

        System.out.println("Factorial result: " + result);
    }

    public static int calculateFactorial(int input) {
        if (input == 1)
            return 1;

        return input * calculateFactorial( input - 1);
    }
}
