//package Super_call_Demonstration;
//This is the driver class 
public class Driver {
    public static void main(String args[]){

        //Sets the attributes via the child class , as child class inherits 
        //from the parent class vehicle. 
        Car c = new Car("Volvo" , "V4" , 460);
        System.out.println(c.name + " " + c.type + " " + c.horsepower);
    }
}
