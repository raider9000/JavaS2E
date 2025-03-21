//this is the demonstration of all the concepts done in the students class
public class Employee {
    double salary;
    int id;
    String name , designation;
    
    public Employee(double salary , int id){
        this.salary = salary; 
        this.id = id;
    }

    public Employee(double salary , int id , String name , String designation){
        this(salary,id);
        this.name = name;
        this.designation = designation;
    }

    public int calculate_tax(){
        int tax = 0;
        float tax_ded = 18.4f;
        tax =  (int)(this.salary - ((this.salary)*(tax_ded/100)));
        return tax;
    }
}
