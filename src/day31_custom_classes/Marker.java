package day31_custom_classes;

public class Marker {
    String type;
    String brand;
    String color;

    public Marker (String inputType, String inputBrand,  String inputColor) {
        type = inputType;
        brand = inputBrand;
        color = inputColor;
    }

    @Override
    public String toString() {
        return "Marker{" +
                "\ntype" + type +
                "\nbrand='" + brand +
                "\ncolor='" + color ;
    }


    /*
        // The local variables type, brand and color are not getting assign to instance variables type, brand, color automatically like this. We still need to assign them in the body of the constructor.
        public Marker (String type, String brand,  String color) {

    }
     */
}



