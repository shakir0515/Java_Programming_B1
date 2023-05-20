package day45_collection_recap.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetObjects {
    public static void main(String[] args) {
        Set <String> set1 = new HashSet<>();
        set1.add(null);             // accepts null
        set1.add("a");
        set1.add("b");
        set1.add("&");
        set1.add("d");
        set1.add("a");              // No duplicates
        System.out.println(set1);   // Insertion order not guaranteed




        Set <String> set2 = new LinkedHashSet<>();
        set2.add(null);             // accepts null
        set2.add("a");
        set2.add("!");
        set2.add("&");
        set2.add("d");
        set2.add("a");              // No duplicates
        System.out.println(set2);   // Insertion order not guaranteed




        Set<String> set3 = new TreeSet<>();
        //set3.add(null);             // Does NOT accepts null
        set3.add("a");
        set3.add("!");
        set3.add("&");
        set3.add("f");
        set3.add("a");              // No duplicates
        set3.add("d");
        System.out.println(set3);   // Order is sorted









    }
}
