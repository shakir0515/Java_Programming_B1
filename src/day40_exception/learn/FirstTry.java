package day40_exception.learn;

public class FirstTry {
    public static void main(String[] args) {
        System.out.println("First line");

        String word = "Java";

        try {
            System.out.println(word.charAt(10));
        } catch (Exception e) {
            System.out.println("Exception handled");
        }


        System.out.println("last line");



    }
}
