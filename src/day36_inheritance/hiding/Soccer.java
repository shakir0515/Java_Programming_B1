package day36_inheritance.hiding;

public class Soccer extends  Sports {



    //@Override
    public static void cheer() {
        System.out.println("Cheering from the CHILD class");
    }

    // It may look like we are overriding this method but it is not because the method is STATIC. Therefore, the one in the parent class get hidden when that method is called by the Child class.

}
