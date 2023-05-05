package day38_b_polymorphism.animal;

public class Wild {
    public static void main(String[] args) {

        // Reference type --- > itself
        Lizard lz = new Lizard();
        lz.eat();
        lz.skinColor = "camo";
        lz.numOfClaws = 10;
        lz.name = "LIzzard";
        System.out.println(lz.skinColor);
        System.out.println(lz.numOfClaws);
        System.out.println(lz.name);

        System.out.println("--------------------");
        // Reference type --- > super class
        Reptile lz2 = new Lizard ();
        lz2.eat();
        lz2.name = "Lizzar2";
        lz2.numOfClaws = 20;
        //lz2.skinColor = "blue";
        // Here we are limited to use the instance to the Reference Type.
        // Reference Type does NOT have access to skinColor instance variable.

        System.out.println("--------------------");
        Animal lz3 = new Lizard();
        lz3.eat();
        lz3.name = "Lizzar2";
        // lz3.numOfClaws = 20;
        // lz3.skinColor = "blue";
        // Here we are limited to use the instance to the Reference Type.
        // Reference Type does NOT have access to skinColor or numOfClaws instance variable.




        /*
            We made 3 lz object with 3 different reference type.
            Lizard(itself), Reptile (Super class), Animal (Grand Super)

            IT will always run the OBJECT side

            But when it comes to the execution, the object implementation is run. We are limited for access with the reference type.
         */

    }


}
