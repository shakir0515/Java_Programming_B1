package day44_map;
// It is also an object representation of sequence of characters
//StringBuilder is MUTABLE and CAN BE MODIFIED
//It is not synchronized meaning not thread-safe
//We can only create object of StringBuilder by the new keyword.

public class StringBuilderPractice {
    public static void main(String[] args) {

            StringBuilder stringBuilder = new StringBuilder("Hello");
            stringBuilder.reverse();
            System.out.println(stringBuilder);


            stringBuilder.append(2);
            System.out.println(stringBuilder);

            stringBuilder.append("olleh");
            System.out.println(stringBuilder);

            stringBuilder.delete(0, 5);
            System.out.println(stringBuilder);

            stringBuilder.insert(1, "TEST");
            System.out.println(stringBuilder);


            stringBuilder.replace(5, 7, "-----");
            System.out.println(stringBuilder);


        }

    }



    }
}
