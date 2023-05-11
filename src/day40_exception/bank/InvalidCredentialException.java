package day40_exception.bank;

public class InvalidCredentialException extends Exception {

    public  InvalidCredentialException (String msg) {
        super(msg);
    }

}
