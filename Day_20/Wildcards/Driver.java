package Day_20.Wildcards;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        // Creating a Student object that holds a Person
        Student<Person> student = new Student<Person>(new Person("Manideep", 10));

        // Calling method that accepts Student of Person or any subclass of Person
        printDetails(student);

        // Creating a List of Booleans
        List<Boolean> list = new ArrayList<Boolean>();
        list.add(true);
        list.add(false);

        // print(list);
        // This will cause a compile-time error
        // Reason: Boolean is not a subclass of Number

        List<Number> list1 = new ArrayList<Number>();
        list1.add(10);
        list1.add(20);

        printData(list1);

        printList(list);
    }

    // Method that accepts Student of Person or any subclass (like Student<Employee> if Employee extends Person)
    public static void printDetails(Student<? extends Person> student){
        Person p = student.obj;  // Access the Person object
        System.out.println(p);   // Print details using toString()
    }

    // Method that accepts a list of elements that are Number or any subclass (e.g., Integer, Double)
    public static void print(List<? extends Number> list){
        // list.add(true);
        // Compile-time error: we cannot add anything (except null) to a list using ? extends
        // Because the exact subtype of Number is unknown (could be Integer, Double, etc.)
        System.out.println(list.get(0)); //  Reading is allowed (returns a Number)
    }

    public static void printData(List<? super Number> list){
        list.add(65);
        System.out.println(list.get(2));
    }

    public static void printList(List<?> list){
        System.out.println(list);
    }
}
