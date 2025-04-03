package Day_18.throws_Throws;

public class Child extends Parent {
    //this class is the child class of the parent class
    //it overrides the method from the parent class
    //and it does not throw an exception
    @Override
    void method() throws RuntimeException{
        //this method is overridden from the parent class and needs to throw an 
        //exception which is either the same as or a subclass of the exception thrown by the parent class
        //however , it is optional to throw an exception for a child class overridden method
        System.out.println("Child method");
    }
 
}
