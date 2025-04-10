package DSA.Stacks.Array_based_Stacks;
import java.util.Scanner;
public class Stack_Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the stack");
        int size = sc.nextInt();
        Stack stack = new Stack(size);
        int choice;
        while(true){
            System.out.println("1. Push\n2. Pop\n3. Peek\n4. Exit \n5. Display Stack");
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter the value to push");
                    int value = sc.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    System.out.println("Popped value: " + stack.pop());
                    break;
                case 3:
                    System.out.println("Top value: " + stack.peek());
                    break;
                case 4:
                    sc.close();
                    System.out.println("Exiting...");
                    System.exit(0);
                case 5:
                    stack.DisplayStack();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}   
