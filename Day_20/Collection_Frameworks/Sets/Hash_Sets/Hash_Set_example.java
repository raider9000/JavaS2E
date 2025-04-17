package Day_20.Collection_Frameworks.Sets.Hash_Sets;
import java.util.HashSet;

//This class deals with the application of hashset
public class Hash_Set_example {
    public static void main(String[] args) {

        //[Note :] The hashSet messes up the insertion order and as a result , the order that it prints 
        //in is unpredictable.

        //[Note :] It is used when fast access to elements are required and duplicate values should not be present
        
        HashSet<Integer> hs = new HashSet<>();

        hs.add(12);
        hs.add(132);
        hs.add(35);
        
        System.out.println("Size : " + hs.size());

        hs.add(12); //As hashset does remove duplicates innately , so this duplicate value is not present in the hashset 
        System.out.println(hs);

        //It is not neccessary that the data has to homogeneous , hashset can also store heterogeneous data

        HashSet<Object> hasher = new HashSet<>();

        hasher.add(13);
        hasher.add("String");
        hasher.add('a');
        hasher.add(145L);

        System.out.println(hasher);

        
    }
}
