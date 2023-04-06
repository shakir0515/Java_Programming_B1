package my_util;

import java.util.Arrays;

public class StringUtil {
    /**
     This method made by Loopcamp Batch#1
     The method accepts a String and returns the reversed String
     */
    public static String reverseStr (String str) {

        String reversed = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

/**
 * This method made by Loop camp Batch#1
 * This method accepts a String parameter and puts in a format
 * Ex:
 *             First letter is upper case and rest is in lower case
 *
 * Then return a String in a formatted way.
 */
  public static String fixFormat (String str) {
      String fixed = str.trim();
      fixed = str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
      return fixed;
  }

    /**
     * This method accept a String with multiple words and convert it to camelCase String

     */
  public static String camelCase (String str) {  //Input:JAVA will ruLE tHe wORLd Output: javaWillRuleTheWorld
      String [] arr = str.split(" ");
      String result = "";
      for (String each: arr) {
          result += (each.charAt(0) + "").toUpperCase() + each.substring(1);
      }
      return  (result.charAt(0) + "").toLowerCase() + result.substring(1).toLowerCase();
  }

    /**
     * This method accepts String and char
     * And returns how many times that char exist in the String
     * apple p
     * 2
     */
    public static int frequencyOfCharacter (String str, char ch) {

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

    /**
     * This method accepts String
     * And returns only unique char as a String
     */
    public static String uniqueCharacters (String str) {  //aaaaabcccdeeff
        String checked = "";
        String unique = "";

        for (int i = 0; i < str.length(); i++) {

            if (!checked.contains(str.charAt(i)+"")){

                int count = StringUtil.frequencyOfCharacter(str, str.charAt(i));
                checked += str.charAt(i);  // checked = "abcd";

                if (count == 1) {
                    unique += str.charAt(i);  //uniqiue = "bd";
                }

            }

        }

        return unique;

    }

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
