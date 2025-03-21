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
        this(roll_no , marks); //this is a constructor chaining where another constructor is called within this constructor
        this.college = college;
    }
    //here , the Student constructor based on the actual parameters passed on the StudentDriver class
    //will determine which constructor will be chosen.


    //The following also demonstrates the constructor chaining. 
    //this(); is used to chain constructors within the same class , as the constructors here are 
    //within the same class so , this(); function is used.  
    public Student(int roll_no , double marks , String college , String name){
        this(roll_no , marks , college); //as above we have a constructor that accepts roll_no , marks , college 
        //so , we are simply passing the values to that constructor which is already defined , rather than
        //again writing the code to manually store each and every value.
        this.name  = name;
    }

}

