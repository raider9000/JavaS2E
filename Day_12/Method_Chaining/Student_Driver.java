package Method_Chaining;
public class Student_Driver {
    public static void main(String args[]){
        Student s; //this is the current object of Student 
        s = new Student();
        s.Set_Name("Subho");


        //both the statements will print the same reference memory location as in the Student method , we are returning the exact instance of the object rather than creating a new object and returning that obejct. 
        System.out.println(s);
        System.out.println(s.Set_Name("Helo"));

        String helo = s.name;

        //sample method chaining
        helo.toUpperCase().toCharArray(); //here , toCharArray is chained to toUpperCase method. 

        //method chaining is done when mutliple methods is applied on a single object one after the another in a single line. 

        //method chaining on the Student class attributes
        s.Set_ID(12).Set_Name("helo"); 
        //here , the methods of set id and set name in the student class is chained together on the student obejct. This is only possible because the object instance passed to the class is directly returned without creating a new obejct by returning the this keyword , without which chaining will not be possible. 
    }
}
