package Day_16.object;
//This class demonstrates the obejct super class in java , and its uses. 

//implement of cloneable is required in order to use the abstract protected method of clone objects.
public class Employee implements Cloneable{
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

        //the following checks first whether , the given object is of the same class , before downcasting and performing functions. 
        //This reduces the chances of classcastException 
        //This is a good practice before any sort of downcast , to check whether the passed object is same as the comparing object. 
        //chekcing in e1.equals(e2) , checking whether e1 and e2 are both employee types or not. 
        if(o instanceof Employee){
        //this is accepting the type of object super class objects. So every class being a child class of the object superclass , auto upcasts to the object superclass type.
        
        Employee e = (Employee)o; //This downcasts the obejct super class object type back to the employee class type of object. 
        //This is mandatorily required cause of static binding.
        
        //This is the overridden return type to compare based on the attributes rather than just simply the memory refrence 
        return this.id == e.id && this.salary == e.salary && this.name.equals(e.name); //returns a boolean cause of == operator. 

        //To compare string , this.name gets the string variable and .equals is the String class equals method which is the object super class equals method overridden in String class. 
        //So to compare strings , the above method of comparing strings if equal or not is used when overridding. 

        //here, this.id contains the memory reference of the e1 if e1.equals(e2) is used as , e1 is the object calling the equals method overridden in employee class.
        
    }return false;
        }

    //overriding the innate hashcode method in the obejct super class , as per the specific needs.    
    public int  hashCode(){
        //simple hashcode method , to simply add 10 to the salary and produce hashes. 
        return (int)(10 + this.salary);

        //[Note :] the worst way to override the hashcode method is to use such a hashing function that returns the same hashed address for all the elements.
        //This causes liner probing on a sinle block as a result the O(1) time complexity goes to O(n) as a result , because the entire daisy chained linked list for that block has to vbe traversed at O(n) time.
    }   

}
