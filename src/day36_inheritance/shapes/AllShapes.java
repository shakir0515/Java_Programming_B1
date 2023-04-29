package day36_inheritance.shapes;

public class AllShapes {
    public static void main(String[] args) {
        Square obj1 = new Square(3.0);
        System.out.println(obj1);
        System.out.println(obj1.area());
        System.out.println(obj1.perimeter());


        System.out.println("-----------------");
        Circle obj2 = new Circle( 1.5);
        System.out.println(obj2);
        System.out.println(obj2.area());
        System.out.println(obj2.perimeter());
    }
}