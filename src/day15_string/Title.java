package day15_string;

import java.util.Scanner;
// Mr.
public class Title {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name with titles: ");

        String nameAndTitle = input.nextLine();

        //nameAndTitle = nameAndTitle.toLowerCase();

        /*
           if (nameAndTitle.startsWith("mr") || nameAndTitle.startsWith("mister")) {
            System.out.println("Hello Sir");
        } else if (nameAndTitle.startsWith("ms") || nameAndTitle.startsWith("madam")) {
            System.out.println("Hello Ma'am");
        } else if (nameAndTitle.startsWith("dr") || nameAndTitle.startsWith("doctor")) {
            System.out.println("Hello Doctor");
        }
         */


        nameAndTitle = nameAndTitle.toLowerCase();



        if (nameAndTitle.startsWith("mr") || nameAndTitle.startsWith("mister")) {
            System.out.println("Hello Sir");
        } else if (nameAndTitle.startsWith("ms") || nameAndTitle.startsWith("madam")) {
            System.out.println("Hello Ma'am");
        } else if (nameAndTitle.startsWith("dr") || nameAndTitle.startsWith("doctor")) {
            System.out.println("Hello Doctor");
        }



        if (nameAndTitle.endsWith("jr")) {
            System.out.println("Hello Junior");
        } else if  (nameAndTitle.endsWith("sr")){
            System.out.println("Hello Senior");
        }











    }
}
