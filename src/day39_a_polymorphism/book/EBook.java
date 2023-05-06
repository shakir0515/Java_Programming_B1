package day39_a_polymorphism.book;

/*
Create an abstract class EBook
    - Inherits Book and implements Downloadable
    - Declare a size variable
    - Declare an abstract methods:
        open()
 */
public abstract class EBook extends Book implements Downloadable  {

    int size;

    //    public abstract void open();
    public  void open(){
        System.out.println("Turn On");
    }

}
