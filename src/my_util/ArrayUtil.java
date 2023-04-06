package my_util;

import java.util.Arrays;

public class ArrayUtil {

    /**
     * This method accept int arr and return the minimum number
     */
    public static int minNumInArr (int [] arr) {

        int min = arr [0];
        for (int each : arr ) {
            if (each < min) {
                min = each;
            }
        }

        return min;
    }
    /**
     * This method accept int arr and return the minimum number
     */
    public static int minNumInArrWithSort (int [] arr) {
        Arrays.sort(arr);
        return arr[0];
    }


}
