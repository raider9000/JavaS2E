package DSA.Linked_Lists.Singly_LinkedList;
import java.util.Scanner;
public class Driver {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean flag = true;
    while(flag){
        System.out.println("Enter 1 to insert a node");
        System.out.println("Enter 2 to display the linked list");
        System.out.println("Enter 3 to exit");
        int choice = sc.nextInt();
        Singly_Linkedlist sll = new Singly_Linkedlist();
        switch (choice){
            case 1:
                System.out.println("Enter the data to be inserted");
                int data = sc.nextInt();
                sll.Insert(data);
                break;
            case 2:
                sll.Display();
                break;
            case 3:
                flag = false;
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
}
