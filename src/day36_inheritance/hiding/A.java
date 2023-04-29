package day36_inheritance.hiding;

public class A {


    public void instanceMethod () {
        staticMethod(); // instance can accept static
    }


    public static void staticMethod() {
        System.out.println("Static method from PARENT class");
        // instanceMethod(); //static accepts only statuc
    }


}
