package day33_b_encapsulation.traffic;

public class TrafficLight {
    private String color;

    public TrafficLight (String color) {
        setColor(color);
    }


    public void setColor (String color) {
        if (color.toLowerCase().equals("yellow")){
            this.color = color;
        } if (color.toLowerCase().equals("red")){
            this.color = color;
        } if (color.toLowerCase().equals("green")){
            this.color = color;
        }
    }


    public String getColor () {
        return color;
    }


}
