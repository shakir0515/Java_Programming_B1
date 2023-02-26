package day06_b_unary_operators;

public class IncrementExample {
    public static void main(String[] args) {
        int x = 0;
        System.out.println(x);  // 0

        x = 4;
        System.out.println(x); // 4

        x = x + 1;
        System.out.println(x); // 5


        // ++ ---> increment
        x++;  // post increment x = x + 1
        System.out.println(x);  // 6

        ++x; // pre increment
        System.out.println(x);  // 7

        System.out.println(x++); // 7byte
 // x = 8
        System.out.println(++x); //9byte


    }


}
