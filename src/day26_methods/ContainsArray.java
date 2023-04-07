package day26_methods;
/*
Contains

create a method that will accept an int array and an int number*/
public class ContainsArray {

public static boolean containArr (int [] arr, int num) {

    for (int each: arr) {
        if (each == num) {
          return true;
        }
    }
return false;
}
}
