package Day_21.Lamda_Expressions.Interfaced;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;

//This is a lamda expression that is assigned to the interface type during runtime
public class Driver {
    public static void main(String[] args) {
        //Here , as lamda expression is an anonymous function and targets only functional interfaces , 
        //This is possible as both Demo1 and Demo2 have only one method , making them functional interface 
        //So this lamda expression is able to access the interfaces 
        //If more than one method is present in the interface , will result in an error as it will no longer 
        //be a functional interface. 
        Demo1 d1 = () -> System.out.println("HI");//for such single lined lambda expression it is mandatory to not use return statements
        //The value is by default returned in single lined lambda expression. 
        Demo2 d2 = () -> System.out.println("HELLO");

        //Here , the methods of the interface is called but the value is printed because the lamda function gives the body for the single method present in the functional interface. 
        d1.Print();
        d2.greet();

        //[Note : ] If there are multiple lines in a lambda expression , use curly braces. 
        //Now trying it with the Demo3 interface :- 
        Demo3 d3 = (int x , int y) -> {
                if(x > y) return x;
                else return y;
        };  //semi-colon is important after lambda expression ends 
        //Now using the above method to get the result 
        int a = d3.check(123, 33);


        //Now using the comparator class with the lambda expression 
        List<Integer> l1 = Arrays.asList(1 , 234, 4323 , 656 , 66);
        System.out.println(l1);

        //Basically the body of the compare() method is given inside this lambda expression 
        //And on this definition , the Collections.sort() method implicitly calls this to sort the array
        Comparator<Integer> comp = (o1 , o2) -> o2 - o1; //Simple logic for descending order 
        Collections.sort(l1 , comp);
        System.out.println(l1);
    }
    
    
    //[Note : ] The lambda expression basically is the body of the abstract method of the functional interface.
    //So whatever was meant to be written in a seperate class or by overriding , this is done directly within the function or specific place where such an implementation is required without making
    //another class for overriding the functional interface method. 
}
