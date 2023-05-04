package day37_b_interface.creating;

public class Runner {
    public static void main(String[] args) {

        // Can NOT make an object of interface
        //Create obj = new Create();

        Book b1 = new Book();
        b1.read();
        b1.write();

    }

}