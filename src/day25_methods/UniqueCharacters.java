package day25_methods;

import my_util.StringUtil;

/*Unique Characters

create a method that will accept a word(String) and return a String with all the unique characters. A character is unique if it only appears in the String once.

Hint: use your frequency method to do some of the work

Ex:
Input:
    aaaaabcccdeeff

Output:
    bd*/
public class UniqueCharacters {
    public static String uniqueCharacters (String str) {  //aaaaabcccdeeff
        String checked = "";
        String unique = "";

        for (int i = 0; i < str.length(); i++) {  // a a.... b c .... d

            if (!checked.contains(str.charAt(i)+"")){   // checked  = "";

                int count = StringUtil.frequencyOfCharacter(str, str.charAt(i));
                // "aaaaabcccdeeff", 'd' | 1

                checked += str.charAt(i);  // checked = "abcd";

                if (count == 1) {
                    unique += str.charAt(i);  //uniqiue = "bd";
                }

            }

        }

        return unique;

    }

}
