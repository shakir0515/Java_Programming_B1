package day33_b_encapsulation.login;

public class UseLogin {
    public static void main(String[] args) {
        Login obj1 = new Login();
//        obj1.username = "test";  // Cannot access private instance variables
//        obj1.password = "12345"; // Cannot access private instance variables



        obj1.setUserName("test");
        obj1.setPassword("123");


        obj1.setPassword("123456789");


        System.out.println("Obj1 password is: " + obj1.getPassword("test") );
        System.out.println(obj1.getUserName());



        Login obj2 = new Login();
        obj2.setUserName("Ruslan");
        obj2.setPassword("2015Ruslan_@");
        //System.out.println(obj2.password);
        System.out.println(obj2.getPassword("Ruslan"));



    }
}
