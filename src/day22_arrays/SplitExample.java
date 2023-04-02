package day22_arrays;

import java.util.Arrays;

public class SplitExample {
    public static void main(String[] args) {
        String days = "monday, tuesday, wednesday, thursday, friday, saturday, sunday";
        // .split(" ay")

        int countWords = 0;
        for (int i = 0; i < days.length(); i++) {
            if (days.charAt(i) == ','){
                countWords++;
            }
        }
        System.out.println("Total words: " + (countWords+1));

        String [] dayArr = days.split(",");
        System.out.println(Arrays.toString(dayArr));

        String [] dayArr1 = days.split(", ");
        System.out.println(Arrays.toString(dayArr1));

        String [] dayArr2 = days.split(" ");
        System.out.println(Arrays.toString(dayArr2));

        System.out.println("--------------");
        String [] dayArr3 = days.split("ay ");
        System.out.println(Arrays.toString(dayArr3));
        System.out.println(dayArr3.length);  // 1
        System.out.println("--------------");


        String [] dayArr4 = days.split("wednesday");
        System.out.println(dayArr3.length);  //
        System.out.println(Arrays.toString(dayArr4));


        System.out.println("-----------------------------");
        String [] dayArr5 = days.split("");
        System.out.println(Arrays.toString(dayArr5));
    }
}
