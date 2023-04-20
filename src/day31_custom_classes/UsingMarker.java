package day31_custom_classes;

public class UsingMarker {
    public static void main(String[] args) {

        Marker markOne = new Marker("Dry Marker", "Sharpie",  "Blue");
        System.out.println(markOne);

        /*
        //Before we were initializing the instance variables this way.
            markOne.type = "Dry Marker";
            markOne.brand = "Sharpie";
            markOne.color = "Blue;
         */

    }
}
