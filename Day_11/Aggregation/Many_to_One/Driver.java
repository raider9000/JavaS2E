package Aggregation.Many_to_One;
//driver class for the many to one demonstration
public class Driver {
    public static void main(String args[]){
        Bank B1 = new Bank("AXIS");
        Customer c1 = new Customer(123, "Raider 1", B1);
        Customer c2 = new Customer(213 , "raider 2" , B1);

        c1.display();
        c2.display();
    }
}
