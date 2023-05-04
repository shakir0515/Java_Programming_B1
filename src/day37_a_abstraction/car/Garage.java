package day37_a_abstraction.car;

public class Garage {
        public static void main(String[] args) {
            // Car class is ABSTRACT class, that is why we can not object
            //Car obj1 = new Car();

            Toyota t1 = new Toyota();
            t1.start();
            System.out.println("-------------");

            Honda h1 = new Honda();
            h1.start();

            // Both Honda and Toyota are the FIRST NON_ABSTRACT child classes of Car parent abstract class. Since they are NON-ABSTRACT, I can create the object. Also, had to implement the start() method.

            System.out.println("-------------");
            Tesla ts1 = new Tesla();
            ts1.charging();
            ts1.start();

            System.out.println("-------------");
            Rivian r1 = new Rivian();
            r1.charging();
            r1.start();

        }
    }

