package day35_inheritance.book;

public class EBook extends Book {
    int size;
    int pages;

    public void read() {
        System.out.println("Reading a digital copy of a book " + title + " by " + author);
    }


}