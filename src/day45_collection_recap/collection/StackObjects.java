package day45_collection_recap.collection;

import java.util.Stack;

public class StackObjects {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        stack.push("d");        // accepts duplicates
        stack.push(null);       // accepts null
        System.out.println(stack);   // MAIN idea is LIFO


        // Get the element from th top
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);



    }
}
