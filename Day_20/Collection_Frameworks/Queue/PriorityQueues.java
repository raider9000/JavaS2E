package Day_20.Collection_Frameworks.Queue;
import java.util.PriorityQueue;
public class PriorityQueues {
    public static void main(String[] args) {
        PriorityQueue<Integer> que = new PriorityQueue<Integer>();
        
        //The following gives a classCastException as priority queue
        //uses minHeap internally and minHeap doesnot allow for 
        //heteregenous data adn Null values.
        // Integer a = 123;
        // que.add(a);
        // que.add("String");

        que.add(1132);
        que.add(234);

        System.out.println(que);
        //[Note : ] That the basics of a minHeap is used.
        //The most priority element(least element) is going to be at the top 
        //simple mean heap concept where minHeap characteristics are applied
        //For the comparisions , the priorityQueue has an internally defined 
        //compare method and implements the comparator interface. 
    }
}
