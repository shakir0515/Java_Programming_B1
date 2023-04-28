package day34_a_static.computer;

public class ComputerLab {
    public static void main(String[] args) {
        //Computer comp1 = new Computer(); // compile time exception
        Computer comp1 = new Computer("HP", 800, "Red");
        System.out.println(comp1.color);


        Computer comp2 = new Computer("Dell", 900, "Grey");
        System.out.println(comp2.color);

        System.out.println("-------------");
        System.out.println(Computer.hasScreen);
        System.out.println(Computer.hasBattery);
        System.out.println(Computer.hasMemory);


        System.out.println("-------------");
        System.out.println(comp1.hasScreen);
        System.out.println(comp1.hasBattery);
        System.out.println(comp1.hasMemory);


        System.out.println("-------------");
        System.out.println(comp2.hasScreen);
        System.out.println(comp2.hasBattery);
        System.out.println(comp2.hasMemory);


        comp1.hasBattery = false;
        System.out.println("**********");
        System.out.println(comp1.hasScreen);
        System.out.println(comp1.hasBattery);
        System.out.println(comp1.hasMemory);
        System.out.println("**********");
        System.out.println(comp2.hasScreen);
        System.out.println(comp2.hasBattery);
        System.out.println(comp2.hasMemory);
    }
}
