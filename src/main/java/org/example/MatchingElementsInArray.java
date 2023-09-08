package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MatchingElementsInArray {

    // 17. Write Java program that checks if two arrays contain the same elements.
    public static void main(String[] args) {

        Integer[] a1 = {1, 2, 3, 2, 1};
        Integer[] a2 = {1, 2, 3};
        Integer[] a3 = {1, 2, 3, 4};

        System.out.println(sameElements(a1, a2));
        System.out.println(sameElements(a2, a3));

    }

    public static boolean sameElements(Object[] array1, Object[] array2) {

        // create hastSets to eliminate all duplications
        Set<Object> set1 = new HashSet<>(Arrays.asList(array1));
        Set<Object> set2 = new HashSet<>(Arrays.asList(array2));


        // create a combined set

        Set<Object> combinedSet = new HashSet<>();
        combinedSet.addAll(set1);
        combinedSet.addAll(set2);

        System.out.println("Combined set: " + combinedSet);

        for (Object element : combinedSet) {
            if(!set1.contains(element)) return false;
            if(!set2.contains(element)) return false;
        }

        return true;

    }
}
