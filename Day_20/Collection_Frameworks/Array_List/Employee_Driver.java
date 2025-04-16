package Day_20.Collection_Frameworks.Array_List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator; //Using th eiterator interface in order to modify the elements during loop 
import java.util.ListIterator;
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

        //[Note :] By default the pointer of the iterator and listIterator objects have the pointer pointing outside of the arraylist. 
        //That means at the start , the pointer is at the index -1 and when we call the next() method , it will point to the first element of the ArrayList

        //Using the iterator interface to modify the elements during loop
        Iterator<Employee> iterator = emp.iterator(); //This is an iterator object which is used to iterate the elements of the ArrayList. //the .iterator is done next to the ArrayList object
        //because Arraylist has an iterator method which returns an iterator object, which gets upcasted to the iterator interface and has all the methods such as hasnext , next , etc overridden in it.
        
        //This is why iterator interface does not have to explicitly impletemnted in this class.

        //[Note :] hasNext() method is used to check if there is any next element in the ArrayList
        //[Note :] next() method is used to get the next element of the ArrayList by moving the pointer to the next element
        //[Note :] remove() method is used to remove the current element of the ArrayList
        //All the above methods have to be used on the iterator type object only and not on the ArrayList type object


        //[Note :] Iterator moves in the forward direction only and not in the backward direction

        while (iterator.hasNext()) { //This will check if there is any next element in the ArrayList
            Employee e = iterator.next(); //This will get the next element of the ArrayList
            //e.setId(0); //This will set the id of all the employee to 0

            int x = e.getId(); //This will get the id of the employee
            if(x == 102){
                iterator.remove(); //This will remove the current element of the ArrayList
                //based on the condition given in the if statement
            }
            System.out.println("ID: " + e.getId() + ", Name: " + e.getName() + ", Salary: " + e.getSalary());
        }
        //This will print the employee list after removing the employee with id 102
        System.out.println("After removing the employee with id 102");
        for (Employee e : emp) {
            System.out.println("ID: " + e.getId() + ", Name: " + e.getName() + ", Salary: " + e.getSalary());
        }


        //Now using ListIterator interface , this interface allowes for adding of elements in between elements.

        ListIterator<Employee> li = emp.listIterator();
    
        //Traversing in the forward direction 
        while(li.hasNext()){
            //The .nextindex() method returns the index of the next element in the ArrayList 
            //all next methods and nextIndex has to be used because by default the pointer during the start points to the -1 index , outside of the arrayList.
            System.out.println("Index : " + li.nextIndex());

            //Always take a temporary Employee variable to iterate over usiing iterator and listIterator
            Employee e = li.next(); //This will get the employee object
            System.out.println("ID: " + e.getId() + ", Name: " + e.getName() + ", Salary: " + e.getSalary());
        }

        System.out.println("----------------------------------------------------");
        System.out.println();

        //resetting the pointer back to the starting -1 position 
        while(li.hasPrevious())
            li.previous(); //This will reset the pointer back to the starting -1 position
        //this is done because the pointer after one pass is at the end of the arraylist index and now it has to be send back to initial position 
        //So that the arraylist can be traversed again from the start.

        //without traversing the pointer backwards , this code below will give an error as the pointer will remain at the end unless explicitly traversed backwards. 
        //now adding an element in between the elements
        //The .add() method is used to add an element in the ArrayList
        while(li.hasNext()){
            if(li.nextIndex() == 1){
                Employee e4 = new Employee(104, "Smith", 80000);
                li.add(e4); //This will add the employee object in the ArrayList
                //The .add() method is used to add an element in the ArrayList
            }
        }


        //Simple demonstration of sorting of the arraylist storing integer objects 
        //Sorting of the list

        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(1);
        a1.add(2);
        a1.add(34);
        a1.add(23);
        a1.add(45);

        //Now trying to sort the list , we need a seperate sorting method as Arraylist can store heterogeneous types of data. 

        Collections.sort(a1); //This will sort the ArrayList in ascending order
        //For this .sort to work , the obejct of the class stored in the ArrayList should implement the comparable interface , else it wont work and throw an exception.


        //now as the comparable interface is implemented in the employee class  , so Collections.sort(emp)
        //will work and call the compareTo method of the employee class to sort the employee objects in the arraylist. This would work implicitly on String object filled arraylist as String has an overridden method of compareTo and implemented the comparable interface by default. 

        Collections.sort(emp); //This will sort the ArrayList in ascending order based on the id of the employee , by calling the overridden compareTo method of the employee class.
        //Whatever comparing logic is defined in the overridden equals method , will take place here 
        //and sort based on that logic. 

    }
}
