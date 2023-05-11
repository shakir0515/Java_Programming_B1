package day40_exception.bank;

public class NotEnoughMoneyException extends RuntimeException {

    // This is unchecked / runtime exception since it inherits the RuntimeException class
    public NotEnoughMoneyException () {
        super("Not enough money");
    }


    public NotEnoughMoneyException (String msg) {
        super(msg);
    }
}
