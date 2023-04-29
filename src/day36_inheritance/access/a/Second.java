package day36_inheritance.access.a;

// DIFFERENT class by SAME package
public class Second {

    public static void main(String[] args) {

        //Second obj2 = new Second();
        // This Second class obj can ONLY access to iTS OWN class instance.


        //Thi sis the class we want to use the object access to FIRST class instances
        First obj = new First();
        System.out.println(obj.one);
        System.out.println(obj.two);
        System.out.println(obj.three);
        //System.out.println(obj.four);
        // Since the instance variable four is private it is only accessible in the class level. If we want to access them we can do it indirectly by using Setters and Getters


    }


}