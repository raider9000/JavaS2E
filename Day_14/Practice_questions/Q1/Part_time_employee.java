package Day_14.Practice_questions.Q1;

public class Part_time_employee extends Employee{
    int working_hours;

    public Part_time_employee(String name , double Salary , int working_hours){
        super(name , Salary);
        this.working_hours = working_hours;
    }

    public void employeeinfo(){
        System.out.println("Still wont say it");
    }

    public void job_designation(){
        System.out.println("Employee is Jobless");
    }

    public void job_role(){
        System.out.println("This employee is also very jobless");
    }
}
