package day20_nested_loops;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "AAABCC";  // 10 characters
        //            0123456789


        for (int i = 0; i < str.length(); i++) {            // A
            // A
            char outerLetter = str.charAt(i) ;              // A
            // B
            // C
            // C .......

            int count = 0;
            //      "AAABCC    - //      "AAABCC       //      "AAABCCDEEF           //      "AAABCC
            for (int j = 0; j < str.length(); j++) {                  // A  == A            // A  == A           // A  == A                    // B  == A
                // A  == A            // A  == A           // A  == A                    // B  == A
                char innerLetter = str.charAt(j);                     // A  == A            // A  == A           // A  == A                    // B  == A
                // A  == B            // A  == B           // A  == B                    // B  == B
                if (outerLetter == innerLetter) {                     // A  == C            // A  == C           // A  == C                    // B  == C
                    count++;                                          // A  == C            // A  == C           // A  == C                    // B  == C
                }

            }  // Inner loop ends


            if (count == 1) {
                System.out.println(outerLetter);

            }} }}
