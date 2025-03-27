package Day_14.Practice_questions.Q1;

public class Driver {
    
    public static void main(String args[]){
    Employee e1 = new Full_time_Employee("Subho", 35000, 5000);
    Employee e2 = new Part_time_employee("Subhojeet", 48000, 8);

    e1.employeeinfo();
    ((Full_time_Employee)e1).job_role(); //down cast as no jobrole in employee parent class

    ((Part_time_employee)e2).job_designation(); //downcast to part time employee

    details(e2);
    String s = "";
    if(s instanceof String){

    }
    }

    static void details(Employee emp){
        //checks the type of class , instanceof checks whether the 
        //given variable is of the type being checked with
        if(emp instanceof Full_time_Employee){
            emp.job_role();
        }else{
            //
            emp.job_role();
            ((Part_time_employee)emp).job_designation();
        }
    }
}
