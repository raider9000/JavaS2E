//This is the Day_10 of the training and the Single line and Multi line 
//static initializers are demonstrated here
public class Static_stuff {
    //This is the multi line static block 
    //[Note] :- This static block will be executed even before the Main 
    //method is executed. Static blocks are always executed first before 
    //the main method. 
    static{
        System.out.println("Inside the Multiline Static Block");
    }
    //[Note] :- Static initializer cannot be called by the user or programmer 
    //It is called only by the JVM during execution of the program before it 
    //executes the main method. 

    //A class can have multiple static blocks 
    //The execution of the blocks are according to the order that is 
    //written in. So the first static block is executed and the 2nd one 
    //and so on.
    static{
        System.out.println("Inside the 2nd Multiline Static Block");
    }

    //once the static block is executed , The main method is executed.
    public static void main(String args[]){
        System.out.println("Inside Main Method");
    }
}
