package day08_scanner_logical_operators;

public class Speeding {
    public static void main (String [] args) {
        /* declare 3 variables
        current speed
        speed limit
        speeding
        "Is this person speeding?" true or false
         */
        int currentSpeed = 92;
                int speedLimit = 45;
        boolean isSpeeding = currentSpeed >= speedLimit;
        System.out.println("Is this person speeding?" +isSpeeding);
    }
}
