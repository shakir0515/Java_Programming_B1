package day23_multidimensional_arrays;
import java.util.Arrays;
import java.util.Scanner;
/*Have a starting array
        you want to add a number to the end
        so make your array bigger to store the new number
        Ex: {45, 123, 62}
            adding 100
            {45, 123, 62, 100}*/
public class AddElement {
    public static void main(String[] args) {
        int [] num = {1, 2, 3, 4};
        Scanner input = new Scanner(System.in);
        System.out.println("What do you want your array size to be? ");
        int arrOneSize = input.nextInt();

        int [] arr1 = new int[arrOneSize];
        System.out.println(Arrays.toString(arr1));

        System.out.println("Add your elements one at a time: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr1));


        System.out.println("How many more element you want to add: ");
        int addNum = input.nextInt();   // 3
        int [] arr2 = Arrays.copyOf( arr1,  arr1.length + addNum);
        System.out.println(Arrays.toString(arr2));


        System.out.println("Add your elements one at a time for additional spaces:");
        for (int i = arr1.length; i < arr2.length; i++) {   // int i = arr1.length; --- > Here I want to start from specific index, so I can put values starting from that index.
            arr2[i] = input.nextInt();
        }

        System.out.println(Arrays.toString(arr2));



    }
}
