package day42_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
public class RemoveThroughLooping {
    public static void main(String[] args) {

            ArrayList <Integer> list = new ArrayList<>(Arrays.asList(
                    2, 3, 5, 6, 12, 35, 6, 2, 5, 6, 2, 3, 1, 4, 5
            ));
            System.out.println(list);

            // Remove everything below 5
            // Traditional loop with removing does NOT work, because indexs/elements get shifted, so it could skip some elements.
//        for (int i = 0; i < list.size() ; i++) {
//            if (list.get(i) < 5) {
//                list.remove(i);
//            }
//        }
//        System.out.println(list);


            Iterator<Integer> it = list.iterator();
            // hasNext(); method which return a boolean value
            while (it.hasNext()){     // checks if there is an element next to it (cursor), if not stop the loop
                if(it.next() < 5) {   // take that next element and check the condition
                    it.remove();      // If condition is met, remove that element
                }
            }
            System.out.println(list);




        }
}
