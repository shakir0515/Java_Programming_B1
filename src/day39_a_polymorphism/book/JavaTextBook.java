package day39_a_polymorphism.book;

/*
Create a concrete class JavaTextbook
    - Inherits EBook
    - Declare a fun variable
    - Override all abstract methods
 */
public class JavaTextBook extends EBook {

    boolean fun;

    @Override
    public void read() {
        System.out.println("Reading");
    }

    @Override
    public void downloadable() {
        System.out.println("Downloading");
    }

    @Override
    public void open() {
        System.out.println("Opening");
    }
}

/*
    int i = 5;
    double d = i;  // upcasting - implicitly


    double d1 = 5.0;
    int i2 = (int) d1;  // down casting
 */

/*
       child class -- acccess
       super class

       (super class)child class // upcasting
       (sub class)super class //  downcast

 */