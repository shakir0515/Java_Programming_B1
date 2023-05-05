package day38_a_abstraction.interface_methods;

public class MacbookPro implements Mac {


    @Override
    public void turnOn() {
        System.out.println("mac is turning on....");
    }

}


class Runner {
    public static void main(String[] args) {

        System.out.println(Mac.NAME);
        System.out.println(Mac.OS);

        // NOT GOOD PRACTICE because anything static belong sot he class
        // You can acccess to the static variable from the child class but not good way to do.
        // The reason is because we would now know which class/interface those static variables belongs.
        //System.out.println(MacbookPro.NAME);
        //System.out.println(MacbookPro.OS);


        System.out.println("----------");
        Mac.company();

        //Mac.turnOn();
        // Parent interface can not reach the implementation which is in child class

        System.out.println("----------");

        MacbookPro mc = new MacbookPro();
        mc.turnOn();
        mc.faceTime();
        //mc.company();
        // static method from an interface are not inherited, so they cannot be accessed from objects, only by the interface name.




    }
}