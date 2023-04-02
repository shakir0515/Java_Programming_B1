package day17_loops;

import java.util.Scanner;

/*
       ask user guess a number 1-100

          check number if lower than my guessed number --> it is too loo

          check number if higher than my guessed number --> it is too high

          if it is correct guess --- > end the loop and print "You guessed correctly.

      */
public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ourSecretNum = 34;
        int guessNumber;


        do {
            System.out.println("Guess a number 1 - 100 to find what is in my mind");
            guessNumber = input.nextInt();

            if (guessNumber < ourSecretNum) {
                System.out.println("its too low");
            } else if (guessNumber > ourSecretNum) {
                System.out.println("its too high");
            }

        } while (guessNumber != ourSecretNum);
        System.out.println("You guessed the correct number which is " + ourSecretNum);




    }
}
