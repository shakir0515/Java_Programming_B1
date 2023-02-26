package day07_relational_operators;

public class AgeGroup {


    public static void main(String[] args) {
       /* declare and assign an age variable

        check if the person is a kid
        age --- > up 13 (include 13)

        check if the person is adult
        age --- > 30 or higher */
        int ageOfPerson = 13;
        boolean isKid = ageOfPerson <= 13;
        System.out.println("You are a kid. Correct? " + isKid + "\n");
        boolean isAdult = ageOfPerson>=30;
        System.out.println("You are an adult. Correct? " + isAdult);




    }
}
