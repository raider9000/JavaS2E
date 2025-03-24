package Aggregation.One_to_Many;
//This class demonstrates the one to many association relationship 

//Here , the customer class is lazy bound(Aggregated associativity) with the 
//Bank class. multiple customer objects are created and is stored in a form of customer class
//type of object array. The Add_customer method takes in a customer type of object and adds the 
//customer object in a customer class type of object array. 
//For the display method , the for loop loops over the array and customers[i] takes the customer object 
//in the i th position of the object array of customer , customers[i].customerName grabs the customer name
//attribute inside of the customer object present at i th position of the object array. 
public class Bank {
    Customer[] customers; //The initialization of array of objects for customer class based objects
    String BankName; //Bank attributes
    static int count = 0; //count for the customer array

    //constructor of class Bank
    public Bank(int size , String BankName){
        this.customers = new Customer[size]; //This forms the customer class based array of customer objects of the given size by the user. 
        this.BankName = BankName; //This stores the bank name in the bankname attribute of the bank class
    }

    //method to add the customer by taking input of a customer object
    public void Add_customer(Customer customer){
        if(count < customers.length){ //Checks whether the array is out of bounds or not by checking if the count on incrementing is still below size of array of customer objects.
            customers[count++] = customer; //Adds the customer object at count position and then increments count as post incrementation of count used count++
            System.out.println("Customer Added.");
        }else{
            System.out.println("Array FULL."); //prompts that array is full and cannot be filled further
        }
    }
    //Simple method to print the customer name 
    public void display(){
        for(int i = 0 ; i < count ; i++){
            //here , the customer[i] gets the customer object stored at position i in the customer object array
            System.out.println(customers[i].customerName); //.customerName grabs the attribute customerName from the customer object at i th position in the customer object array.
        }
    }

 }
