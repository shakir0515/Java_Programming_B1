package day11_if_statements;

import java.util.Scanner;

/* ask a number from user:
if 1<number<10 check
if it is even or odd.
else number is not in the range
 */
public class NestedExample {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        if (number >= 0 && number <= 0){
if (number % 2 == 0){
    System.out.println("even");
} else {
    System.out.println("ODD");
}
        }else {
            System.out.println("The number is not in the range");
        }






    }




}
