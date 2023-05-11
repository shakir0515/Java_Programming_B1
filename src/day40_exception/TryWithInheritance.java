package day40_exception;

public class TryWithInheritance {
    public static void main(String[] args) {

        try {

        } catch (IndexOutOfBoundsException e) {   // 1st more specific

        } catch (RuntimeException e) {    // 2sn more specific

        } catch (Exception e) {  // 3rd more specific

        }


//        try {
//
//        } catch (Exception e ) {   // 3rd more specific
//
//        } catch (RuntimeException e) {    // 2sn more specific
//
//        } catch (IndexOutOfBoundsException e ) {  // 1st more specific
//
//        }


/*
    What is the possible reference for IndexOutOfBoundsException
        IndexOutOfBoundsException e1 = new IndexOutOfBoundsException();
        RuntimeException e2 = new IndexOutOfBoundsException();
        Exception e3 = new IndexOutOfBoundsException();

 */


    }
}
