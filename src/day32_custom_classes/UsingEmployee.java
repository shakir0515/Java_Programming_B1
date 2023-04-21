package day32_custom_classes;

public class UsingEmployee {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Parvana", "SDET");
        Employee emp2 = new Employee("Nazakat", 123, "QE", 125000.00);

        System.out.println(emp1);
        System.out.println("---------------");
        System.out.println(emp2);

    }
}
