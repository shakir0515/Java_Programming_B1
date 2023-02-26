package day09_a__scanner;

import java.util.Scanner;

public class UsingNext {
    public static void main(String[] args) {
        // Create a scanner object
        Scanner input = new Scanner(System.in);

        System.out.println("Today is Saturday");
        System.out.print("What is today's class? ");
String className = input.next();
        System.out.println();
        System.out.println("What month is it? ");
       String month = input.next();
        System.out.println();
        System.out.println("Enter your full name ");
        input.nextLine();

        System.out.println("Full name is ");


    }

}
