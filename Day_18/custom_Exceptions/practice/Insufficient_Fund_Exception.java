package Day_18.custom_Exceptions.practice;

public class Insufficient_Fund_Exception extends RuntimeException{
    String message;
    public Insufficient_Fund_Exception(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
}
