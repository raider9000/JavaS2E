package Day_19.Comparator;


public class Employee{
    //attributes of the class 
     String name;
     int id;
     double Salary;

    //overriding the toString method
    public String toString(){
        return ("Employee Data \n" + "-----------------------------------" + "\n" +"Name : " + this.name + "\n" + "ID :" + this.id + "\n" + "Salary :" + this.Salary);
    }

    //the constructor of the Class
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        Salary = salary;
    }

}
