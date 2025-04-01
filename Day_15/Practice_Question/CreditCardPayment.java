package Day_15.Practice_Question;
//this code is not finished and undone for now 
public class CreditCardPayment extends Payment{
    private double og_amt;
    private double discount;
    private double trans_fee;
    public void Process_payement(double amt , String ID){
       final double amount = compute(amt); 
       this.set_Amount(amount);
       this.og_amt = amt; 
    }

    private double compute(double amt){
        if(amt > 500){
        double amount = amt - (0.1*amt) + (0.02*amt);}
        else{
            double amount = amt + (0.02*amt);
        }
        return amount;
    }

    public void display(){
        System.out.println("Credit Card Payement :-");
        this.get_ID();
        System.out.println("Original Amount :" + this.og_amt);
        System.out.println("Discount : " + );

    }
}
