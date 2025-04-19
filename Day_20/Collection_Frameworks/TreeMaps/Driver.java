package Day_20.Collection_Frameworks.TreeMaps;
import java.util.List;
import java.util.Arrays;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.Set;

//This class deals with the implementation of treemaps
public class Driver {
    public static void main(String[] args) {
        //Implementing treemap
        //simple tree map that doesnot take generics 
        TreeMap tm = new TreeMap<>();

        //It stores entries in key value pairs
        //[Note :] The keys have to be homogeneous but values can be of hetegeneous  
        tm.put(23 , "hello");
        tm.put(123 , 324);

        //Keys cannot be duplicate , if dpulicate key added , the value will get updated of the key of which duplicate is passed. 

        tm.put(23 , "mellow");
        //Now the key 23 will be updated to store the value "mellow"
        //However , there can be duplicate values 

        //Keys cannot be null but values can be null 


        //Now implementing labda expression inside the TreeMap constructor in order 
        //to give a custom sorting logic without using the comparator class and creating 
        TreeMap new_tm = new TreeMap<>((o1 , o2) -> (Integer)o1 - (Integer)o2);
        //The expression given inside the constructor is a lambda expression , which has a sorting logic to pass 
        //two generic objects and downcast it to Integer type and send the difference back. 
        //This lambda expression sorting logic is now being used by the TreeMap in order to sort the keys 

        System.out.println(tm.containsKey(23)); //This returns true as key is present 
        System.out.println(tm.containsValue("mellow")); //This returns true as "mellow" value is present
        System.out.println(tm.replace(22 , "blah"));//Here , as there is no key 22 , it will return NULL

        //it will return false if the key is not present and we use containsKey , same for value 
        
        //This returns the least key greater than the key passed or else the key it self. IF there are 
        //nothing greater than the key passed in arguement , it will return null. 
        //(This is possible as TreeMap stores the keys sorted by default by using the comparable/comparator logic inside the userdefined class)
        //[Note :] The keys are stored in an ascending order in TreeMap 
        System.out.println(tm.ceilingKey(2)); 


        //More examples 
        TreeMap<String , List<String>> map = new TreeMap<>();

        List<String> l1 = Arrays.asList("HEllo" , "Mellow" , "fellow");
        List<String> l2 = Arrays.asList("blah" , "something");
        
        map.put("new add" , l1);

        System.out.println(map);

        //Same way , a TreeMap can have a TreeMap as a value 
        TreeMap<Integer , TreeMap<Integer , String>> tm_new = new TreeMap<>();
        //This treeMap contains a TreeMap(Which contains Integer as a key and String as a Value) as a value and Integer as a key.
        //[Note :] In this same way , an ArrayList of ArrayLists and every other collection objects can be created. 

        //Using iterator for Map is not possible as it is not present in the map hierarchy 
        //in order to use iterator on Maps , we have to store each of the Map entry into an entry for a Set
        //this can be done by using the entrySet() , so that iterator can be used on a map indirectly. 

        //This creates a temporary set named s , which stores each and every entry of the TreeMap inside it using the entrySet method inside the TreeSet class 
        Set s = map.entrySet();

        //Now iterator can be used on the temporary Set which is created above 
        Iterator it = s.iterator();

        //Simple while loop can be made to iterate using the iterator object
        while(it.hasNext()){

            //here as each entry is an obejct , this print statement prints the object of each treeMap entry directly.
            System.out.println(it.next());
        }

        //While using for each loop , if the iterating temporary object is not specified , then the 
        //Default Object superclass type will be used
        //for a set such as 
        ///Set<Entry<Integer , String>> s = map.entrySet(); //The Set definition that takes Entry based object. 
        //example for(Entry<Integer , String> e : s ){} //The for each loop
        //if used for(O o : s){} // Will take it as an Object super class type and will not treat it as an Entry type.
        //To be safe , always downcast the classes back to the type being used needed. That's all 
        
        
         
    }
}
