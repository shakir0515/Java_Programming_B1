package day36_inheritance.hiding;

public class B extends A {


    @Override
    public void instanceMethod () {
        staticMethod(); // instance can accept static
    }

    // @Override - we canNOT override static method. The one below is just a new static method that belongs to the CHILD clas. If the Child class name is sued to call this method, the one in the Parent class will be hidded.
    public static void staticMethod() {
        System.out.println("Static method from CHILD class");
        // instanceMethod(); //static accepts only statuc
    }
}