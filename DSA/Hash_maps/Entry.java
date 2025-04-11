package DSA.Hash_maps;
//This is basically the linked list that will do the linear probing
public class Entry {
    //it holds both the key and value pair
    int key , value;

    //The next node of the linked list in the array of linked list on every array index
    Entry next;
    
    //basic constructor of the Entry class 
    Entry( int key , int value){
        this.key = key;
        this.value = value;
    }
}
