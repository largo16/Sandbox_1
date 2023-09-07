package org.example;

public class App2 {

    /**
     *  this is a simple coding interview problem where you are asked to count all the occurrences of a
     *  specific letter within a string.  the craft way is to remove the character in question and just
     *  use the string.length() to do the work.
     */
    public static void main( String[] args ) {

        String aString = "this is the sting from which we started";

        int result = aString.length() - aString.replaceAll("i", "").length();
        System.out.println("result is: " + result);


    }

}
