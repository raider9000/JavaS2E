package DSA.Stacks.Array_based_Stacks;
import java.util.*;
public class Stack {
    private int maxSize;
    private int top;
    private int[] stackArray;

    public Stack(int size) {
        this.maxSize = size;
        this.top = -1;
        this.stackArray = new int[maxSize];
    }
    
    public void push(int value) {
        if(isFull()){
        Scanner sc = new Scanner(System.in);
            System.out.println("StackOverflow , Enter 1 to increase capacity ?");
            int choice = sc.nextInt();
            if(choice == 1){
                System.out.println("Enter new size");
                int newSize = sc.nextInt();
                this.maxSize = newSize;
                this.stackArray = Arrays.copyOf(this.stackArray, newSize);
                stackArray[++top] = value;
            } else {
                System.err.println("Stack OverFlow , Aborted!");
                throw new java.lang.StackOverflowError();
            }
        }else{
            this.stackArray[++this.top] = value;

        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stackArray[top--];
    }

    public int peek() {
        if (isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return stackArray[top];
    }

    public void DisplayStack(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.println("\t|  " + stackArray[i] + "   |");
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public boolean isFull() {
        return this.top == this.maxSize - 1;
    }
}
