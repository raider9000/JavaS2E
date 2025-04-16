package Day_20.Collection_Frameworks.Stacks;
import java.util.Stack;

//This class shows a basic implementation of the stack collection
public class Stacked {
    public static void main(String[] args) {
        //The warning is coming because we are using rawType and not passing any specific
        //type like Stack<String> list. 
        Stack list = new Stack();
        list.push("A");
        list.push("B");
        list.push("C");
        list.push("D");
        list.push(69);
        list.push(69.69f); //here we can see heterogeneous values are being added
        list.push(null);
        //This is just the normal stack that is simply written in 
        //the java collections framework. 

        System.out.println(list);
        list.pop(); //This will remove the last element of the stack
        System.out.println(list);
        System.out.println(list.peek()); //This will return the last element of the stack without removing it

        //Other methods of Stacks
        //This returns the element at that index position given  
        list.get(0); //This will get the element at the 0th position of the stack

        list.push("A"); //This will add the element at the last position of the stack
        System.out.println(list);
        list.set(2, "B"); //This will set the element at the 2nd position of the stack
        System.out.println(list);
        list.add(2, "C"); //This will add the element at the 2nd position of the stack
        System.out.println(list);
        list.remove(2); //This will remove the element at the 2nd position of the stack
        System.out.println(list);   
        list.clear(); //This will clear the stack
        System.out.println(list); //This will print the empty stack
    }
}
