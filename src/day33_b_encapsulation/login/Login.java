package day33_b_encapsulation.login;

public class Login {
    private String username;
    private String password;


    public void setUserName (String username) {
        this.username = username;
    }

    public void setPassword (String password) {
        if (password.length() >= 8) {
            this.password = password;
        }
    }


    public String getUserName () {
        return username;
    }

    public String getPassword (String username){
        if (this.username.equals(username)) {
            return password;
        }
        return "Not correct username";
    }

}
