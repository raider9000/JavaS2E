package Day_19.Comparator;
//comparator exists in the util package and the comparator is also a functional interface 

import java.util.Comparator;
//Comparable interface has only a single abstarct method as a result , only one overriding is allowed 
//only one kind of return type is allowed , multiple return types are not allowed 
//For multiple return types , Comparator interface is required to be implemented.


public class Compare_by_ID implements Comparator{
    //the abstract method in the comparator interface is compare 
    public int compare(Object a  , Object b){
        //type casting the generic objects to employee types before comparisions 
        Employee e1 = (Employee)a;
        Employee e2 = (Employee)b;

        //this returns the difference of the id values 
        return e1.id - e2.id;
    }
}
