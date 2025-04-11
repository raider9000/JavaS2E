package DSA.Hash_maps.Object_class_Implementation_Hashmap;
//This is basically the linked list that will do the linear probing
public class Entry {
    //it holds both the key and value pair
    Object key , value;

    //The next node of the linked list in the array of linked list on every array index
    Entry next;
    
    //basic constructor of the Entry class 
    Entry(Object key , Object value){
        this.key = key;
        this.value = value;
    }
}
