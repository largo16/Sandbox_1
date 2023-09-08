package org.example;

public class RemoveWhitespace {

    // 9. How do you remove leading and trailing spaces from a string in Java?
    public static void main(String[] args) {
        String inputString = "Go deliver a dare vile dog";

        String outputString = removeWhitespace1(inputString);

        System.out.println("String with whitespace: " + inputString);

        System.out.println("String without whitespace: " + outputString);

        String inputString2 = "Go open a window if you can not stand the smell";
        System.out.println();

        outputString = removeWhitespace2(inputString2);

        System.out.println("String with whitespace: " + inputString);

        System.out.println("String without whitespace: " + outputString);

    }

    public static String removeWhitespace1(String input) {

        return input.replace(" ", "");

    }

    public static String removeWhitespace2(String input) {
        StringBuilder outString = new StringBuilder();

        char[] outputChars = input.toCharArray();

        for(char aChar : outputChars) {
            if(!Character.isWhitespace(aChar))
                outString.append(aChar);
        }

        return outString.toString();
    }
}
