public class Child extends Parent{ //This class extends the parent class
    public Child(){
        super();//This calls the parent's constructor which is by default extended from the OBJECT super class and also inherits the OBJECT Super class's non static methods.

        System.out.println("Child");
    }
    
}
