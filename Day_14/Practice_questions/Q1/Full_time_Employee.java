package Day_14.Practice_questions.Q1;

public class Full_time_Employee extends Employee{
    int bonus; 
    
    public Full_time_Employee(String name , double Salary , int bonus){
        super(name , Salary);
        this.bonus = bonus;
    }

    public void job_role(){
        System.out.println("Won't say it");
    }

    public void employeeinfo(){
        System.out.println("Still wont say it");}
    
}
