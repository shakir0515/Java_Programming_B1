package day31_custom_classes;

public class Phone {
    String name;
    String brand;
    int memory;
    double version;


    // create a constructor that accepts only ONE parameter which name
    public Phone (String name){
        this.name = name;
    }

    // Create another constructor that accepts TWO parameters which are name and brand
    public Phone (String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    // Create another constructor that accepts FOUR parameters which are name, brand, memory, version
    public Phone(String name, String brand, int memory, double version) {
        this.name = name;
        this.memory=memory;
        this.version=version;
        this.brand=brand;
    }


//    @Override
//    public String toString() {
//        return "Phone" +
//                "\nName: " + name +
//                "\nBrand: " + brand +
//                "\nMemory: " + memory +
//                "\nVersion:" + version;
//    }


    // This is if we want to customize our toString() method.
    @Override
    public String toString() {
        String result = name;

        if (brand == null) {
            result += "\nBrand: Will be determined";
        } else {
            result += "\nBrand: " + brand;
        }

        if (memory == 0 ) {
            result += "\nMemory: Will be determined";
        } else {
            result += "\nMemory: " + memory;
        }

        if (version == 0.0) {
            result += "\nVersion: Will be determined";
        }else {
            result += "\nVersion: " + version;
        }

        return result;

    }



}
