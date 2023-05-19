package day44_map;

import javax.swing.plaf.PanelUI;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
* People
*
* First_NAme:James
* LASt NAme: GAsling
* Batch: 1
*
*
* */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataBaseExample {
    public static void main(String[] args) {

        /*
            People

                FIRST_NAME: James
                LAST_NAME: GOSLING
                BATCH: 1
         */

        Map <String, String> people = new HashMap<>();
        people.put("FIRST_NAME", "James");
        people.put("LAST_NAME", "Gosling");
        people.put("BATCH", "1");


        Map <String, String> people2 = new HashMap<>();
        people2.put("FIRST_NAME", "Nazakat");
        people2.put("LAST_NAME", "Hanifayeva");
        people2.put("BATCH", "1");


        Map <String, String> people3 = new HashMap<>();
        people3.put("FIRST_NAME", "Vlad");
        people3.put("LAST_NAME", "Ilin");
        people3.put("BATCH", "1");



        // Can I store all this map of people into List, or Set ?


        Map<String, String> stringStringMap = makeMap("Nazakat", "Hanifayeva", "1");
        Map<String, String> stringStringMap2 = makeMap("Vlad", "Ilin", "2");
        Map<String, String> stringStringMap3 = makeMap("Gunel", "Baghishova", "4");
        Map<String, String> stringStringMap4 = makeMap("Nurdan ", "Erdogan", "6");


        List<     Map <String, String>        > list = new ArrayList<>();
        list.add(stringStringMap);
        list.add(stringStringMap2);
        list.add(stringStringMap3);
        list.add(stringStringMap4);

        list.add(  makeMap("Natalia", "Liubchenko", "1")  );


        //Can you get me from the list, the first person's FIRST_NAME?
        System.out.println( list.get(0).get("FIRST_NAME")   );
        System.out.println( list.get(0).get("LAST_NAME")   );


        System.out.println();
        // Go through the ArrayList of Map elements - print all information for each person.
        for (Map<String, String> each : list) {
            System.out.println(each);
        }


        System.out.println();
        // Go through the ArrayList of Map -- print all the First names
        for (Map<String, String> each : list) {
            System.out.println(each.get("FIRST_NAME"));
        }


        System.out.println();
        // Go through the ArrayList of Map -- print all people information whose batch is equal or less than 4
        for (Map<String, String> each : list) {
            // "4" <= 4  ----> 4 <= 4
            if (Integer.parseInt(each.get("BATCH")) <= 4) {
                System.out.println(each);
            }

        }

    }


    // Create a method that accepts an array of String and return a Map
    public static Map <String, String> makeMap (String ... arr) {  // Varargs -- >  accepts an array. When the method is called we can give values directly.
        Map <String, String> map = new HashMap<>();
        map.put("FIRST_NAME", arr[0]);  // Nazakat
        map.put("LAST_NAME", arr[1]);   // Hanifayeva
        map.put("BATCH", arr[2]);      // 1

        return map;
    }

}