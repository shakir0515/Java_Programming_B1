package day43_map;

public class Student {
    /*Declare 2 instance variables name gp id
    * create a constructor that accepts 3 arguments and initialize them in constructor
    * make toString method to info about object
    * */
    public String name;
    public double gpa;
    public int id;

    public Student(String name, double gpa, int id   ) {
        this.name = name;
        this.gpa = gpa;
        this.id = id;
}
    @Override
    public String toString() {
        return "Student-" +
                "name=" + name +
                ", gpa=" + gpa +
                ", id=" + id;
    }
}
