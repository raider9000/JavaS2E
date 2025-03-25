package Inheritance;
//This class demonstrates inheritance

//This is the super class from which car and bike class inherits from. 
//The display method is also accessible by the objects 
public class Vehicle {
    String name;
    String engine;
    public void display(){
        System.out.println(this.name + " " + this.engine);
    }


}
