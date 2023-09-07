package org.example;

public class ContainsVowel {

    public static void main(String[] args) {
//        String inputStr = "zzzzzzzzz   xxxxxxx bbbbb cccc";

        String inputStr = "this is the input String";
//        if (containsVowel(inputStr)) {
        if (stringContainsVowels(inputStr)) {
            System.out.println("This inputString contains a vowel.");
        } else {
            System.out.println("This inputString does not contain a vowel.");
        }
    }

    public static boolean containsVowel(String input) {

        char[] chars = input.toCharArray();

        String[] stringofChars = input.split("");

        String[] vowels = {"a", "e", "i", "o", "u"};

        boolean vowelPresent = false;

        for (char a : chars) {
            for (String b : vowels) {
                if (a == b.toCharArray()[0])
                    vowelPresent = true;
            }
        }
        return vowelPresent;
    }

    public static boolean stringContainsVowels(String input) {
//        return input.toLowerCase().matches(".*[aeiou.*]");
        return input.toLowerCase().matches(".*[aeiou].*");
    }
}
