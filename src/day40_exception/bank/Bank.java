package day40_exception.bank;

public class Bank {

    double balance;

    public void withdraw (double amountToTakeOut) {
        if (amountToTakeOut > balance) {
            throw new NotEnoughMoneyException();
        }
    }



    public void login (String username, String password) throws InvalidCredentialException{

        if (!username.equals("tomjerry")) {
            throw new InvalidCredentialException("Not valid username");
        }

        if (!password.equals("0000")) {
            throw new InvalidCredentialException("Not valid password");
        }

    }


}
