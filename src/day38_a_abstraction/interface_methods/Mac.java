package day38_a_abstraction.interface_methods;

public interface Mac {

    String NAME = "Mac";  // By default, public static final
    String OS = "IOS";

    void turnOn();  // By default, public abstract


    //Q: How can we create a method with body/implementation in the Interface?
    //A:

    // First option is through static method
    public static void company() {  // Redundant = Not Needed -- >  no need to put there
        System.out.println("Apple");
        System.out.println("HQ is in LA");
        System.out.println("New release in November");
    }


    // Second option is through default method.
    public default void faceTime () { // Redundant = Not Needed -- >  no need to put there
        System.out.println("Greeting in Facetime");
        System.out.println("Calling someone");
    }



}