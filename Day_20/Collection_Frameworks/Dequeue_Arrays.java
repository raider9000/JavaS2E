package Day_20.Collection_Frameworks;

import java.util.ArrayDeque;

//This class deals with arraydequeue 
public class Dequeue_Arrays {
    //basically doubly linked queue and everythig same as queue 
    public static void main(String[] args) {
        ArrayDeque ad = new ArrayDeque<>();
        ad.add(10);
        ad.add("String");
        System.out.println(ad);

        System.out.println(ad.getFirst());
        System.out.println(ad.getLast());
        System.out.println(ad.isEmpty());
        System.out.println(ad.peek());
    }
}
