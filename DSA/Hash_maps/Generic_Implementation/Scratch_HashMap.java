package DSA.Hash_maps.Generic_Implementation;

//using the inbuilt linked list class from the utility package 
import java.util.LinkedList;
//This class has a custom written hashmap implementation from scratch

//The <K,V> syntax is used to define a generic class , hence accepting the generic types 

public class Scratch_HashMap<K ,V> {

    //This is the node class for storing the key and value pairs 
    //and using the generics , makes the class to handle different types of 
    //data dynamically 

    //This is the node of linked list that will be used for linear probinng in the 
    //indexes of the array of LinkedList. 
    private static class Node<K,V>{
        K key ; V value; //the K and V are generic classes in order to handle any types of non-primitive data its like Integer a ; String b; but of generic type.
        //as a result , K and V is capital 

        //The constructor of the node class , that assings the key and value 
        Node(K key , V value){
            this.key = key;
            this.value = value;
        }

        private LinkedList<Node<K,V>>[] Bucket; 
        
    }
}
