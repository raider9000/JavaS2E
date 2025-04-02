package Day_17.exceptions_handling;
import java.util.Scanner;
//this class deals with the finally block , which is used along with the try and catch block
public class Finally_block {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers :");
        try{
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(x/y);
            sc.close();
        }
        catch(Exception e){
            System.out.println("Exception Handled");
        }
        //The finally block gets executed regardless whether there is an exception or 
        //if the exception is handled , it will always get executed after the try or even catch handling the exception.
        finally{
            sc.close();//here regardless handling of the exception is done or not , the scanner is closed at the end. 
            System.out.println("Finally block");
        }
    
    try(Scanner scan = new Scanner(System.in)){
        //This is a try with resource block , this closes the expensive resources inside the try block 
        //after the try block has executed. 
        int x = scan.nextInt();
        System.out.println(x);
        //the sc.close() automatically happens without explicit calling , all types of resources such as buffered reader , etc gets auto closed. 

    }
    
    
    }
}
