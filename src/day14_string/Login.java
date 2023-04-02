package day14_string;

import java.util.Scanner;

public class Login {

    /*  Ask the user to enter a username
        make sure the username is in lowercase

        Ask the user to enter a password
        check if the password is more than 8 characters long

        valid system username: "loopcamp"

        -> if the entered password matches the system password
            logged in
            otherwise print:
    invalid password*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your username: ");
        String userName = input.next();
        userName = userName.toLowerCase();
        System.out.println("Please enter the password: ");
        String password = input.next();
        int passwordLength = password.length();
        System.out.println(passwordLength);

        if (passwordLength>= 8 && userName.equals("loopcamp")){
            System.out.println("You are logged in as " + userName);
        } else {
            if (passwordLength<8) {
                System.out.println("Password length does not match");
            } if (!userName.equals("loopcamp")){
                System.out.println("Invalid");
            }
        }
    }
}
