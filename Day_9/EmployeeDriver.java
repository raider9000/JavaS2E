public class EmployeeDriver {
    public static void main(String args[]){
        Employee E1 = new Employee(30000, 1 , "EMP1" , "Tester");
        Employee E2 = new Employee(26000 , 2 , "EMP2" , "Quality Assurance");
        System.out.println("Employee" + E1.name + " Tax = " + E1.calculate_tax());
    }
}   
