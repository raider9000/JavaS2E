package Day_17.exceptions_handling;
import java.util.InputMismatchException;
import java.util.Scanner;

//this class deals with multiple catch blocks in a try block
public class multiple_catches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("enter a number :");
            int x = sc.nextInt(); //will not accept anythig besides int , so an exception possible
            System.out.println("Enter another number :");
            int y = sc.nextInt();
            System.out.println(x/y);//possiblity of y being 0 and giving a arithmetic exception

        }catch(ArithmeticException e){
            System.out.println("Arithmetic excpetion handled");
        }catch(InputMismatchException e){
            System.out.println("Input mismatch exception handled");
        }//here the different type of error producing code is written in a new try block , which is the more cleaner and better way of writing readable code
        //This is because the array based code is not dependent on the above code and as a result , this is put in a new try block 
        try{
            int arr[] = {1 ,2 ,3 , 4, 5};
            System.out.println("Enter the index to search for :");
            System.out.println(arr[sc.nextInt()]);//arrayindex out of bounds error possible 
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounds exception handled");
        }
        try{Class.forName("something");} //here if class not found exception occurs , the generic catch block will handle it. 
        catch(Exception e){ //this handles generic exceptions , any exception. 
            System.out.println("This is a generic exception handler");
        }

        //the generic catch block that can handle any exception is needed to be placed at the last
        //of all catch blocks , as no other catch blocks below the generic catch block will be executed. 
    }
}
