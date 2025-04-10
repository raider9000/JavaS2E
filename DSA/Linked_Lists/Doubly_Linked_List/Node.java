package DSA.Linked_Lists.Doubly_Linked_List;
//This is the node class of the singly linked list , this node 
//class is sused to create a typical node of a linked list
public class Node {
    //This is the data part of the node
    int data;
    //This is the next part of the node , which stores the reference of the 
    //next node of the linked list , as a result it is of the type Node 
    Node next;

    //This is the prev part of the node , which stores the reference of the 
    //previous node of the doubly linked list. 
    Node prev;

    //This is the constructor of the node class
    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    //This is the toString method of the node class , if want a custom toString printout

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", prev=" + prev + ", next=" + next +
                '}';
    }
}
