package day09_a__scanner;

import java.util.Scanner;
/*
    Write a program that asks the user to enter 3 angle numbers ( can be double numbers )
    Determine if the angles make a triangle, which means the angles add to 180.0 */
public class Angles {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter 3 angle numbers");
        double numOne = input.nextDouble(),
                numTwo = input.nextDouble(),
                numThree = input.nextDouble();
        // triangle total degree 180
        // Calculate what is the total of three numbers
        double total = numOne + numTwo + numThree;
        // write a print statement prints if it is triangle
        System.out.println("It is triangle: "+  (total == 180) );
        // write a print statement prints if it is circle
        System.out.println("It is circle: " + (total == 360) );

        // write a print statement prints if it is either triangle or circle
        System.out.println("It is either triangle or circle " + (total == 180 || total == 360));  // |

    }


}
