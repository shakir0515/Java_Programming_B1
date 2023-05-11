package day40_exception;

public class Person {
    private String name;
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name)  throws Exception{
        if (name == null) {
            throw new Exception("Name cannot be null");
        }


    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
