package DSA.Queue;

public class Array_Based_Queue {
    private int maxSize;
    private int front;
    private int rear;
    private int[] queueArray;

    public Array_Based_Queue(int size) {
        this.maxSize = size;
        this.front = -1;
        this.rear = -1;
        this.queueArray = new int[maxSize];
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if (isEmpty()) {
            front = 0;
        }
        rear++;
        queueArray[rear] = value;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int value = queueArray[front];
        front++;
        if (front > rear) {
            front = -1;
            rear = -1;
        }
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queueArray[front];
    }

    public boolean isEmpty() {
        return front == -1 || front > rear;
    }

    public boolean isFull() {
        return rear == maxSize - 1;
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queueArray[i] + " | ");
        }
        System.out.println();
    } 
}
