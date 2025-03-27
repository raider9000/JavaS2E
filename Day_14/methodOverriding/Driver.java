package Day_14.methodOverriding;
//this class demonstrates the method overriding of parent methods. 
public class Driver {
    public static void main(String args[]){
        Dog d = new Dog();
        d.sound();
        Tiger t = new Tiger();
        t.sound();
    }
}