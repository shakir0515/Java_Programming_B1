package day21_arrays;

import java.util.Scanner;

public class SelectMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a month number: ");
        int monthNum = input.nextInt();
        String [] allMonth = {"January", "February", "March", "Aprel", "May", "June", "July", "August", "September", "October", "November", "December"};
        System.out.println("The number you entered represents: " + allMonth[monthNum-1]);




    }
}
