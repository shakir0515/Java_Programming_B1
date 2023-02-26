package day08_scanner_logical_operators;

import java.util.Scanner;

public class WorkStatus {
/*  create Scanner object
        ask the user to enter their first name - next
        ask the user to enter their last name - next
        ask the user if they are employed - boolean
        ask the user if they are a student - boolean */
public static void main(String[] args) {
    Scanner input =  new Scanner(System.in);
    System.out.print("Enter your first name: ");
    String firstName = input.next();

    System.out.println("First name:\t" + firstName);


}


}
