package day41_collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListObjects {
    public static void main(String[] args) {


        ArrayList <String> list = new ArrayList<>(); // itself is reference
        List <String> list1 = new ArrayList<>(); // interface is reference
                                             // reference is list interface but object is arraylist class
        list1.add("a"); //0
        list1.add("b"); //1
        list1.add("c");
        list1.add("d");
        list1.add(null);
        list1.add("a");  //ArrayList accepts duplicates
        System.out.println(list1);
        System.out.println(list1.get(2));

        List <String> list2 = new LinkedList<>(); // interface is reference
        // reference is list interface but object is Linkedlist class
        list2.add("a"); // 0
        list2.add("b"); //1
        list2.add("c");
        list2.add("d");
        list2.add(null);
        list2.add("a");  //LinkedList accepts duplicates
        System.out.println(list2);
        System.out.println(list2.get(2));

        List <String> list3 = new Vector<>(); // interface is reference
        // reference is list interface but object is Vector class
        list3.add("a"); // 0
        list3.add("b"); //1
        list3.add("c");
        list3.add("d");
        list3.add(null);
        list3.add("a");
        System.out.println(list3);
        System.out.println(list2.get(2));





    }
}
