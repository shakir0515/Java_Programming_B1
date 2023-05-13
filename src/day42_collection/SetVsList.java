package day42_collection;

import java.util.*;

public class SetVsList {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(5);
        list.add(7);
        list.add(33);
        list.add(-4);
        list.add(20);
//        list.add(null);
//        list.add(null);
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(list.size()-1));


        System.out.println("-----------------------");

        Set <Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(5);
        set.add(7);
        set.add(33);
        set.add(-4);
        set.add(20);
//        set.add(null);
//        set.add(null);
        // System.out.println(set);
        // System.out.println(list.get(list.size()-1));
        // Since SET interface does NOT work with indexes we canNOT use get method like this.

        System.out.println("-----\\/-----");
        for (Integer each : set) {
            if (each == 20) {
                System.out.println(each);
            }
        }


        // sort the HashSet
        System.out.println(new TreeSet<>(set));

        // convert the list to set -- removed the duplicates.
        System.out.println(new LinkedHashSet<>(list));


        /*
            Q:  you have numbers: 1, 5, 2, 1, 4, 2, 5, 1
                take these numbers and remove the duplicates.
         */
        System.out.println(new HashSet<>(Arrays.asList(1, 5, 2, 1, 4, 2, 5, 1)));
        // as List method return List Type, which can have the reference of the interface of the Collection interface, we are able to make an object of HashSet with these initial values.

        Set <Integer>  set2 = new HashSet<>(Arrays.asList(1, 5, 2, 1, 4, 2, 5, 1));


        List <Integer> listInt = new ArrayList<>(Arrays.asList(1, 5, 2, 1, 4, 2, 5, 1));
        List <Integer> listNoDup = new ArrayList<>(set2);

        System.out.println(new TreeSet<>(set2));




    }
}
