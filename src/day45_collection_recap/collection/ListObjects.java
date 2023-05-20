package day45_collection_recap.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListObjects {
    public static void main(String[] args) {
        List <String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        list1.add("d");
        list1.add(null);                // accepts null
        list1.add("a");                 // can have duplicates
        System.out.println(list1);      // insertion order kept



        List <String> list2 = new LinkedList<>();
        list2.add("a");
        list2.add("b");
        list2.add("c");
        list2.add("d");
        list2.add(null);                // accepts null
        list2.add("a");                 // can have duplicates
        System.out.println(list2);      // insertion order kept



        List <String> list3 = new Vector<>();
        list3.add("a");
        list3.add("b");
        list3.add("c");
        list3.add("d");
        list3.add(null);                // accepts null
        list3.add("a");                 // can have duplicates
        System.out.println(list3);      // insertion order kept
    }
}
