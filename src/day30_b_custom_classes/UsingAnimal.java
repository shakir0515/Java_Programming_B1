package day30_b_custom_classes;

public class UsingAnimal {
    public static void main(String[] args) {

        Animal bird = new Animal();
        bird.population = 100000000;
        bird.species ="Bird";

        // When we use just the object name to print the information it will by default call the toString() method but we need to have the toString method in the Class
        System.out.println(bird);
        System.out.println("--------------");
        System.out.println(bird.toString()); // Normally if you have toString method declared, we do tno need to call the method this was.

        System.out.println(bird);  // This by default will call the toString() method but that method has to be declared in App class.2:27

        bird.fly();

    }
}




