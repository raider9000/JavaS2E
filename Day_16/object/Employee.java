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
        //Integer class has a tohexString method and inside it we are passing the hashcode method which returns the hashcode of the current object.
    }

    //overriding the equals method in the obejct super class 
    public boolean equals(Object o){ //!!!!![Very Important for Interviews]!!!!!

        //this is accepting the type of object super class objects. So every class being a child class of the object superclass , auto upcasts to the object superclass type.
        
        Employee e = (Employee)o; //This downcasts the obejct super class object type back to the employee class type of object. 
        //This is mandatorily required cause of static binding.
        
        //This is the overridden return type to compare based on the attributes rather than just simply the memory refrence 
        return this.id == e.id && this.salary == e.salary; //returns a boolean cause of == operator. 

        //here, this.id contains the memory reference of the e1 if e1.equals(e2) is used as , e1 is the object calling the equals method overridden in employee class.
    }
}
