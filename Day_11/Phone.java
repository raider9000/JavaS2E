public class Phone {
    String model_name; 
    int price; 
    Battery B1;

    public Phone(String model_name , int price , String Type , int Capacity){
        this.model_name = model_name;
        this.price = price;
        B1 = new Battery(Type, Capacity);
    }

    public void display(){
        System.out.println(model_name + "\n" + price + "\n" + B1.Type + "\n" + B1.capacity + "\n");
    }
}
