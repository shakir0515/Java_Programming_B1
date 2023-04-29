package day36_inheritance.access.b;

import day36_inheritance.access.a.First;

//DIFFERENT PACKAGE and DIFFERENT CLASS but with INHERITANCE relation
public class Fourth extends First {
    public static void main(String[] args) {

        //Fourth obj = new Fourth();
        // This Fourth class obj can ONLY access to iit OWN class instance.
        First obj = new First();
        System.out.println(obj.one);
//        System.out.println(obj.two);
//        System.out.println(obj.three);
//        System.out.println(obj.four);
        // The above Line 12, 13, 14 are not accessible withe the Parent class obj in the Child class


        Fourth obj2 = new Fourth();
        System.out.println(obj2.one);
        System.out.println(obj2.two);
//        System.out.println(obj2.three);
//        System.out.println(obj2.four);

        //Line 19: -  Since there INHERITANCE between FOURTH class and FIRST class, the object of FOURTH cass inherits all the accessible fields and methods of itw PARENT class. In this case, since the child class is in a DIFFERENT package, I am still able to access the PROTECTED and PUBLIC variables/methods.


        //Line 20 - is default. It will be ONLY accessible in the SAME package


        //Line 21 - private. It is ONLY available in the SAME class




    }


}
