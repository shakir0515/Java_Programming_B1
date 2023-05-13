package day42_collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapObject {
    public static void main(String[] args) {

        //   key     - value
        Map <Integer, String> map = new HashMap<>();
        System.out.println(map.size());

        // put(k, v); --- > this methods puts the data into map, but if there is key that is already existing in the map, it will UPDATE the value of the key.
        map.put(1, "one");   // first time, it was empty meaning there was no key or value. That is why it added into the map
        System.out.println(map);



        System.out.println("---------");
        map.put(1, "one");   // second time, the key which 1 already exist and value is exact same, nothing changes.
        System.out.println(map);


        System.out.println("---------");
        map.put(1, "onE");   // third time, the key which 1 and already exist and value is exact same, nothing changes.
        System.out.println(map);



        System.out.println("---------");
        map.put(1, "two");   // fourth time, since key which is 1, already exist, and since duplicate key is NOT allowed, it updated the already existing key's value.
        System.out.println(map);

        System.out.println("***************");


        Map <Integer, String> map2 = new HashMap<>();
        map2.put(1, "one");
        map2.put(5, "five");
        map2.put(10, "ten");
        map2.put(4, "four");
//        map2.put(40, "four");
//        map2.put(30, "four");
//        map2.put(24, "four");
//        map2.put(41, "four");
//        map2.put(47, "four");
        System.out.println(map2);
        System.out.println("***************");

        //read the key/value
        System.out.println(map2.get(5));  // argument in the get method which is 5 is NOT the index, it is the key
        System.out.println(map2.get(2));  // If you try to get the key which does not exist, it will return 'null'

        String value = map2.get(4); // Since it returns a String, I can assign it to a String variable
        System.out.println(value);


        System.out.println("***************");
        map2.remove(1);  // the argument in the remove() method is key, if there is matching one, it will remove whole ENTRY SET (key-value)
        System.out.println(map2);


        System.out.println("***************");
        System.out.println(map2.containsKey(1)); // it checks if the given KEY exist in MAP
        System.out.println(map2.containsKey(4));


        System.out.println("***************");
        System.out.println(map2.containsValue("five"));  // it checks if the given VALUE exist in MAP
        System.out.println(map2.containsValue("six"));


        System.out.println("***************");
        map2.put(null, null);   // The HashMap can have a null as key and as value
        System.out.println(map2);

        map2.put(null, "java");
        System.out.println(map2);

        map2.put(6, null);
        System.out.println(map2);

        map2.put(7, null);
        System.out.println(map2);  // We can have duplicate values

        map2.put(8, "Bye");
        map2.put(9, "Bye");
        System.out.println(map2);

        map2.put(8, "BYE");
        System.out.println(map2);
/*

       HashMap
        -Key - does not accept duplicates
        -Value - accepts duplicates
        -Order is not guaranteed.

            -put(key, value);
            -get(key);
            -remove(key);
            -containsKey(key);
            -containsValue(value);
 */
    }

}
