package day06_a_arithmetic_operators;

public class TypeCasting {
    public static void main(String[] args) {
        byte b = 40;
        int i = b; //byte value is automatically (implicitly) converted to int, cause byte is smaller than int

        int i2 = 100;
       // byte b2 = i2; // Reassigning checks the data type first. thats why we cannot put it.
        byte b2 = (byte)i2; // Reassigning checks the data type first
        byte b3 = 100; // assigning a value directly gives a data type automatically  after checking the range

        System.out.println("b2: " + b2);
        System.out.println("b3: " +b3 );

        int i3 = 130;
        byte b4 = (byte)i3;
        System.out.println("b4: " + b4);

        char letter = 65;
        char letter2 = 'A';
        System.out.println("letter2:  " +letter2);
int i9 = 500;
long i1 = i9; // int is  smaller than long it'll automatically cast
        long l2 = 200;
                int i11 = (int)l2;

                long l3 = 1_000_000_000_000L;
                int i12 = (int)l3; //ecplicit
        System.out.println();



    }


}
