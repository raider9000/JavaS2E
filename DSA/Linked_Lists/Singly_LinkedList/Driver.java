package DSA.Linked_Lists.Singly_LinkedList;
import java.util.Scanner;
public class Driver {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean flag = true;
    Singly_Linkedlist sll = new Singly_Linkedlist();
    
    while(flag){
        System.out.println("Enter 1 to insert a node");
        System.out.println("Enter 2 to display the linked list");
        System.out.println("Enter 3 to exit");
        System.out.println("Enter 4 to update a node");
        System.out.println("Enter 5 to insert a node at a specific index");
        int choice = sc.nextInt();
        
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
            case 4:
                System.out.println("Enter the index of the node to be updated");
                int index = sc.nextInt();
                System.out.println("Enter the data to be updated");
                int newData = sc.nextInt();
                sll.update(index, newData);
                break; 
            case 5:
                System.out.println("Enter the index where you want to insert :");
                index = sc.nextInt(); sc.next();
                System.out.println("Enter the data to be inserted");
                data = sc.nextInt();
                sll.insert_at_Index(index, data);
                break;
            default:
                System.err.println("Invalid choice");
        }
       
    }
    sc.close();
}
}
