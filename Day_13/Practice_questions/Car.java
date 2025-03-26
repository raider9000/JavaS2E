package Practice_questions;

public class Car extends Vehicle{
    double no_of_doors;
    public Car(int vn , String brand , String model , boolean avail , double price , double no_of_doors){
        super(vn , brand , model , avail , price);
        this.no_of_doors = no_of_doors;
    }

    public void display_details(){
        super.display_details();
        System.out.println("\t" + this.no_of_doors + "(no. of doors.)");
        super.rentvehicle(is_Available);
    }
}
