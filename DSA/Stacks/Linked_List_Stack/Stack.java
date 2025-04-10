package DSA.Stacks.Linked_List_Stack;

public class Stack {
    //the top pointer points to the latest element and points to the element before that and so on 
    //in order to maintain the lifo organization 
    Node top;
    Node t;
    private int size;

    //the following is the constructor of the Stack 
    public Stack(){
        this.top = null;
        this.size = 0;
    }

    public boolean isEmpty(){
        return top == null;
    }
    
    public void push(int data){
        Node node = new Node(data);
        if(isEmpty()){
            top = node;
            size++;
        }else{
            node.next = top;
            top = node;
            this.size++;
        }
    }

    public void pop(){
        if(isEmpty()){
            System.err.println("Stack Underflow");
        }else{
           System.out.println("Element popped : " + top.data);
           Node current = top;
           top = top.next;
           current.next = null;
           size--;
        }
    }

    public void peek(){
        if(!isEmpty()) System.out.println("The top element = " + top.data);
        else System.out.println("Stack Empty");
    }

    public void displayStack(){
        Node current = top;
        while(current != null){
            System.out.println("\t|    " + current.data + "    |");
            current = current.next;
        }
    }
}
