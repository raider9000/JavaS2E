package Aggregation.One_to_Many;

//This is the customer class and has a many to one association with the Bank class 
//The bank class has a one to many relationship with the Customer class
public class Customer {
    String customerName; //customer class attrubute
    
    //Constructor of the Customer class 
    public Customer(String customerName){
        this.customerName = customerName; //sets the customerName attribute 
    }
}
