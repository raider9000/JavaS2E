package Day_20.Collection_Frameworks.Array_List;
import java.util.ArrayList;
import java.util.Iterator; //Using th eiterator interface in order to modify the elements during loop 
public class Employee_Driver{
    public static void main(String[] args) {
        ArrayList<Employee> emp = new ArrayList<Employee>();
        Employee e1 = new Employee(101, "John", 50000);
        Employee e2 = new Employee(102, "Jane", 60000);
        Employee e3 = new Employee(103, "Doe", 70000);
        emp.add(e1); //.add is a method of ArrayList class
        emp.add(e2); //This adds a the employee object in the ArrayList
        emp.add(e3);
        System.out.println("Employee List :");




        //Loops should be used only to access the elements but not modify them in ArrayList , It will give 
        //ConcurrentModificationException during runtime. 
        //This happens because the pointers are shifted and the elements are not in the same place during the running of the loops
        //If you wnat to modify the elements within loop , then break from the loop after updating or use the 
        //Iterator class to modify the elements. 
        for (Employee e : emp) {
            //e.setId(0); will give ConcurrentModificationException during runtime 
            //e.setName("Updated Name"); will give ConcurrentModificationException during runtime
            //As we are tyring to update elements during looping , as after each iteration the pointers are shifted
            //and the elements are not in the same place during the running of the loops
            //So, we can only access the elements but not modify them in ArrayList.

            //If you want to modify the elements within loop , then break from the loop after updating 
            //example :- 
            //e.setId(0);
            //break; //This will break the loop after updating the first element and no ConcurrentModificationException will be thrown
            System.out.println("ID: " + e.getId() + ", Name: " + e.getName() + ", Salary: " + e.getSalary());
        }

        

        //Using the iterator interface to modify the elements during loop
        Iterator<Employee> iterator = emp.iterator(); //This is an iterator object which is used to iterate the elements of the ArrayList

        while (iterator.hasNext()) { //This will check if there is any next element in the ArrayList
            Employee e = iterator.next(); //This will get the next element of the ArrayList
            e.setId(0); //This will set the id of the employee to 0
            System.out.println("ID: " + e.getId() + ", Name: " + e.getName() + ", Salary: " + e.getSalary());
        }

    }
}
