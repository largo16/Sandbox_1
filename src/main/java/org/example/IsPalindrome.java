package org.example;

public class IsPalindrome {

    // Question number 7:  How do you check whether a string is a palindrome in Java?

    // caveats
    // Spaces are irrelevant
    // Letter case is irrelevant
    public static void main(String[] args) {

//        String inputString = "Taco cat";
        String inputString = "Go deliver a dare vile dog";


        if (isPalindrome(inputString)) {
            System.out.println("This string is a palindrome!");
        } else {
            System.out.println("This string is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String input) {
        String cleanString = input.toLowerCase().replace(" ", "");

        char[] charArray = cleanString.toCharArray();

        for( int i=0; i < charArray.length; i++) {
            if(charArray[i] != charArray[charArray.length-1-i]) {
                return false;
            }
        }
        return true;
    }
}
