package day36_inheritance.final_example;

public class Main  {

}


class Parent {

    // Normally order goes: Access Modifiers -- final keyword -- return type -- method name.
    public  void walk() {
        System.out.println("You are walking");
    }

}


class Child extends Parent {

    @Override
    public final void walk() {
        System.out.println("You are walking");
    }


    // If it is in the same class we can still overload the final method.
//    public void walk (int i) {
//        System.out.println("Test");
//    }


}

class GrandChild extends Child {

//    public final void walk() {
//        System.out.println("You are walking");
//    }
}



// This will not work because FinalExample class has final keyword which makes it non-extendable.
//class Test extends FinalExample {{
//
//
//        public Main () {
//            super(10);
//        }
//}