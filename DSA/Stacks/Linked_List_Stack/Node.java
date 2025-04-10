package DSA.Stacks.Linked_List_Stack;

public class Node {
    Node next;
    int data;

    //constructor of the Node class , which makes the nodes of the linked list 
    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    //the following method overrides the toStirng method of the Linked list 
    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
