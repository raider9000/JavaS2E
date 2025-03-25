package Inheritance;

public class Car extends Vehicle{
    public Car(String name){
        //here , we can see that the name attribute is inherited by the car
        //class from the vehicle class , as we dont have to re initialize 
        //the String name and can caccess it directly by this.name
        this.name = name; 
    }
}
