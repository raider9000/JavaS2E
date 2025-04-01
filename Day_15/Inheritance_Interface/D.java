package Day_15.Inheritance_Interface;
//this class is implementing the A and B interface 
public class D implements A,B{

    //the default method name has to be the same and overridden for the object as well as interface , 
    //inheriting from the interface
    //the , default has to be chanegd to public for clases implementing the interfaces. 
    public void hello(){
        A.super.hello();
        B.super.hello();
    }

    //Main method of the class
    public static void main(String args[]){
        //creating a new object of the class D
        D d = new D();

        //the object d has the attributes inherited from the interfaces it is implementing 
        //so , the hello() is overridden from the above public method. 
        //and used in the below code.
        d.hello();
    }
}
