package Day_16.object;
//This class demonstrates the obejct super class in java , and its uses. 
public class Employee {
    String name;
    String id;
    double salary;

    public Employee(String name , String id , double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    //here we are trying to override the toString() method which is inherited from the object superclass automatically. 

    public String toString(){
        //we are overriding the toString method to simply return the refrence of the memory block rather than everything. 

        //this has now overridden the method to only return the reference code of the memory block as a string rather than the class as well as package name
        //getClass() and getName() method are not used which returns the package name and class name.
        return "@" + Integer.toHexString(hashCode());
    }
}
