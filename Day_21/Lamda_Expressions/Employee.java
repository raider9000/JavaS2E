package Day_21.Lamda_Expressions;

public class Employee implements Comparable<Employee>{
    int ID;
    String name;

    public Employee(int ID , String name){
        this.ID = ID;
        this.name = name;
    }

    public int compareTo(Employee e){
        return this.ID - e.ID;
    }

    public String toString(){
        return "Name : " + this.name + "\tID : " + this.ID;
    }
}
