package day05_variables;

public class School {
    /*
    Task:
        class name: School
        declare and assign these variables
            number of students in grade 1
            number of students in grade 2
            number of students in grade 3
            number of students in grade 4
            number of students in grade 5
            - > total number of students in your school
            number of days in a year (have some half day = ~ 100.5)
            number of snow days in a year (double)
            average gpa in school (3.5) [ranges 1.0 - 4.0]
            print all of the variables with unique messages */
    public static void main(String[] args) {
        int numberGrade1 = 40;
        int numberGrade2 = 30;
        int numberGrade3 = 35;
        int numberGrade4 = 50;
        int numberGrade5 = 44;

        int totalNumber = numberGrade1 + numberGrade2 + numberGrade3 + numberGrade4 + numberGrade5;

        double numberDaysYear = 100.5;
        double numberSnowDays = 7.5;
        double averageGpa = 3.2;
        System.out.println("Number of students in grade 1 = " + numberGrade1);
        System.out.println("Number of students in grade 2 = " + numberGrade2);
        System.out.println("Number of students in grade 3 = " + numberGrade3);
        System.out.println("Number of students in grade 4 = " + numberGrade4);
        System.out.println("Number of students in grade 5 = " + numberGrade5);
        System.out.println();
        System.out.println("Total number of Students:" + totalNumber);




    }



}
