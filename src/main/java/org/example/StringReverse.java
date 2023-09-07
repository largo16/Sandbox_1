package org.example;

public class StringReverse {

    public static void main(String[] args) {

        String input = "This is the input string!";

        System.out.println("Input string: " + input);

        System.out.println("Reversed string: " + reverseString(input));

    }

    public static String reverseString(String input){
        char[] charArray = input.toCharArray();

        StringBuilder sb = new StringBuilder();

        for (int i = charArray.length-1; i >= 0 ; i-- ) {

            sb.append(charArray[i]);
        }

        return sb.toString();
    }
}
