package day25_methods;

import my_util.StringUtil;

public class UsingStringClass {
    public static void main(String[] args) {
        System.out.println(StringUtil.reverseStr("java"));
        String fixed =StringUtil.fixFormat("tOmmY") + " is friend with " + StringUtil.fixFormat("Carlos");
        System.out.println(fixed);

        System.out.println(StringUtil.camelCase("JAVA is Good LaNguage"));

        System.out.println(StringUtil.frequencyOfCharacter("apple", 'p'));

    }
}
