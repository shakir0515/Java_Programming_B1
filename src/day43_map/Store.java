package day43_map;

import java.util.HashMap;
import java.util.Map;

public class Store {
    public static void main(String[] args) {
        // create a map that accepts String as key double as value
        Map <String, Double> map = new HashMap<>();
        map.put("Water", 1.5);
        map.put("Coffee", 2.5);
        map.put("Apples", 0.99);
        map.put("Bread", 2.35);
        map.put("Cucumber", 3.89);

        // Can you print the inventory
        /*
        Store inventory:
        Item: Water for 1.5
        .
        .
        .*/

        for (Map.Entry<String, Double> eachRow : map.entrySet()) {
            System.out.println("\t"+eachRow.getKey() + " for $" + eachRow.getValue());
        }


        System.out.println();
        // Can you print all the values?
        System.out.println("Values: " + map.values());

    }
}
