package org.example;

import java.util.HashMap;
import java.util.Map;

/**
 * This is simple interview coding problem where you are asked to count the number of occurrences in the string
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String aString = "Let the be peace peace peace and freedom in the freedom land.";
        System.out.println("Debug: aString - " + aString);

        Map<String, Integer> map = new HashMap<String, Integer>();
        Integer count = 1;

        String[] words = removePunctuations(aString).split(" ");
        for( String word : words) {
            if(map.containsKey(word)) {
                map.put(word, map.get(word).intValue() + 1);
            } else {
                map.put(word, count);
            }
        }

        // show the output
        for (String word: map.keySet()) {
            System.out.println(word + " " + map.get(word));

        }
    }

    public static String removePunctuations(String source) {
        return source.replaceAll("\\p{Punct}", "");
    }
}
