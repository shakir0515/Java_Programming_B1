package day34_b_encapsulation.square;

public class UsingSquare {
    public static void main(String[] args) {

        Square obj1 = new Square(22);
        //obj1.side = 22;
        obj1 = new Square(44);


        Square obj2 = new Square(-33);
        //System.out.println(obj2.side); //since side is private I cant access this was
        System.out.println(obj2.getSide()); //


        Square obj3 = new Square(55);
        System.out.println(obj3.getSide()); //


        System.out.println(obj3.calculateArea());
        System.out.println(obj3.calculatePerimeter());

    }
}
