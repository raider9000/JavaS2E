package reflection_API_stuffs;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

//Reflection API works on MetaData mostly 
public class EmployeeDriver {
    public static void main(String[] args) throws Exception{
    
        //Creating a Class class that accepts employee type named employee
        //Employee.class is the metaData of the Employee class that is defined in this package 
        //That metaData is stored inside the Class type of class with reference name employee below
        //This Class<Employee> means it will accept the Employee class type metaData only 
        Class<Employee> employee = Employee.class;
        
        //This is the imported class Field , which can store the fields(variables , etc) from the metaData
        //As the metaData reference is inside the employee reference of Class class type as seen above 
        //We can get the declared fields from the metaData using the .getDeclaredFields() method inside Reflection
        Field fields[] = employee.getDeclaredFields();

        //Defining a new Employee type object with reference e and passing the values inside the constructor
        Employee e = new Employee(12, "Subho", 12323, 27);


        //We need a Field type of variable in order to iterate over the Fields array , as it is of Field object
        //the .getName() method allows for to print the different names of the Fields inside the metaData of the Employee Class
        for(Field i : fields) System.out.println(i.getName());


        //This is just for a single field , that we can get by the identifier of the field 
        Field f = employee.getDeclaredField("name");


        //.setAccessible making it true , makes the private values to be accessible with the .set method 
        f.setAccessible(true);

        //passing the name we want to update "Ram" and the Employee object created above to the method 
        //inside the Field type of obejct created above with identifier f. 
        f.set(e, "Ram");

        //This is to simply print the fields inside the Employee object 
        System.out.println(f.get(e));


        //The same thing now for methods 
        Method methods[] = employee.getDeclaredMethods();

        //For printing the method names 
        for(Method m : methods) System.out.println(m.getName());
        
        //For printing out the methods which are overridden 
        for(Method m : methods){
            if(m.isAnnotationPresent(Override.class)) System.out.println(m.getName());
            
            //For the Deprecated annotation 
            //if(m.isAnnotationPresent(Deprecated.class)) System.out.println(m.getName());

            //Similarly for different annotations
        }
    }
}
