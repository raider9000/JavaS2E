package Day_19.Comparable;
//Comparable interface has only a single abstarct method as a result , only one overriding is allowed 
//only one kind of return type is allowed , multiple return types are not allowed 
//For multiple return types , Comparator interface is required to be implemented.
public class Employee implements Comparable{
    //attributes of the class 
    private String name;
    private int id;
    private double Salary;

    //the constructor of the Class
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        Salary = salary;
    }

    //overriding the toString method
    public String toString(){
        return ("Employee Data \n" + "-----------------------------------" + "\n" +"Name : " + this.name + "\n" + "ID :" + this.id + "\n" + "Salary :" + this.Salary);
    }

    //as the comparable interface is a functional interface, we need to override the compareTo method , without which an error will be generated 
    @Override
    public int compareTo(Object a){
        //type casting the generic object a to employee type before comparisions 
        Employee e = (Employee)a;
        //This compares the salaries of two employee objects , where the Object a is the employee object given to the method and the current object is written as 
        //current_Employee_Object_Name.compareTo(Other_Employee_Object_Name)

        //as the return type is int , converting it to int

        //return (int)(this.Salary-e.Salary); //method for returning the difference between two salaries 

        //method for comparing the names of the employees , the names are of string type of object , as a result , that have all the methods of String class. 
        //The String class already has a overloaded method of the compareTo method as a result , that compareTo method is being used to compare the Strings lexicographically. 
        //The lexicographical comparison of the Strings are done based on the Unicode (ASCII) value of the characters in the given String literal. 
        return (int)(this.name.compareTo(e.name));

        
    }

}
