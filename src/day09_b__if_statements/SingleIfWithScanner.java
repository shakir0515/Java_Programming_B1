package day09_b__if_statements;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class SingleIfWithScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Why are we studying java? ");
        String answer = input.nextLine();

        System.out.println("Is java fun? ");
        boolean answer2 = input.nextBoolean();
        if (answer2){
            System.out.println("Feyruz is really happy");
        }
if(!answer2) {
    System.out.println("Turn your cameras on time to be grilled");
}




    }
}
