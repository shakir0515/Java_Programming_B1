package day31_custom_classes;

public class UsingCar {
    public static void main(String[] args) {

        Car carOne = new Car();
        Car carTwo = new Car();

        carOne.model = "Volvo";
        carOne.year = 2023;
        carOne.color = "Silver";
        carOne.fuelLevel = 80;


        System.out.println(carOne);
        //System.out.println(carTwo);



        carOne.fillTank();
        System.out.println("-------");
        System.out.println(carOne);

        carOne.fillTank(50);
        System.out.println(carOne);


    }

}
