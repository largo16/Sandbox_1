package org.example;

public class RemoveTrailSpaces {

    public static void main(String[] args) {

        String inputString2 = "       Go open a window if you can not stand the smell    ";
        System.out.println();

        String outputString = removeLeadingTrailingSpace(inputString2);

        System.out.println("Input string: " + inputString2);

        System.out.println("Output string: " + outputString);
    }

    public static String removeLeadingTrailingSpace(String input) {

        return input.replaceAll("^\\s+", "").replaceAll("\\s+$", "");
    }
}
