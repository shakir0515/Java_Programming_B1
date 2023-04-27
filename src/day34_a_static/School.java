package day34_a_static;
public class School {
public static void main(String[] args) {

        // creat an object that has to parameters: name, groupNum
        LoopAcademyStudent student1 = new LoopAcademyStudent("Javid", 1);
        LoopAcademyStudent student2 = new LoopAcademyStudent("Natalia", 2);


        System.out.println("----------");
        LoopAcademyStudent.printInfo();
        System.out.println("----------");
        LoopAcademyStudent.printInfo();


        System.out.println("----------");
        System.out.println(student1);
        System.out.println(student2);


        }

        }
