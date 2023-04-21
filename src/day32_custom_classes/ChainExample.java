package day32_custom_classes;

public class ChainExample {

    public ChainExample () {
        System.out.println("First");
    }


    public ChainExample (int i) {
        this();
        System.out.println("Second");
    }

    public ChainExample (String s) {
        this(12);
        System.out.println("Third");
    }

    public ChainExample (double d) {
        this("test");
        System.out.println("Fourth");
    }

}
