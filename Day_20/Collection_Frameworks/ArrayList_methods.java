package Day_20.Collection_Frameworks;

import java.util.ArrayList;

//This class deals with the methods of ArrayList collection framework 
public class ArrayList_methods {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList<>();

        //Adding elements
        a1.add(10);
        a1.add(20);
        a1.add(30);


        //Arraylist directly prints the values not the references. 
        System.out.println("ArrayList: " + a1);


        ArrayList a2 = new ArrayList();
        a2.addAll(a1);
        a2.add(12);
        a2.add("Hello"); //heterogenousr values are allowed 

        System.out.println("ArrayList a2: " + a2);
        System.out.println(a2.size()); //size of the arraylist
        
        
        ArrayList<Integer> a3 = new ArrayList<Integer>();
        //This arraylist is type safe and so will only accept integer values
        //no other types of values can be added to this arraylist

        //The following shows all the methods of ArrayLiist
    }
}
