//package Super_call_Demonstration;
public class Vehicle {
    String name; 
    String type;

    //constructor for vehicle parent class
    public Vehicle(String name , String type){
        //This super inherits the non static methods from the OBJECT super class in java lang.
        //Even not using this super() statement , a default super call will be done by java 
        //in order to inherit from the OBJECT super class.
        super();

        //always , OBJECT super class is first executed before any other class.
        this.name = name; 
        this.type = type;
        System.out.println("Parent Class");
    }
}
