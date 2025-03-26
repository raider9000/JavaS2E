package Practice_questions;

public class Vehicle {
    int Vehicle_Number;
    String brand;
    String model;
    boolean is_Available;
    double rentalPrice;

    public Vehicle(int vn , String brand , String model , boolean avail , double price){
        this.Vehicle_Number = vn;
        this.brand = brand;
        this.is_Available = avail;
        this.rentalPrice = price;
        this.model = model;
    }

    public void rentvehicle(boolean avail){
        if(avail){
            System.out.println("Rentable");
        }else{
            System.out.println("Not Rentable");
        }
    }

    public void display_details(){
        System.out.print(this.Vehicle_Number + "\t" + this.brand + "\t" + this.model + "\t" + this.rentalPrice + "\t" + ((this.is_Available) ? "Available" : "Not Available"));
    }
}
