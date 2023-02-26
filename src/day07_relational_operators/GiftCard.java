package day07_relational_operators;

public class GiftCard {
    public static void main(String[] args) {
      /*  declare and assign a gift card with 300;
        buy 2 items
        buy item1 for $50
        buy item2 for $100
        print out the remaining */
        double giftCard = 300;
        System.out.println("I have $ " + giftCard + " worth of gift card.");
        double remainingBalance = giftCard -= 50;

    }
}
