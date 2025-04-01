package Day_15.Inheritance_Interface;

public interface B {
    double a = 20;
    static void message(){

    }

    default void hello(){
        //this is a default method in B interface , this default method cannot be accessed in a
        //static context , or method in an interface or class , that inherits from this interface. 
    }
}
