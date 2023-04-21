package day32_custom_classes;

public class Food {
    String name;
    int quantity;
    double unitPrice;
    double totalPrice;


    public Food (String name){
        this.name= name;
    }

    public Food (String name, int quantity){
        this(name);
        this.quantity = quantity;
    }

    public Food (String name, int quantity, double unitPrice){
        this(name, quantity);
        this.unitPrice = unitPrice;
        calculatePrice();
    }





/*
- method:

    - calculatePrice(): multiple the quantity by unit price and assign the value to the total price

    - toString()
        print all the Food information

*/

    public void calculatePrice () {
        totalPrice = quantity * unitPrice;
    }


    @Override
    public String toString() {
        return "Item: " +
                "\nName: " + name +
                "\nQuantity: " + quantity +
                "\nUnit Price $" + unitPrice +
                "\nTotal Price: $" + totalPrice;
    }
}

