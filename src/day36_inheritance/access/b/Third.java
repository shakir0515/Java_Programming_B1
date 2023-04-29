package day36_inheritance.access.b;

import day36_inheritance.access.a.First;

// DIFFERENT clas and DIFFERENT package
public class Third {
    public static void main(String[] args) {

        //Third obj = new Third();
        // This Third class obj can ONLY access to iit OWN class instance.
        First obj = new First();
        System.out.println(obj.one);
//        System.out.println(obj.two);
//        System.out.println(obj.three);
//        System.out.println(obj.four);


        //Line 11 - is public and accessible in all project.
        //Line 12 - is protected. Since there is no INHERITANCE, it is not accessible in different package.
        //Line 13 - is default. It will be ONLY accessible in the SAME package
        //Line 14 - private. It is ONLY available in the SAME class

    }
}