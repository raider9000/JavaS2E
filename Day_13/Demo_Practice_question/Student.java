public class Student extends Person{
    private int stud_ID;

    public Student (String name , int age , int id){
        super(name ,age); //this is constructor chaining
        this.stud_ID = id;
    }

    
    public void print_details(){
        
    }

}
