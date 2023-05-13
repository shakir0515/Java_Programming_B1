package day42_collection;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueObjects2 {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        // offer() is the method to add elements.
        // Insertion order not reserved but natural order
        queue.offer("hello");
        queue.offer("world");
        queue.offer("java");
        queue.offer("selenium");
        queue.offer("apple");
        queue.offer("zebra");
        queue.offer("api");
        queue.offer("databse");

        System.out.println(queue);
        System.out.println(queue.peek());

        queue.poll();
        System.out.println(queue);

        queue.poll();
        System.out.println(queue);

        queue.poll();
        System.out.println(queue);

        queue.poll();
        System.out.println(queue);

        queue.poll();
        System.out.println(queue);


        /*
            1 -the poll() method will remove it from the beginning.
            2- Once it is removed, then there is a natural order applied to the PriorityQueue.


            If you have another poll() mehtods, then it will remove it the first one again, the step 2 will happen again.

         */


        System.out.println("-------------------------------");
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.offer("hello");
        arrayDeque.offer("world");
        arrayDeque.offer("java");
        arrayDeque.offer("selenium");
        arrayDeque.offer("apple");
        arrayDeque.offer("zebra");
        System.out.println(arrayDeque);


        System.out.println(arrayDeque.poll());     // removing the element
        System.out.println(arrayDeque);


        System.out.println(arrayDeque.poll());
        System.out.println(arrayDeque);


        System.out.println(arrayDeque.poll());
        System.out.println(arrayDeque);
        /*
            1 -the poll() method will remove it from the beginning.
            2- Once it is removed, it will keep the insertion order to the ArrayDeque.

            If you have another poll() mehtods, then it will remove it the first one again, the step 2 will happen again.

         */

        System.out.println(arrayDeque.peek());
        System.out.println(arrayDeque.peekLast());

        arrayDeque.offerFirst("New word");
        System.out.println(arrayDeque);

        System.out.println(arrayDeque.peekFirst());





    }
}
