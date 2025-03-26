public class Parent {
    int x = 10;
    public Parent(){
        super(); //This class calls the OBJECT super class as this is the parent class

        //[Note :-] A default inhertiance of OBJECT super class is inherited by jvm if Super call statement is not used manually.

        //Super call statement calls the constructor of a parent class
        System.out.println("parent");
    }
}
