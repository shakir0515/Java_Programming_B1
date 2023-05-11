package day40_exception.learn;

public class ForthTry {
    public static void main(String[] args) {


        try{
        System.out.println("Start");
        Thread.sleep(-2000);
        System.out.println("Finish");


    } catch (Exception e) {
        e.printStackTrace();
        System.out.println("-------");
        System.out.println(e.getMessage());
    }

}

}
