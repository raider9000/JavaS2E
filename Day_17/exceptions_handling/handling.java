package Day_17.exceptions_handling;
//this class deals with excception handling and exceptions in general
public class handling {
    //[Note :-] All typs of exceptions are created during the execution of the program at the runtime. 
    //Both the compilation Exception and runtime exception is created during the runtime of the program.
    public static void main(String[] args) {
        System.out.println("main Start");
        System.out.println(10/0); //this returns an arithmetic exception 
        //an exception is an object which is created during the runtime , which is thrown when such an exception occurs.
        //The exception object is given to the runtime system , as no specific exception handling codeis written , so the exception is given back to the JVM.
        //The JVM has the default logic for handling the exception , which is executed and throws the eception during runtime. 
        System.out.println("end");


        String s = null;
        System.out.println(s.toUpperCase());//this generates nullpointer exception 
    }
}
