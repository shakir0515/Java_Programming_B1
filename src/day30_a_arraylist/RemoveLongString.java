package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLongString {
    //Create a method that accepts list of Strings and the int num and returns another list but the strings which are longer than the int number removed.

    public static ArrayList <String> keepShortStrings (ArrayList<String> list, int sizeToCheck){
//        This is another way you can do it.
//        ArrayList <String> newList = new ArrayList<>();
//        for ( String each : list) {
//            if (each.length() < sizeToCheck) {
//                newList.add(each);
//            }
//        }
//        return newList;


        list.removeIf(each -> each.length() > sizeToCheck);
        return list;

    }

    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five"));
        System.out.println(keepShortStrings(list, 3));
    }


    }



