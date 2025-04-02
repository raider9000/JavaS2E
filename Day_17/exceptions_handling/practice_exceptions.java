package Day_17.exceptions_handling;
//This shows the example of a stack trace , where the java runtime system checking for error handling methods
//first in the current stack which is the gamma stack , here , the exception first occurs in the gamma stack and the 
//exception object is thrown from the called stack to caller stacks , known as exception propagation. 
//The exception thrown at gamma will now be rethrown at the beta stack(caller) as java runtime system
//did not find any exception handling method in gamma and this goes on till main method where jvm is 
//and the jvm has the default exception handler and finally shows the exception in the execution window.
public class practice_exceptions {
    public static void main(String[] args) {
        alpha();
    }
    public static void alpha(){
        System.out.println("Alpha");
        beta();
    }
    public static void beta(){
        System.out.println("Beta");
        gamma();
    }
    public static void gamma(){
        System.out.println("Gamma");
        //[Note :-] Exceptions outside the try block will not be handled by the catch block.
        try {
            System.out.println(10/0); //this throws an exception , and we are tying to handle this exception 
            //using the try catch block. The catch statement will catch the exception object created during run time
            //Any statements after the exception occurance in the try block will not be executed as the control is transfered to the catch block which then executes.  
        } catch (ArithmeticException e) {
            //Here, when the obejct is created and the exception object is created during the runtime and the suntime system checks for the current method for an exception handler , which is present in the gamma.
            //so it executes that and if the exception occurs , the catch block gets executed , if no exception object inside the try block created , then catch block will not execute. 
            System.out.println("Arithmetic Exception handled");
        }
    }

    //This prints alpha beta gama and arighmetic exception , as the code executes till a logical 
    //exception is encountered , when the exception object is created and thrown during the runtime 
    //of the program.
}
