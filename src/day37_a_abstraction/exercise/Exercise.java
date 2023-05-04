package day37_a_abstraction.exercise;

public abstract class Exercise {


    final String name;

    public Exercise (String name) {
        this.name = name;
    }

//    public void test(){
//        System.out.println("opt1");
//    }

    public abstract void performExercise();


    public abstract int getCaloriesBurned(int minutes);

}