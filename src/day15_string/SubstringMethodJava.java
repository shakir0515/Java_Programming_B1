package day15_string;

import javax.crypto.spec.PSource;

public class SubstringMethodJava {
    public static void main(String[] args) {


        String str = "Saturday";   //7 index 8 characters
        System.out.println(str.substring(3));
        System.out.println(str.substring(6));
        System.out.println(str);


        System.out.println(str.substring(2, 5));
        System.out.println(str.substring(0, 5));

        System.out.println(str.substring(0, 5) + "day");
        System.out.println(str.substring(0, 5) + str.substring(5, 8));
        System.out.println(str.substring(0, 5) + str.substring(5));


    }

}
