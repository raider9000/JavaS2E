package Day_20.Collection_Frameworks.Sets;
public class Employee implements Comparable<Employee>{
    int salary;
    String Name;

    public Employee(int salary , String name){
        this.salary = salary;
        this.Name = name;
    }

    @Override
    public String toString(){
        return "Salary :" + this.salary + "\tName : " + this.Name;
    }

    //this is for the comparable method 
    @Override
    public int compareTo(Employee e){
        return this.salary - e.salary;
    }

}
