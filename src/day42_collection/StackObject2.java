package day42_collection;

import java.util.Stack;

public class StackObject2 {
    public static void main(String[] args) {
        Stack<Integer> box = new Stack<>();
        box.push(40);
        box.add(20);
        box.add(100);
        box.push(30);

        System.out.println(box);
        System.out.println("Top: " + box.peek());

        box.pop();
        System.out.println(box);


        //[40, 20, 100]
        System.out.println(box.pop());
        System.out.println("Top: " + box.peek());




    }
}
