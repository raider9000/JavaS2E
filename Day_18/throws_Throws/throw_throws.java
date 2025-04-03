package Day_18.throws_Throws;
import java.sql.SQLException;

//this class deals with the throw and throws keywords in java
public class throw_throws {
    public static void main(String[] args) {
        try{
            //calling the div method with 10 and 0 as arguments
            div(10,0);
        }
        catch(Exception e){
            //this catch block handles the exception thrown by the div method
            //prints the stack trace of the exception
            e.printStackTrace();
        }
    }

    //here ,this exception awares the compiler that the method can throw an exception , this occurs during the compile time.
    //using the throws keyword to declare that this method can throw an exception beforehand by the programmer and any runtime exception has to be handled by the programmer calling the method  

    public static void div(int x , int y) throws SQLException , ArithmeticException{ 
        //throwing of the exceptions can be in any order , seperated by commas

        //here , it throws an exception if the denominator is 0 , this is a runtime exception and the compiler is unaware of runtime exceptions.
        System.out.println(x/y);
    }

    //[note :-] Runtime exceptions are unchecked exceptions as the compiler has no way of knowing this before hand , as a result no such error is generated during compile time. 

    //[note:- ] Checked exceptions are exceptions that are checked at compile time and the programmer has to handle them before hand , such as SQLException, IOException, etc.

    //[note :-] Only having a single checked exception , makes the programmer aware of the exception and the programmer has to handle it during calling that method and the parent exception class is considerd as a checked exception.


    public static void divide(int x , int y) throws SQLException{
        //this method throws an exception if the denominator is 0
        if(y==0){
            //throwing an exception
            //The throws keyword is used to deliberately explicity throw an exception , with a message
            //As defined , this is a SQLException but can be any other exception as long as it is a checked exception and defined above in the method declaration.
            //This message is passed to the constructor of the SQLException class , which when executed in the runtime will show this message in the terminal window during runtime
            throw new SQLException("Denominator cannot be zero");
        }
        else{
            System.out.println(x/y);
        }
    }


}
