package day08_scanner_logical_operators;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
        String name = "Tommy";
        System.out.println("My name is " + name);
        System.out.println("\n\n");

        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println("You have entered: " + number);


    }



}
