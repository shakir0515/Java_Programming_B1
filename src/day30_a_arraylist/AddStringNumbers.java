package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

/*
    Input:
    “123”, “34”, “513”
    Output:
    [ 6, 7, 9 ]
 */
public class AddStringNumbers {
    public static ArrayList <Integer> addNums (ArrayList <String> list){
        ArrayList <Integer> listOfSums = new ArrayList<>();
        for (String each: list) {
            int sumOfEach = 0;
            for (String every: each.split("")) {
                sumOfEach += Integer.parseInt(every);
            }
            listOfSums.add(sumOfEach);

        }
        return listOfSums;
    }

    public static void main(String[] args) {
        System.out.println(addNums(new ArrayList<>(Arrays.asList("123", "34", "513"))));
    }

}
