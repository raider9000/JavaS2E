package Day_16.object;
//[Note] : This driver class demonstrates the different aspects and the methods that are present in the Object Super class. 
public class Driver {
    public static void main(String[] args) {
        Employee e1 = new Employee("Subho", "12bjhkf", 32000);
        System.out.println(e1); //Implicit calling  
        //this prints the packagename.classname@memory address
        //as the reference variable is printed , it prints the memory address innately.
        //This implicitly calls the toString() method in the Object super class , as the toString()method in the object superclass , 
        //that method contains the package name and the class name , as a result the names are also printed as well as the memory reference. 
        //Integer.toHexString(hashCode()) is the method in the toString() method which is able to print the memory reference in hex.
        //the above method can be called explicitly(but the coder) than implicitly(by JVM automatically) and would work the same unless specified otherwise. 
        Employee e2 = new Employee("Hello", "123fa", 32000);

        //Now after the overriding of the internal method of the object class , to only print the memory reference as a hex String , it only prints the memory reference rather than class name and package name as well. 
        System.out.println(e2.toString()); //explicit calling 

        //[Note :] Garbage collecter deletes the deferenced objects in order to release memory. 

        System.out.println(e1 == e2); //This equality is compared based on the memory reference , as a result it always returns false. 

        System.out.println(e1.equals(e2));//This also innately uses the == operator unless overridden in order for specific usage. 

        System.out.println(e1.hashCode()); //This generates the hashcode based on the memory reference of the object. This is innately written in the Object super class method, which every object inherits.

        Employee e3 = new Employee("Something", "id", 0);
        //Object e4 = new Employee("blahblah", "garbage", 0);


    }
}
