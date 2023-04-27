package day34_a_static.computer;

public class Computer {

    // Data: brand, price, color
    String brand;
    double price;
    String color;


    // same data for all: hasScreen, hasBattery, hasMemory
    static boolean hasScreen, hasBattery, hasMemory;

    // make static block
    // print: Static block
    // initialize static variables
    static {
        System.out.println("Printing static block");
        hasScreen = false;
        hasBattery = true;
        hasMemory = false;

        // color = "Blue"; // static accepts only static
    }


    // make a constructor that initializes the instance variables
    public Computer (String brand, double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    }

