package Practice_questions;

public class Bike extends Vehicle{
    double has_gear;
    public Bike(int vn , String brand , String model , boolean avail , double price , double has_gear){
        super(vn , brand , model , avail , price);
        this.has_gear = has_gear;
    }

    public void display_details(){
        super.display_details();
        System.out.println("\t" + this.has_gear +"(no. of gears)");
        super.rentvehicle(is_Available);
    }
}
