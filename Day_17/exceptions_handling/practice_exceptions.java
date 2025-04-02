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
        System.out.println(10/0);
    }

    //This prints alpha beta gama and arighmetic exception , as the code executes till a logical 
    //exception is encountered , when the exception object is created and thrown during the runtime 
    //of the program.
}
