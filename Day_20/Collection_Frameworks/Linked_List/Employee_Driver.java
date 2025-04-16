package Day_20.Collection_Frameworks.Linked_List;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Iterator; //Using th eiterator interface in order to modify the elements during loop 
import java.util.ListIterator;

//This is the same thing but now using a linked list instead of an array list
public class Employee_Driver{
    public static void main(String[] args) {
        LinkedList<Employee> emp = new LinkedList<Employee>(); //This is a linked list of employee objects
        Employee e1 = new Employee(101, "John", 50000);
        Employee e2 = new Employee(102, "Jane", 60000);
        Employee e3 = new Employee(103, "Doe", 70000);
        emp.add(e1); //.add is a method of linkedList class
        emp.add(e2); //This adds a the employee object in the linkedlist
        emp.add(e3);
        System.out.println("Employee List :");

        for (Employee e : emp) {
            
            System.out.println("ID: " + e.getId() + ", Name: " + e.getName() + ", Salary: " + e.getSalary());
        }

       
        Iterator<Employee> iterator = emp.iterator(); 
    

        //[Note :] Iterator moves in the forward direction only and not in the backward direction

        while (iterator.hasNext()) {   
                Employee e = iterator.next(); 
            int x = e.getId(); //This will get the id of the employee
            if(x == 102){
                iterator.remove(); //This will remove the employee with id 102
            }
            System.out.println("ID: " + e.getId() + ", Name: " + e.getName() + ", Salary: " + e.getSalary());
        }

        //This will print the employee list after removing the employee with id 102
        System.out.println("After removing the employee with id 102");
        for (Employee e : emp) {
            System.out.println("ID: " + e.getId() + ", Name: " + e.getName() + ", Salary: " + e.getSalary());
        }
        System.out.println("----------------------------------------------------");

        //Now using ListIterator interface , this interface allowes for adding of elements in between elements.

        ListIterator<Employee> li = emp.listIterator();
    
        //Traversing in the forward direction 
        while(li.hasNext()){
           
            System.out.println("Index : " + li.nextIndex());
            Employee e = li.next(); //This will get the employee object
            System.out.println("ID: " + e.getId() + ", Name: " + e.getName() + ", Salary: " + e.getSalary());
        }

        System.out.println("----------------------------------------------------");
        System.out.println();

        //resetting the pointer back to the starting -1 position 
        while(li.hasPrevious())
            li.previous(); 


        while(li.hasNext()){
            if(li.nextIndex() == 1){
                Employee e4 = new Employee(104, "Smith", 80000);
                li.add(e4); 
                
            }
        }

        LinkedList<Integer> a1 = new LinkedList<Integer>(); //This is a linked list of integer objects
        a1.add(1);
        a1.add(2);
        a1.add(34);
        a1.add(23);
        a1.add(45);
        Collections.sort(a1); 

        Collections.sort(emp);  
        
    }
}
