package Day_14.covariant_returnType;
//this class demonstrates the covariant return types in java
public class Vehicle {

    //here , this function returns the Vehicle type of object 
    public Vehicle getObject(){
        //this is the original return type 
        return new Vehicle(); //returns the vehicle object
    }
    //[Note :-] the child mandatorily has to return a vehicle object in the method declaration
    // if it tries to return a bike class in the declaration , the it returns error. 
    //The child has to have the same return type of the parent object in its method 
    //declaration in order to function. The parent having or returning the child will not work,
    //so a vice versa situation doesn't work.
}
