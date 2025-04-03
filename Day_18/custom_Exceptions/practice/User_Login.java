package Day_18.custom_Exceptions.practice;

public class User_Login {
    private int pin = 1234;

    public void login(int pin) {
        if (this.pin == pin) {
            System.out.println("Login Successful");
        } else {
            throw new Invalid_Credentials_Exception("Invalid Pin");
        }
    }

    public void withdraw(int amount) {
        if (amount > 1000) {
            throw new Insufficient_Fund_Exception("Insufficient Funds");
        } else {
            System.out.println("Withdrawal Successful");
        }
    }
}
