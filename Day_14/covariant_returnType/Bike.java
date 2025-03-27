package Day_14.covariant_returnType;
//here the covariant datatypes are observed
public class Bike extends Vehicle{
    //As bike is inheriting from the vehicle class , the following code runs as
    //the bike class is getting upcasted into the parent Vehicle class. 
    public Vehicle getObject(){

        //here , the bike class is getting upcasted to the parent class which is vehicle
        //the upcasting to the vehicle class shows covariant return occurs , as the Bike class
        //is upcasted to vehicle class , where the method of the vehicle class is overridden by the 
        //Bike class (getObject method). This allows for the return type of bike class in bike obejcts
        //stored in vehicle class variables through the method overriding , making the return type 
        //co-variant in nature. Only co-variant return type is allowed in method overridding.
        return new Bike();
    } 
}
