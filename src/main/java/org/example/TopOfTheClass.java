package org.example;

import java.text.DecimalFormat;
import java.util.*;


public class TopOfTheClass {

    /**
     * Determine the four top students and return them as an array of Strings i.e.
     * ["David", "Nelly", "Jenny", "Bob"]
     * <p>
     * given the names and the scores in input arrays with the names and the corresponding
     * scores according to the order.
     * <p>
     * Names:
     * ["Bob", "Carl", "Jenny", "Clara", "Frank", "Billy", "David", "Paul"]
     * <p>
     * Scores:
     * [ 89.5, 68.4, 71.2, 89.4, 72.3, 83.3, 67.5, 92.1]
     * [ 67.6, 56.7, 45.7, 87.9, 86.6, 86.3, 98.4, 94.7]
     * [ 78.9, 67.8, 98.5, 86.6, 73.5, 76.9, 96.3, 99.0]
      */

    static List<String> nameList = Arrays.asList("Bob", "Carl", "Jenny", "Clara", "Frank", "Billy", "David", "Paul");
    static List<List<Double>> scoreLists = new ArrayList<>();

    static List<Double> scores1 = Arrays.asList( 89.5, 68.4, 71.2, 89.4, 72.3, 83.3, 67.5, 92.1);
    static List<Double> scores2 = Arrays.asList( 67.6, 56.7, 45.7, 87.9, 86.6, 86.3, 98.4, 94.7);
    static List<Double> scores3 = Arrays.asList( 78.9, 67.8, 98.5, 86.6, 73.5, 76.9, 96.3, 99.0);

    private static final DecimalFormat df = new DecimalFormat("0.00");



    public static void main(String[] args) {

        scoreLists.add(scores1);
        scoreLists.add(scores2);
        scoreLists.add(scores3);

        // put the data into a hashmap:  Name, AverageScore <- this done by a function CalculateAvgScore


        // calculate the AverageScore and place it into the map with the corresponding name
        Map<String, Double> scoreMap = new LinkedHashMap<>();
        int index = 0;
        for (String name : nameList) {
            scoreMap.put(name, calculateScore(scoreLists, index));
            index++;
        }

        // let's print this out to check what we've got

        System.out.println("Current result map: " + scoreMap);

        // sort the array based on the values in the map by moving it into an array list?

        ArrayList myArray = new ArrayList();

        transfer_elements(myArray, scoreMap);

        System.out.println("Current result array: " + myArray);

        sort_by_value(myArray);

        System.out.println("Sorted results array: " + myArray);

        scoreMap.clear();

        for (Object o : myArray) {
            Map.Entry<String, Double> anEntry = (Map.Entry<String, Double>) o;
            scoreMap.put(anEntry.getKey(), Double.valueOf(df.format(anEntry.getValue())));

        }

        System.out.println("Sorted result map: " + scoreMap);

        // Print out the top four students

        int count = 0;
        for (Object entry : scoreMap.keySet()) {
            if (count > 3) break;
            System.out.println(entry);
            count++;
        }


    }

    public static double calculateScore(List<List<Double>> scoreLists, int index) {

        double total = 0;
        int count = 0;
        for(List<Double> aList: scoreLists) {
            total += aList.get(index);
            count++;
        }

        return total/count;
    }

    public static ArrayList transfer_elements (ArrayList arrayList, Map<String, Double> hashMap) {

        for ( Map.Entry<String, Double> entry : hashMap.entrySet()) {
            arrayList.add(entry);

        }
        return arrayList;
    }

    public static ArrayList sort_by_value(ArrayList arrayList) {

        Collections.sort(arrayList, Collections.reverseOrder( new reverseComp() ));
//        Collections.sort(arrayList, new reverseComp());
        return arrayList;
    }

    public static class reverseComp implements Comparator<Map.Entry<String, Double>> {

        @Override
        public int compare(Map.Entry<String, Double> o1, Map.Entry<String, Double> o2) {
            return ((Map.Entry<String, Double>) o1).getValue()
                    .compareTo(((Map.Entry<String, Double>) o2).getValue());
        }
    }


}
