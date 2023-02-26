package day07_relational_operators;

public class OperatorPractise {
    public static void main(String[] args) {


        int i = 5;  // i =5
        int y = -i++ + --i + i++ / i--;

        //y = -5 + 5 + 5/6
        System.out.println(i);
        System.out.println(y);
    }
}
