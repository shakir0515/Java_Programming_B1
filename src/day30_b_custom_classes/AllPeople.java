package day30_b_custom_classes;

public class AllPeople {
    public static void main(String[] args) {


        // These are not valid ways to reach instance variables
        //System.out.printLn(name);
        //System.out.printLn(lastName);

        // Creating the object of the Person class
        Person person1 = new Person();
        Person person2 = new Person();

        // Assigned the instance variables with values for each object
        person1.name = "Javid";
        person2.name = "Melek";

        // Printing each object own copy of the name
        System.out.println(person1.name);
        System.out.println(person2.name);

        System.out.println("--------------");
        System.out.println("Person 1 info");
        person1.lastName = "Shahbazov";
        person1.age = 33;
        person1.height = 1.60;
        person1.isMarried =true;

        System.out.println(person1.lastName);
        System.out.println(person1.age);
        System.out.println(person1.height);
        System.out.println(person1.isMarried);

        System.out.println("--------------");
        System.out.println("Person 2 info");
        person2.lastName = "Ozkan";
        person2.age = 20;
        person2.height = 1.70;
        person2.isMarried = false;

        System.out.println(person2.lastName);
        System.out.println(person2.age);
        System.out.println(person2.height);
        System.out.println(person2.isMarried);
        System.out.println("--------------");
        person1.test();
        person2.test();
        // Person.test(); // Since it is not a static method, we can not reach by Class name

    }
}
