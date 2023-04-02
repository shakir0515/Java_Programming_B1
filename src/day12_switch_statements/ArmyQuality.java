package day12_switch_statements;

import java.util.Scanner;

public class ArmyQuality {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean hasCitizenship;
        boolean isResident;
        boolean hasDiploma;
        int age;

        System.out.print("Are you a citizen? ");
        hasCitizenship = input.nextBoolean();

        System.out.print("\nAre you a resident? ");
        isResident = input.nextBoolean();

        System.out.print("/nDo you have a high school diploma (ture or false? ");
        hasDiploma = input.nextBoolean();

        System.out.print("\nHow old are you? ");
        age = input.nextInt();


        if ((hasCitizenship || isResident) && (age>=18 && age<=35) && hasDiploma) {
            System.out.println("You are qualified for the Army");
        } else {
            if (!hasCitizenship && !isResident){
                System.out.println("You must be citizen or resident");

            }
            if (age <18 | age>35){
                System.out.println(" Your age must be 18 - 35");


            }
            if (!hasDiploma) {
                System.out.println("Has to have a diploma");

            }
        }







    }



}
