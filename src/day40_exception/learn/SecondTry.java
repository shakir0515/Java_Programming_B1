package day40_exception.learn;

public class SecondTry {
    public static void main(String[] args) {


        try{
            int [] a = {1, 2, 3, 4};
            System.out.println(a[99]);

            String s = null;
            System.out.println(s.length());




        } catch (NullPointerException e){
            System.out.println("Caught a null pointer exception");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught the Array index out of Bounds");

        }

        System.out.println("Done");

    }

}
