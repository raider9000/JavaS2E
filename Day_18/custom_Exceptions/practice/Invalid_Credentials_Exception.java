package Day_18.custom_Exceptions.practice;

public class Invalid_Credentials_Exception extends RuntimeException{
    private String message;

    public Invalid_Credentials_Exception(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
