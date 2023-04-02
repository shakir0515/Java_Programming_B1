package day24_methods;

public class GetCharacters {
    public static void printAToZ () {
        for (int i = 'A'; i <= 'Z'; i++) {
            System.out.print((char)i + " ");
        }
        System.out.println();
    }

    public static void printaToz () {
        for (int i = 'a'; i <= 'z' ; i++) {
            System.out.print((char)i + " ");
        }
        System.out.println();
    }


    public static void printZtoA () {
        for (int i = 'Z'; i >= 'A' ; i--) {
            System.out.print((char)i + " ");
        }
        System.out.println();
    }

    public static void print0to9 () {
        for (int i = 0; i <= 9; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        printAToZ();  // I am calling my method called printAToZ
        printaToz();  // I am calling my method called printaToz
        printZtoA();  // I am calling my method called printZtoA
        print0to9();
    }








}
