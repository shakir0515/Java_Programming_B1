package day40_exception;

public class PersonObject {
    public static void main( String [] args) {
        Person p = new Person();

        try {
            p.setName(null);
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }


        System.out.println(p.getName());
        System.out.println(p.getAge());
    }


}
