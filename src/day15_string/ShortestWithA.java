package day15_string;

import java.util.Scanner;

public class ShortestWithA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 words: ");
        String wordOne = input.next();
        String wordTwo = input.next();
        String wordThree = input.next();
        int wordOneLength =wordOne.length(), wordTwoLength = wordTwo.length(), wordThreeLength = wordThree.length();

        if (wordOne.contains("a") && (wordOneLength <= wordTwoLength && wordOneLength <= wordThreeLength ) ){
            System.out.println(wordOne + " is the smallest with \"a\"");
        } else if (wordTwo.contains("a") && (wordTwoLength <= wordOneLength && wordTwoLength <= wordThreeLength ) ){
            System.out.println(wordTwo + " is the smallest with \"a\"");
        } else if (wordThree.contains("a") && (wordThreeLength <= wordOneLength && wordThreeLength <= wordTwoLength ) ){
            System.out.println(wordThree + " is the smallest with \"a\"");
        } else {
            System.out.println("No single smallest word with \"a\"");
        }

    }
}
