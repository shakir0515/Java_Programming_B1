package day36_inheritance.final_example;

public class UseFinalExample {
    public static void main(String[] args) {

        System.out.println(FinalExample.PLANET);
        //FinalExample.PLANET = "Mars";  // Since it is a CONSTANT we canNOT change value.

        FinalExample obj1 = new FinalExample(20);
        System.out.println(obj1.a);
        System.out.println(obj1.b);

        // obj1.a = 30; //Since it is final, we canNOT change the value.
        // obj1.b = 40; //Since it is final, we canNOT change the value.

        System.out.println("-----------------------");
        FinalExample obj2 = new FinalExample(30);
        System.out.println(obj2.a);
        System.out.println(obj2.b);

    }



}