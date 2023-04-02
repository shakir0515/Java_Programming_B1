package day11_if_statements;
/* Task:
        declare and assign a price variable
        declare and assign a boolean - hasPrime variable

        possible outputs:

            prime member:
                Eligible for 2 day shipping

            not prime and item price is more than or equal 25:
                Eligible for regular free shipping
       not prime and item price is less than 25:
                Not eligible for free shipping. Shipping fee: 3.99

     */
public class AmazonPrime {
    public static void main(String[] args) {
        double price = 300;
        boolean isPrime = false;
if  (isPrime) {
    System.out.println("Eligible for 2 days shipping");
} else {
    if (price>=500){
        System.out.println("Eligible for free shipping");
    } else {
        System.out.println("not eligible for free shipping shipping fee: $3.99");
        System.out.println("Your total cost is: " + (price + 3.99));
    }
}
    }
}
