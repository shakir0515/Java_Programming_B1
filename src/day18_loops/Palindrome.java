package day18_loops;
/*
    Palindrome: its the same reading from the beginning and end

    Ex:
        mom
        racecar
        anna
        madam

    Task: Check if a word is palindrome

    Flow:
        declare some initial String
        how to reverse a String
        check if the reverse version is the same as the original
 */
public class Palindrome {
    public static void main(String[] args) {
        String word = "abcba";
        String reverse = "";
        for (int i = word.length() - 1;  i>=0 ; i--){
            reverse += word.charAt(i);
        }
        if (word.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        System.out.println("___________________");
        System.out.println(word.equals(reverse) ? "Palindrome" : "Not Palindrome");




    }
}
