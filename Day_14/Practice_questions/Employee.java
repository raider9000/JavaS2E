package Day_14.Practice_questions;

public class Employee {
    String name;
    double Salary;
    

    public Employee(String name , double Salary){
        this.name = name;
        this.Salary = Salary;
    }

    public void getinfo(){
        System.out.println(name + " : " + Salary);
    }
}
