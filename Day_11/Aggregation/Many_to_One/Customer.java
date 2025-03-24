package Aggregation.Many_to_One;
//here , this class demonstrates the many to one relationship , by using the same customer and bank relationship. 
//Here , many customers have a bank[Many to One] rather than one bank having many customers. 
//The bank object is inside the cutomers class

//The remaining is very similar to the one to many application. 
public class Customer {
    int id; 
    String Customer_name;
    Bank bank;

    //the bank class object is lazy bound to the Customer object. 
    public Customer(int id , String Customer_name , Bank bank){
        this.id = id;
        this.Customer_name = Customer_name;
        this.bank = bank;
    }

    public void display(){
        System.out.println(id + " " + Customer_name + " " + bank.name);
    }
}
