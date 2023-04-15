package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SwitchPairs {
    public static ArrayList<String> swapt2(ArrayList<String> list) {
        ArrayList<String> switchedList = new ArrayList<>();

        for (int i = 0; i < list.size(); i += 2) {
            switchedList.add(list.get(i + 1));
            switchedList.add(list.get(i));
        }
        return switchedList;
    }

    public static ArrayList <String> swapt (ArrayList <String> list) {

        for (int i = 0; i < list.size(); i+=2) {
            Collections.swap(list, i, i+1);
        }

        return list;
    }


    public static void main(String[] args) {

        // create ArrayList of String
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Cat", "in", "the", "hat"));

        System.out.println(swapt2(list));
        System.out.println(swapt(list));


    }



}
