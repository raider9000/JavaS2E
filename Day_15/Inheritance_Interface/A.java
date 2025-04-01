package Day_15.Inheritance_Interface;

public interface A {
    double a = 100;
    default void hello(){
        //this is a default method in A interface , this default method cannot be accessed in a
        //static context , or method in an interface or class , that inherits from this interface. 
    }
    //static methods are not inherited in interfaces
    static void message(){
        System.out.println("This is interface a");
    }
}
