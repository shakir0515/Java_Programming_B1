package day33_b_encapsulation.traffic;

public class Road {
    public static void main(String[] args) {

        TrafficLight light = new TrafficLight("YeEllow");

        // System.out.println(light.color);
        // light.color = "red";

        TrafficLight light2 = new TrafficLight("grey");
        System.out.println(light2.getColor()); //


        TrafficLight light3 = new TrafficLight("Green");
        System.out.println(light3.getColor()); //


    }


}
