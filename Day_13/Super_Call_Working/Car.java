package Super_Call_Working;

public class Car extends Vehicle{
    int horsepower; 
    public Car(String name , String type , int horsepower){

        //this is the parameterized super call statement , in order to pass the 
        //arguements to the constructor of the parent class. As super() call statement
        //calls the parent class constructor. The constructor of a parent class is 
        //not inherited by default in the child class and the super() call is required 
        //in order to get the parent constructor. 
        super(name , type); 

        //sets horsepower 
        this.horsepower = horsepower;
        System.out.println("Child Class");
    }
}
