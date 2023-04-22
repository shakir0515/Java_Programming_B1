package day33_a_static;

public class BestBuyStores {
    public static void main(String[] args) {



        System.out.println(BestBuy.headQuarters);
        System.out.println(BestBuy.day);
        System.out.println(BestBuy.numOfComputer);


    BestBuy store1 = new BestBuy("Fairfax");
        System.out.println(store1.location);
        System.out.println(store1.numOfComputer);

    store1.numOfComputer -= 10;
        System.out.println(store1.numOfComputer);

    BestBuy store2 = new BestBuy("Chantilly");
        System.out.println(store2.numOfComputer);

    store2.location = "Arlington";
        System.out.println(store1.location);
        System.out.println(store2.location);

        System.out.println("---------");
    store2.day = "Weekday";
        System.out.println(BestBuy.day);
        System.out.println(store1.day);
        System.out.println(store2.day);

        System.out.println("---------");
    BestBuy.day = "Weekend";
        System.out.println(BestBuy.day);
        System.out.println(store1.day);
        System.out.println(store2.day);

        System.out.println("---------------");

    // static method I can call either with Classname or object but PROPER WAY is to use classname
        BestBuy.reStock();
        System.out.println(BestBuy.numOfComputer);

        store1.reStock();


    // Since openStore() is an instance method, we can not call it by Classname
    //BestBuy.openStore();

        store1.openStore();
        store2.openStore();

}
}
