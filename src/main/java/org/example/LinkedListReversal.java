package org.example;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListReversal {

    // 13. How do you reverse a linked list in Java?

    // looks like there are two ways to accomplish this.  There is the 'descendingIterator'
    // and there is the 'listIterator'
    //
    // see this page for more information:  https://www.geeksforgeeks.org/iterate-a-linkedlist-in-reverse-order-in-java/#

    public static void main(String[] args) {

        LinkedList<String> linkedWords = new LinkedList<>();

        linkedWords.add("Alpha");
        linkedWords.add("Bravo");
        linkedWords.add("Charlie");
        linkedWords.add("Delta");

        System.out.println("Original LinkedWords: " + linkedWords);

        System.out.println("Reversed LinkedWords: " + reverseString(linkedWords));

    }

    public static String reverseString(LinkedList<String> input) {

        StringBuilder sb = new StringBuilder();

        Iterator<String> iterator = input.descendingIterator();

        while (iterator.hasNext()) {
            sb.append(iterator.next());
        }

       return sb.toString();
    }
}
