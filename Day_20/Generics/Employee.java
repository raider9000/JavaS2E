package Day_20.Generics;
//This class deals with the concept of using generics in java

//The <Employee> is a generic type parameter that allows the class to be used 
//to only accept Employee objects in the compareTo method , not any other objects
//As the comparable interface is now explicitly implemented to only accept 
//Employee type obejcts. 

public class Employee implements Comparable<Employee> {
    int id;
    String name;
    
    //Constructor of the class
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //overriding the toString method
    @Override
    public String toString() {
        return String.valueOf(id);
    }

    //overriding the compareTo method , because comparable interface is implemented
    //If any other object besides Employee is passed to the compareTo method ,
    //Will generate an error because in the implementation the type of the 
    ///the Objects is explicitly mentioned in the class declaration. 
    public int compareTo(Employee e) {
        //Employee e = (Employee) o; will not work and will give error
        //comparing the id of the employees
        return this.id - e.id;
    }
}
