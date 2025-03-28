package Day_15.Inheritance_Interface;
//this class is implementing the A and B interface 
public class D implements A,B{
    public void hello(){
        A.super.hello();
        B.super.hello();
    }
    public static void main(String args[]){
        D d = new D();
        d.hello();
    }
}
