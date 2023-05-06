package day39_a_polymorphism.clothes;

public class Jacket extends Clothes implements HasHood{
    @Override
    public void wear() {
        System.out.println("Wear the Jacket");
    }

    @Override
    public void putOnHood() {
        System.out.println("Putting the hood on");

    }
}
