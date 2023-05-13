package day42_collection;

import java.util.Stack;

public class StackObjects {
    public static void main(String[] args) {

        Stack<Character> stack = new Stack<>();
        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('d');
        System.out.println(stack);

        //Get whatever is on the TOP of the stack
        System.out.println("Top of the stack: " + stack.peek());

        System.out.println("---------------");
        // Remove the element at the top
        stack.pop();
        System.out.println(stack);
        System.out.println("Top of the stack: " + stack.peek()); // c

        System.out.println("---------------");
        stack.pop();
        stack.pop();
        System.out.println("Top of the stack: " + stack.peek());

        System.out.println("---------------");
        stack.push('z');
        System.out.println("Top of the stack: " + stack.peek());


        System.out.println("---------------");
        // can I remove the element from beginning
        // yes you can BUT then WE ARE NOT FOLLOWING THE IDEA THAT IS SPECIFIC TO STACK.
        stack.remove(0);
        System.out.println("Top of the stack: " + stack.peek());


        System.out.println("---------------");
        stack.push('x');
        System.out.println("Top of the stack: " + stack.peek());




    }
}
