package Day_21.Lamda_Expressions;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;

//For TreeSet lambda integration , refer to the TreeSet code in the parent package
public class Driver {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>();
        

        employees.add(new Employee(1, "John Doe"));
        employees.add(new Employee(2, "Jane Smith"));
        employees.add(new Employee(3, "Alice Johnson"));
        employees.add(new Employee(4, "Bob Brown"));

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        //Now Using a lambda method in the constructor of the arraylist , in order to sort using name 
        //Basic syntax is (Objects) -> {Logic code};
        //Here a comparison is done based on the implict compareTo method inside the String class 
        Comparator<Employee> c = (Obj1 , Obj2) -> ((Employee)Obj1).name.compareTo(((Employee)Obj2).name);
        
        //This now uses the comparator defined by the lambda expression to sort it. 
        Collections.sort(employees , c);

        
    }
}
