package day38_a_abstraction.animal;

public class Parrot extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }

    @Override
    public void eat() {
        System.out.println("Parrot chews the seed");
    }
}
