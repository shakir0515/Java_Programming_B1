package day45_collection_recap;

import java.util.Arrays;

/*    Task:
        - Create a method that will take any String of letters and numbers and sort each substring of numbers and letters
  Ex:
                Input:
                    "DC501GCCCA098911"
                OutPut:
                    "CD015ACCCG011899"

        - Think of the concept from Collection*/
public class SortNumAndLetter {

    public static void main(String[] args) {
        String beforeSorted = "DC501GCCCA098911";
        String afterSorted = sortedEachPart(beforeSorted);

        System.out.println(beforeSorted);
        System.out.println(afterSorted);
    }
    public static String sortedEachPart (String str) {
        String sub = "";
        String sortedStr = "";

        for (int i = 0; i < str.length(); i++) {   // DC   501   GCCCA  098911

            char current =  str.charAt(i);  // D --- > as char
            sub += current;   // D   ---- >  as String
            boolean toSort = false;


            // current char is LETTER AND my next char is LETTER
            // OR
            // current char is DIGIT AND next char is DIGIT


            if (i !=  str.length()-1) {
                char next = str.charAt(i+1);

                toSort = Character.isLetter(current) && !Character.isLetter(next) ||
                        Character.isDigit(current) && !Character.isDigit(next);
            } else {
                toSort = true;
            }


            if (toSort) {

                // add you sub variable in to an array with split(); method so we can use the Arrays.sort method to sort it.
                String [] sortArr = sub.split(""); // [D,  C]   -  [5, 0, 1]  - [G, C, C, C, A]
                Arrays.sort(sortArr);  // [C, D]   -   [0, 1, 5] ......



                // After sorting use the array method to put the Characters together
//                for (String s : sortArr) {
//                    sortedStr += s;
//                }

                // .join() method accepts to arguments. First argument is the one that goes between two element in the Array
                sortedStr += String.join("", sortArr);
                sub = "";

            }
        }


        return sortedStr;
    }
}
