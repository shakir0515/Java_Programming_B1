package day09_b__if_statements;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        // Create a SCanner object
        Scanner input = new Scanner(System.in);
        System.out.print("what is your balance? ");
        double balance = input.nextDouble();
        System.out.print("How much do you want to withdraw? ");
        double withdraw = input.nextDouble();
        //balance = balance - withdraw;
       balance -= withdraw;
        if (balance<withdraw) {
            System.out.println("You cannot withdraw cause balance cannot be less than 0");
        }else {
            System.out.println("Your new balance is "+ balance);
        }
       // System.out.println();
    //    System.out.println("New balance is: " + balance);




    }
}
