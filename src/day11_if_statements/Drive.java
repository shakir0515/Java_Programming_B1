package day11_if_statements;

public class Drive {
    public static void main(String[] args) {
     int speed =78;
     if (speed>=90){
         System.out.println("Your speed limit is requiring jail");
     } else if (speed>=70) {
         System.out.println("Your speed limit requires Dl suspension");
     } else if (speed>=60) {
         System.out.println("Your speed limit requires court");
     } else if (speed>=50) {
         System.out.println("Your speed limit requires ticket");
     } else if (50>=speed && speed>=35) {
         System.out.println("Your speed limit is in the range");
     } else if (speed>=0 && speed<35) {
         System.out.println("Going to slow or you are parked");
     }else{
         System.out.println("Not valid input");
     }


    }
}
