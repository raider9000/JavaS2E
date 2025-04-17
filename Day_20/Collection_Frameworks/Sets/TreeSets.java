package Day_20.Collection_Frameworks.Sets;
//This is a simple treeset code
import java.util.TreeSet; 
public class TreeSets {
    public static void main(String[] args) {
        TreeSet<Integer> Ts = new TreeSet<>();
        //Ts.add(null); This gives a nullpointerexception as treeset doesnot
        //allow for null values to be present

        //Ts.add("Hello"); This gives a classCastException as treeset does not allow for 
        //Heterogeneous values to be stored
        
        //The values are by default sorted in ascending order as it innately uses the compareTo method in order
        //to sort the elements. Because of this using heterogeneous elements in the treeset results in a classCastException 
        Ts.add(12);
        Ts.add(31);
        Ts.add(1233);
        System.out.println(Ts);


        //Now using custom employee based elements treeset
        TreeSet<Employee> set = new TreeSet<Employee>();

        //passing the employee objects 
        Employee e = new Employee(12343, "Hi");
        Employee f = new Employee(2113 , "Something");
        Employee g = new Employee(1234 , "Blah");
        
        set.add(g);
        set.add(f);
        set.add(e);

        //[Note :-] The Employee objects that we are passing is being passed 
        //because , it is mandatory for the elements to have the comparable interface
        //implemented , which is implemented in employee class , else there will be a classCastException
        //This is because the TreeSet uses the compareTo method innately to sort the elements in ascendeing order. 


        //It can be seen that the set that gets printed 
        //is sorted in ascending order of the salaries 
        //This is because we are overriding the compareTo method to return the difference of the Salary.
        System.out.println(set);
        
        //This is used to get the desending order view of the tree.
        System.out.println(set.descendingSet());



        //now using it by implemeting the comparator , for comparator we need to make a new class 
        //implementing comprator and then override the compare method there. Then make the object of the 
        //comparator implemented class and 

        Compare_opp cpp = new Compare_opp();
        TreeSet<Employee> newTS = new TreeSet<>(cpp);

        Employee m = new Employee(12343, "Hi");
        Employee n = new Employee(2113 , "Something");
        Employee p = new Employee(1234 , "Blah");
        
        newTS.add(m);
        newTS.add(n);
        newTS.add(p);

        System.out.println(newTS);

    }
    


}
