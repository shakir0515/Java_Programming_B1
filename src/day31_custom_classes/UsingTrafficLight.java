package day31_custom_classes;
public class UsingTrafficLight {
    public static void main(String[] args) {

        TrafficLight lightOne = new TrafficLight();
        lightOne.color = "Red";  // Initializing the instance variable
        System.out.println(lightOne.color);

        TrafficLight lightTwo = new TrafficLight("Green");
        System.out.println(lightTwo.color);

        TrafficLight lightThree = new TrafficLight("Yellow");
        System.out.println(lightThree.color);



        TrafficLight lightFour = new TrafficLight();
        TrafficLight lightFive = new TrafficLight();
        System.out.println(lightFour.color);
        System.out.println(lightFive.color);
    }

}




