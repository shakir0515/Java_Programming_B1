package day39_a_polymorphism.clothes;

public class Store {
    public static void main(String[] args) {

        // All possible references.


        // The reference is ---> ITSELF
        TShirt t1 = new TShirt();
        t1.wear();


        // THe reference is ---> Super class
        Clothes t2 = new TShirt();
        t2.wear();


        // HasHood t3 = new TShirt();
        //TShirt class does not implement HasHood -- meaning there is not relationship.


        System.out.println();


        // Reference is -- > ITSELF
        Jacket j = new Jacket();
        j.wear();
        j.putOnHood();


        // The reference is --- > SUPER CLASS
        Clothes j2 = new Jacket();
        j2.wear();
        // Since the reference is not INTERFACE, I canNOT access this method
        //j2.putOnHood();



        // The refence is ---> INTERFACE
        HasHood j3 = new Jacket();
        // Since the reference is not SUPER CLASS, I canNOT access this method
        //j3.wear();
        j3.putOnHood();


        // THe reference is --- >OBJECT CLASS
        Object o = new Jacket();
        // Since the Reference is NOT OBJECT CLASS, I canNOT access these methods.
        //o.wear();
        //o.putOnHood();
        o.toString();  // Since this is in Object class, I can reach

    }

}