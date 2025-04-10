package DSA.Linked_Lists.Doubly_Linked_List;
//this is a very basic example of a singly linked list 
public class Doubly_Linkedlist {
    Node head; //This is the head of the linked list

    //Tail is used to keep the referenne of the last node of the Linked list 
    //This is done to not traverse the entire linked list everytime to add a 
    //new element 
    Node tail;

    //this holds the size of the linked list
    int size;

    public void Insert(int data){
        //creating an object of node type and storing 10 as data through the 
        //parameterized constructor of the node class
        Node node = new Node(data);

        if(head  == null){
            head = node;
            tail = node;
            size++;
        }
        else{
            tail.next = node;
            node.prev = tail;
            tail = node; 
            size++;
        }
    }


    //simple method to display the contents of th linked list
    public void Display(){
        //Current to hold the head reference
        Node current = head;

        //if empty head will be null , so printing null
        if(head == null){
            System.err.println("The doubly linked list is empty");
            return;
        }

        //simple linked list to traverse the linked list and print all the data elements 
        while(current.next != null){
            System.out.print(current.data + " <- -> ");
            current = current.next;
        } System.out.println(current.data + " <- -> null");
        System.out.println();
    }

    public void update(int index, int data){
        //if the index is out of bounds
        if(index < 1 || index > size){
            System.err.println("Index out of bounds");
            return;
        }
        if(index == 1){
            head.data = data;
            return;
        }
        if(index == size){
            tail.data = data;
            return; 
        }
        //getting the head node to traverse the linked list upto the index using current 
        Node current = head;
        for(int i = 1; i < index; i++){
            //traversing the linked list upto the node in the given index 
            current = current.next;
        }
        //updating the int value in that node 
        current.data = data;
    }

    //simple method to insert a node at a given index
    public void insert_at_Index(int index , int data){
        if(index < 1 || index > size + 1){
            System.err.println("Index out of bounds");
            return;
        }
        else{
            Node current = head;
            for(int i = 1 ; i < index ; i++){
                current = current.next;
            }
            Node node = new Node(data);
            node.next = current.next;
            current.next.prev = node; 
            current.next = node;
            node.prev = current;
            size++;
        }
    }

    public void delete_last(){
        if(head == null){
            System.err.println("The linked list is empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        else{
            Node current = head;
            while(current.next.next != null){
                current = current.next;
            }
            current.next.prev = null;
            current.next = null;
            tail = current;
            size--;
        }
    }

    public void delete_at_Index(int index){
        if(head == null){
            System.err.println("The linked list is empty");
            return;
        }
        else{
            Node current = head;
            for(int i = 1 ; i < index - 1 ; i++){
                current = current.next;
            }
            Node temp = current.next;
            current.next = temp.next;
            temp = null;
            size--;
        }
    }

}
