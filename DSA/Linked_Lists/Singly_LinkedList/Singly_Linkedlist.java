package DSA.Linked_Lists.Singly_LinkedList;
//this is a very basic example of a singly linked list 
public class Singly_Linkedlist {
    Node head; //This is the head of the linked list

    //Tail is used to keep the referenne of the last node of the Linked list 
    //This is done to not traverse the entire linked list everytime to add a 
    //new element 
    Node tail;
    int size;

    public void Insert(int data){
        //creating an object of node type and storing 10 as data through the 
        //parameterized constructor of the node class
        Node node1 = new Node(10);

        if(head  == null){
            head = node1;
            tail = node1;
            size++;
        }
        else{
            tail.next = node1;
            tail = node1;
            size++;
        }
    }


    //simple method to display the contents of th linked list
    public void Display(){
        //Current to hold the head reference
        Node current = head;

        //if empty head will be null , so printing null
        if(current == null){
            System.out.println("The linked list is empty");
            return;
        }

        //simple linked list to traverse the linked list and print all the data elements 
        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println();
    }
}
