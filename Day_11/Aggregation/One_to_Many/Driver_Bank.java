package Aggregation.One_to_Many;
//This is the driver class having the main method for the customer class
//Bank -> Customer [One - To - Many]
//Customer is the contained class and Bank is the container class
//Customer class is lazy bound with the Bank class. Bank has multiple customers , so
//a customer array is required in order to handle the one to many relationship
public class Driver_Bank {

    public static void main(String args[]){
        //This is a very simple representation of the driver method 
        //A better more dynamic method can be written with switch case and user input 

        Bank B1 = new Bank(2, "PNB"); //Making a Bank object of B1 and giving the size of customer array and the bank name to the Bank name constructor
        Customer C1 = new Customer("Subho");//Making the first Customer object and passing the customerName to the constructor of Customer class.
        Customer C2 = new Customer("Subhojeet");//2nd customer obejct.
        B1.Add_customer(C1); //adding the customer C1 to the customer array by giving the customer object in the add_customer method in Bank class , which adds the customer object provided in the customer array in the Bank class.
        B1.Add_customer(C2);//Similarly adding the customer C2 object.

        //using the display method in Bank class to display the contents in B1 object of Bank
        B1.display();
    }
}
