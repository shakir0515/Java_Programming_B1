package day45_collection_recap;

import java.util.HashMap;
import java.util.Map;

public class MapSalary {
    public static void main(String[] args) {
        // Create a hashmap (String, Double)and add key-values
        Map<String, Double> map = new HashMap<>();
        map.put("James", 70_000.0);   // put() acts same as the add() method
        map.put("Gosling", 124_000.0); // map.get("Gosling"); --- > 124_000.00 --- > double
        map.put("Tom", 140_000.0);
        map.put("Jerry", 121_000.0);
        map.put("Vinnie", 139_000.0);

        // Can I change it to TreeMap?
        // We can change it but the sorting will happen based on the KEYS, which will not help us

        // Can I change it to TreeSet?
        // For this we need to loop though and add all the salaries into one of the Collection (especially the TreeSet and get the last one)

        // Can you find the MAX and MIN salary from the map?
        // Can you find the MAX and MIN salary and print their names?


        double maxSalary = 0.0;  // Double.MIN_VALUE;
        double minSalary = Double.MAX_VALUE;    // How can we get the Mx number that the double can hold?
        String nameForLowest = "";
        String nameForHighest = "";

        // Loop through
        // By looping through the values ONLY, can I also find the name of the max and min?
        // By looping through only values, will help us to work JUST with the values
        for (Double each : map.values()) {

        }


        // The get access to keys and the values for this task, we can iterate through KEYS
        for (String eachKey : map.keySet()) {

            //How do I get the value for the given KEY
            Double value = map.get(eachKey);   // we use this get method to read the value by the key

            if (value > maxSalary ) {
                maxSalary = value;
                nameForHighest = eachKey;
            }

            if (value < minSalary) {
                minSalary = value;
                nameForLowest = eachKey;
            }

        }


        System.out.println("Name for lowest = " + nameForLowest +
                "\nLowest salary = " + minSalary);
        System.out.println("Name for highest = " + nameForHighest +
                "\nHighest Salary = " + maxSalary);


        System.out.println();
        // Can you print the salary and the name for those whose salary is over 120_000.00 and add %10 into their salary before printing
        double salary = 120_000.00;
        for (Map.Entry<String, Double> eachEntry : map.entrySet()) {
            if (eachEntry.getValue() > salary) {
                System.out.println("Name:" + eachEntry.getKey());
                System.out.println("\tSalary: " + eachEntry.getValue());
                System.out.println("\tAfter Increase Salary: " + eachEntry.getValue()*1.1);
                System.out.println();
            }
        }


        // Can you update the salary for each person to be %20 increased.
        // Option 1
        for (String eachKey : map.keySet()) {
            map.put(eachKey, map.get(eachKey)*1.2);
        }

        // Option 2
        for (Map.Entry<String, Double> each : map.entrySet()) {
            map.put(each.getKey(), each.getValue()*1.2);
        }
    }
}
