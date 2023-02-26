package day07_relational_operators;

public class SignType {
    /* Declare and assign a number

        I want to know the sing of the number
            if the number is positive
            if the number is negative
            if the number is 0 */
    public static void main(String[] args)
    {
        int number = 0;

        boolean positive = number >=0, negative = number <=0, isZero = number == 0;
        System.out.println(number + " bigger than zero: " + positive);
        System.out.println(number + " is less than zero: " + negative);

    }
}
