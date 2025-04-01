package Day_15.Inheritance_Interface;

public interface C extends A,B{
    //the default method has to be the same signature as the default mehod of A,B 
    //in order to override it , else it would throw an error.
    default void hello(){

        //for static variables and methods , access them by using interface_name.Method-name. 
        //This would allow to access static elements directly from the interface A. 
        System.out.println(A.a);
        A.message();
        B.message();
        
        //here , tyring to access the hello() default method from the interface A 
        //the default method has to be accessed from A's super , as this method is present in both the interfaces , C is inheriting from. 
        A.super.hello();
        B.super.hello();
    }

    public static void main(String args[]){
        //in this static context , default methods of interfaces inherited from , 
        //cannot be accessed from. 
    }
}
