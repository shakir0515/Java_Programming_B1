package day25_methods;

public class CurrencyConverter {
    public static double currency (String currencyType, double currencyAmount ) {
          //  currencyType = currencyType.toLowerCase();
        switch (currencyType.toLowerCase()) {
            case "euro":
               return currencyAmount * 0.91;
            case "yen":
                return currencyAmount * 121.03;
            case "lira":
                return currencyAmount * 14.85;
            case "won":
                return currencyAmount * 1217.52;
            case "rupee":
                return currencyAmount * 181.45;
            default:
                System.out.println("Not valid Curency");
                return 0.0;
        }
    }
    public static void main(String[] args) {
        System.out.println("Your converted currency is " + currency("YEN", 500));
    }

}
