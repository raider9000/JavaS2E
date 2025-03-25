package Inheritance;

public class Driver {
    
    public static void main(String args[]){
        //here , creating the bike and car objects of the classes which 
        //inherited from the vehicle class
        Bike bike = new Bike("Kawasaki");
        Car car1 = new Car("Senna");

        //printing the name attribute contents inside the obejcts 
        System.out.println(bike.name);
        System.out.println(car1.name);
    }
}
