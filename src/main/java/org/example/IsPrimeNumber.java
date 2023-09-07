package org.example;

public class IsPrimeNumber {

    public static void main(String[] args) {
        int number = 97;

        if (isPrimeNumber(number)) {
            System.out.println("The number " + number + " is prime.");
        } else {
            System.out.println(number + " is not prime.");
        }
    }

    public static boolean isPrimeNumber(int number) {

        boolean isPrime = true;

        for (int n = number/2; n > 1; n--) {
            if (number % (number / n) == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }
}
