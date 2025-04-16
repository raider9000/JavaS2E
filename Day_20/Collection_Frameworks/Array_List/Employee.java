package Day_20.Collection_Frameworks.Array_List;

public class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private double Salary;
    
    //Constructor of the class
    public Employee(int id , String name , double Salary){
        this.id = id;
        this.name = name;
        this.Salary = Salary;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return Salary;
    }
    public void setSalary(double Salary) {
        this.Salary = Salary;
    }
    

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", Salary=" + Salary + "]";
    }

    @Override
    public int compareTo(Employee o) {
        //This method is used to compare the objects of the class
        //This method is used to sort the objects of the class
        //This method is used to compare the objects of the class based on the id
        //This method is used to sort the objects of the class based on the id
        return this.id - o.id; //This will compare the id of the objects
        //and will sort using the ids 
    }

    //-----------------------------------------------------------------------------------------------

    ///These override methods are just for reference
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return id == employee.id && Double.compare(employee.Salary, Salary) == 0 && name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + name.hashCode();
        temp = Double.doubleToLongBits(Salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
    ///These override methods are just for reference
    
    //-----------------------------------------------------------------------------------------------

}
