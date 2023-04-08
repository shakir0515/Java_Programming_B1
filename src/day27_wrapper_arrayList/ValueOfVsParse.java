package day27_wrapper_arrayList;

public class ValueOfVsParse {
    public static void main(String[] args) {
        String s = "30";

        int seconds1 = Integer.parseInt(s);     //  String -- > primitive
        Integer seconds2 = Integer.parseInt(s); //  String -- > primitive -- > Object
        Integer seconds3 = Integer.valueOf(s);  // String -- > Object


        Integer i = Integer.valueOf("5");    // String --- > Object
        System.out.println("Total: " + (i + 2));

        /*
            byte
            short
            int
            long
            float
            double
            char
            boolean
         */

        /*
            String --- > Class --- > which meant we can have object of that class
            Array  --- > Class --- > which meant we can have object of that class
            Scanner --- > Class --- > which meant we can have object of that class
            ***Wrapper Classes
                Byte
                Short
                Integer
                Long
                Float
                Double
                Character
                Boolean
         */






    }
}
