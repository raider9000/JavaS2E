package Day_22.Higher_Order_Functions.Simple_Example;
//This is the Driver class containing the main method which houses the lamda expression
public class Driver {
    public static void main(String[] args) {
        //Making an object to access the method inside Test class , because it is a non-static method 
        Test t = new Test();

        //The following is the Lamda expression
        //The following , we are passing the lambda expression as the argument inside the greet method which takes the 
        //interface type argument. As lambda expression is an anonymous fuction , this is possible with interface 
        //Directly passing the interface definition using the lambda expression '\'
        t.greet(() -> System.out.println("Hi"));
    }
}
