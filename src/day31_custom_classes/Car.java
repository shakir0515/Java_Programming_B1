package day31_custom_classes;

public class Car {
 /*
    create instance variables:
    model, year, color, fuel level (percent number)
     */

    String model;
    int year;
    String color;
    int fuelLevel;



    public String toString() {
        return "Car: " +
                "\nmodel: " + model +
                "\nyear: " + year +
                "\ncolor: " + color +
                "\nfuelLevel: " + fuelLevel;
    }


    /*
        - fillTank(): [void]
        prints: filling tank
        fuel level will be maxed at 100
     */
    public void fillTank () {
        System.out.println("filling tank");
        fuelLevel = 100;
    }

    public void fillTank (int level) {
        System.out.println("filling tank");
        fuelLevel = fuelLevel + level;
    }
}
