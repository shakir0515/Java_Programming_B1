package day25_methods;

public class FixFormat {
    public static String fixFormat (String str) {
        return (str.charAt(0)+ "").toUpperCase() + str.substring(1).toLowerCase();
    }


}
