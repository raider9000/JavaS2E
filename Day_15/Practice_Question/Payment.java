package Day_15.Practice_Question;

abstract class Payment {
    abstract void Process_payement(double a , String b);
    abstract void display();
    private double amount;
    private String transactionId;

    public void set_Amount(double amt){
        this.amount = amt;
    }

    public void set_ID(String ID){
        this.transactionId = ID;
    }

    public void get_ID(){
        System.out.println("Trans. ID : " + this.transactionId);
    }

    public double get_Amount(){
        return amount; 
    }


}
