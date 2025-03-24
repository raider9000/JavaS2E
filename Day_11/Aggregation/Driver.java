package Aggregation;

//This is the driver class of the aggregation demonstration , containing the main method. 
public class Driver {
    public static void main(String args[]){

        //making the object of the contained class sim , as a seperate object in the main method , 
        //it can exist and be interacted with independently , rather than being tightly bound with the phone class
        //and it is known as lazy binding. 
        Sim s1 = new Sim("VI", "982734892");

        //passing the sim obejct s1 to the phone constructor , which makes it lazy bound to the 
        //phone object. 
        phone p1 = new phone("Pixel", s1);

        //accessing the display method in the phone container class
        p1.display();

        //Here , as this is lazy binding , we can access the sim object independently 
        //even without creating the container class , however the contained class object has to 
        //be mandatorily made before the container class object as the contained class object will 
        //be passed to the container class constructor. 
        System.out.println(s1.number);
    }
}
