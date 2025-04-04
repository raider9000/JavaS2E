package Day_19.Comparable;

public class Driver {
    
    public static void main(String[] args) {
        Employee e1 = new Employee("Subho", 123, 30000);
        Employee e2 = new Employee("Random", 12334, 12400);


        //String class has CompareTo method , which is by default overridden
        //It is present in the Comparable interface , which is present in the java.lang package 
        //comparable interface is a functional interface. A functional interface is a special type of interface that has only a single abstract method , no more. 
        
        //using the overridden toStirng method in Employee class
        System.out.println(e1.toString());


        //Now using the compareTo method that is being overridden in the Employee class , that implements the comparable interface and compares only the Salary of the two employee objects 

        if(e1.compareTo(e2) > 0){
            System.out.println("Employee 1 has a greater salary");
        }else if(e1.compareTo(e2) == 0){
            System.out.println("Both the employees have the same Salary`");
        }else{
            System.out.println("Employee 2 has a greater Salary");
        }
    }

    
}
