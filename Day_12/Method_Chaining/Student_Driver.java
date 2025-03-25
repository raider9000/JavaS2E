package Method_Chaining;
public class Student_Driver {
    public static void main(String args[]){
        Student s; //this is the current object of Student 
        s = new Student();
        s.Set_Name("Subho");


        //both the statements will print the same reference memory location as in the Student method , we are returning the exact instance of the object rather than creating a new object and returning that obejct. 
        System.out.println(s);
        System.out.println(s.Set_Name("Helo"));
    }
}
