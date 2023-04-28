package day35_inheritance.book;

public class Library {
    public static void main(String[] args) {

        Book book = new Book();
        // this book object can reach 6 instances
        // book.size = 23;
        // book.duration = 45;

        EBook ebook = new EBook();
        // this ebook object can reach 6 instance variables from SUPER class and 2 instance variables and 1 instance method from its own class
        ebook.size = 20;
        ebook.pages = 1035;
        ebook.title = "Soft Skill";
        ebook.author = "Nadir";
        ebook.read();


        AudioBook abook = new AudioBook();
        abook.duration = 2.4;
        abook.narrator = "Morgan Freemon";
        abook.title = "Java";
        abook.author = "James Gosling";
        abook.listen();






    }

}