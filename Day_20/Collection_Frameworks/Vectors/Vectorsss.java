package Day_20.Collection_Frameworks.Vectors;
//This class shows a basic implementation of the vector collection
import java.util.Vector;
public class Vectorsss {
    public static void main(String[] args) {
        //The warning is coming because we are using rawType and not passing any specific
        //type like Vector<String> list. 
        Vector list = new Vector();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add(69);
        list.add(69.69f); //here we can see heterogeneous values are being added
        list.add(null);
        //This is just the normal vector that is simply written in 
        //the java collections framework. 

        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.add(2, "C"); //This will add the element at the 2nd position of the vector
        System.out.println(list);
    }

    //[Note :] Vector is a dynamic array , basically same as ArrayList but it is synchronized
    //and thread-safe but arrayList is unsynchroized and not thread-safe.
}
