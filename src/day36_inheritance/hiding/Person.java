package day36_inheritance.hiding;

public class Person {
    String name = "Tom Jerry";
}
class Child extends Person {

    // If the instance below was commented out, the object of the child class will get the name instance from Parent class
    // Since we have it, and we call it with the child class object, the one in the Parent is hidden for Child class object.
    String name = "James Gosling";
}

class Runner {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);

        System.out.println("-----------");
        Child child = new Child();
        System.out.println(child.name);
    }
}
