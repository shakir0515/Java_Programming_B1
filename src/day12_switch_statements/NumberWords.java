package day12_switch_statements;

public class NumberWords {
    public static void main(String[] args) {
        int num = 3;

        // else if statement
        if (num == 1) {
            System.out.println("One");
        } else if (num == 2) {
            System.out.println("Two");
        } else if (num == 3) {
            System.out.println("Three");
        } else if (num == 4) {
            System.out.println("Four");
        } else if (num == 5) {
            System.out.println("Five");
        } else {
            System.out.println("Invalid input");
        }

        System.out.println("---------------------------------");
        //switch statement


        switch (num){  // String, int, byte, short, char

            case 1: // if
                System.out.println("One");
                break;
            case 3: // else if
                System.out.println("Two");
                break;
            case 2:  // else if
                System.out.println("Three");
                break;
            case 4:  // else if
                System.out.println("Four");
                break;
            case 5:  // else if
                System.out.println("Five");

                break;
            default:  // else
                System.out.println("Invalid number");


        }}
}
