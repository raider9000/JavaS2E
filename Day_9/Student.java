public class Student {
    String name;
    int roll_no;
    double marks;
    String college; //these values hold the attributes of the class Student and will be reflected in the object when created
    //This is a non-static method that holds seperately for each of the different object created 
    //This is a simple representation of a class method that can be used by an object
    public void study(){
        System.out.println("Reading");
    }

    //The following is the constructor of the class Student and this constructor now overrides the 
    //creation of the default constructor by the compiler. The constructor always executes first 
    //when the constructor calling statement in the main method is called to create the object.
    public  Student(int roll , double marks){
        roll_no = roll;
        this.marks = marks; //example of the this keyword usage
    }
    //when , using same names of identifiers in class , inside the constructor , use the this. keywoard.

    //The following demonstrates constructor overloading :- 
    public Student(int roll_no , double marks , String college){
        this.roll_no = roll_no;
        this.marks = marks; 
        this.college = college;
    }
    //here , the Student constructor based on the actual parameters passed on the StudentDriver class
    //will determine which constructor will be chosen.

}

