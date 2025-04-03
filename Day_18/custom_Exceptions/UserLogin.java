package Day_18.custom_Exceptions;
//this class deals with custom exception calls and basic login functionality
public class UserLogin {
    private int a = 1234;

    public void login(){
        if(this.a == 1234) System.out.println("Login Successful");
        else {
            //the custom error has to be an unchecked exception
                throw new Invalid_Pin_Exception("Invalid Pin");
        }
    }
}
//if the exception was a checked exception, we would have to handle it using try and catch explicitly in here 
//but since it is an unchecked exception, we can just throw the exception and it will be handled by the JVM here.

//when using this in the main method, we can use try and catch to handle the exception or simply just pass the values to UserLogin method and get a runtime exception. 