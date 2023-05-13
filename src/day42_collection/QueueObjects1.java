package day42_collection;

import java.util.PriorityQueue;

public class QueueObjects1 {
    public static void main(String[] args) {

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(2);
        queue.add(10);
        queue.add(8);
        queue.add(1);
        queue.add(1);
        //queue.add(null);   // PriorityQueue does NOT accept NULL values
        System.out.println(queue);  // The insertion order is not reserved. It is a random order.
        //queue.get(0); --> the get() method is in List interface, that is why I canNOT use it.

        queue.offer(30);  // same as add(); method
        System.out.println(queue);




    }
}
