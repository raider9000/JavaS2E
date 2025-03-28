package Day_15.Abstraction;
//this is an abstract class , it is required to hold the abstract methods. 

//[Note :-] If an abstract class is used , that abstract class cannot have objects. 
abstract class Vehicle {
    //The abstract methods do not have a body and have a delimitter semicolon , 
    //directly after the declaration. So a non abstract class containing an abstract method is considered
    //as incomplete and is required to be made abstract in order to hold the abstract method.

    //[Note:-] variables and static methods cannot be made abstract.
    abstract void Start(); //this has no access modifier so has a default package level visibility.

    //public , private , protected , static and default package level variables are allowed in abstract class.
    static int a = 10;
    protected int b = 20;
    int c = 10;
    private int d = 10;

    //an abstract class can have concrete as well as abstract methods. 
    public void Concrete(){
        System.out.println("This is a concrete method");
    }//as this method is non static and concrete , this method is also inherited by subclass. 

    

}
