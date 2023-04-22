package day33_a_static;

public class AppleStore {
    public static void main(String[] args) {

        Iphone phone1 = new Iphone("Iphone 14", 999.99);
        System.out.println(phone1);
        Iphone phone2 = new Iphone("Iphone 14 Pro", 1299.99);
        System.out.println(phone2);

        System.out.println("---------------");
        System.out.println(Iphone.company);
        System.out.println(Iphone.os);
        System.out.println(Iphone.appleDay);

        System.out.println("---------------");
        System.out.println(phone1.company);
        System.out.println(phone1.os);
        System.out.println(phone1.appleDay);


        System.out.println("---------------");
        System.out.println(phone2.company);
        System.out.println(phone2.os);
        System.out.println(phone2.appleDay);


        System.out.println("---------------");
        System.out.println("Android decided to uby Apple");
        Iphone.company = "Samsung";
        phone1.os = "Android";
        phone2.appleDay = true;


        System.out.println("---------------");
        System.out.println(Iphone.company);
        System.out.println(Iphone.os);
        System.out.println(Iphone.appleDay);

        System.out.println("---------------");
        System.out.println(phone1.company);
        System.out.println(phone1.os);
        System.out.println(phone1.appleDay);


        System.out.println("---------------");
        System.out.println(phone2.company);
        System.out.println(phone2.os);
        System.out.println(phone2.appleDay);


    }
}
