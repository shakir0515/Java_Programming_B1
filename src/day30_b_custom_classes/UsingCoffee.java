package day30_b_custom_classes;

public class UsingCoffee {
    public class UsingCoffee {
        public static void main(String[] args) {

            Coffee coffee1 = new Coffee();
            System.out.println(coffee1);
            coffee1.price = 1.99;
            coffee1.size = "Large";
            coffee1.brand = "Starbucks";
            coffee1.type = "Black";
            System.out.println("---------------");
            System.out.println(coffee1);

            System.out.println("---------------");
            coffee1.drink();

            coffee1.refill(0.50);

            //coffee1.totalCost(5.0);
            //System.out.println(coffee1.price);


        }
    }
}
