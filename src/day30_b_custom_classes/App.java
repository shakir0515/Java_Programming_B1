package day30_b_custom_classes;

public class App {

    String name;
    double version;
    boolean isFree;

    public void run () {
        System.out.println(name + " is running");
    }
    public void update (){
        System.out.println(name + " is updated");
        version += 0.1;
    }
}
