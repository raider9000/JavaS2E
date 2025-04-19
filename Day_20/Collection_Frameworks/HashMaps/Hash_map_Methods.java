package Day_20.Collection_Frameworks.HashMaps;
import java.util.HashMap;
public class Hash_map_Methods {
    public static void main(String[] args) {
        //Implementing a simple HashMap
        HashMap<Integer , String>  hm = new HashMap<>();
        //[Note :] Insertion order cannot be predicted 
        //[Note :] default capacity is 16 and Load Factor is 0.75
        //HashMap does not sort , it does not sort using keys 


        //Both values can be Heterogeneous , the keys and values 
        //Keys can also be null (For key only one null is allowed as keys cannot be duplicate)
        //Adding elements in the hashMap 
        hm.put(1, "Something"); // added a key value pair 

        //[Note :] Almost all the methods of a TreeMap works on HashMap also 

        //[Note :] LinkedHashMap is same as HashMap but a bit slower , here the insertion order is maintained unlike HashMap 

        //Use the other maps , the methods are similar to each other , but the internal structure and way of storing the data is a bit different.
    }
}
