package Day_18.custom_Exceptions;
//this class is a custom unchecked exception

//it extends the RuntimeException class which is a runtime exception , and is unchecked
public class Invalid_Pin_Exception extends RuntimeException {
    private String message; //message to be displayed when the exception is thrown

    //Constructor of the class
    public Invalid_Pin_Exception(String message) {
        this.message = message;
    }
    //method to return the message s
    public String getMessage() {
        return message;
    }
}
