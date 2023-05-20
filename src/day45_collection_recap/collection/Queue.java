package day45_collection_recap.collection;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class Queue {
    public static void main(String[] args) {

        PriorityQueue<String> queue1 = new PriorityQueue<>();
        queue1.offer("a");
        queue1.offer("c");
        queue1.offer("d");
        queue1.offer("f");
        queue1.offer("e");
        queue1.offer("e");     // accepts duplicates
        // queue1.offer(null);    // Does not accept null
        System.out.println(queue1);





        ArrayDeque<String> queue2 = new ArrayDeque<>();
        queue2.offer("a");
        queue2.offer("c");
        queue2.offer("d");
        queue2.offer("f");
        queue2.offer("e");
        queue2.offer("e");     // accepts duplicates
        // queue2.offer(null);    // Does not accept null
        System.out.println(queue2);

        queue2.offerFirst("z") ;
        System.out.println(queue2);






    }
}
