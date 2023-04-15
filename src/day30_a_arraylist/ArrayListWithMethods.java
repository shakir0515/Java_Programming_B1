package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListWithMethods {
    // make a method that accepts ArrayList and return the list (String)
    public static String getList (ArrayList <String> list) {
        /*
            LIST:
                apple
                banana
         */

        String finalList = "LIST: ";

        for ( String each : list ) {
            finalList += "\n\t" + each;
        }
        return finalList;
    }

    // make a method that accepts a number and prints the day of the week
    public static void printDayOfWeek (int numDay){  // 1

        ArrayList <String> daysOfWeek = new ArrayList<>(Arrays.asList(
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"));

        if (numDay >= 1 && numDay <= 7) {
            System.out.println(daysOfWeek.get(numDay-1));
        } else {
            System.out.println(numDay + " is not in the range of 1-7");
        }

    }



    // use the main method to call those two methods
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>(Arrays.asList("apple", "bread", "water", "butter"));
        System.out.println(getList(list));

        printDayOfWeek(10);
    }
}
