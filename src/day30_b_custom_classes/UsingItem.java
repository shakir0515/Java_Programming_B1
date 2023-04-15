package day30_b_custom_classes;

public class UsingItem {
    public static void main(String[] args) {

        Item fruit1 = new Item();
        //System.out.println(fruit1); // If you write this line of code and if you do not have toString() method in Item class  ---> it will show some memory location.

        fruit1.name = "Apple";
        fruit1.price = 3.99;
        System.out.println(fruit1);


        System.out.println("---------------");
        Item fruit2 = new Item();
        fruit2.name = "Banana";
        fruit2.price = 2.99;
        System.out.println(fruit2);

    }
}