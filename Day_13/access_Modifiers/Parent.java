package access_Modifiers;
//This is the parent class that is linked with the child class in access modifiers package 
public class Parent {
    public static int a = 10;


    //public here is the access modifier with the highest visibility
    //It is accessible throughout a java project in any package , class or anything. 
    //for other packages , importing the parent class and access_modifiers 
    public static void print(){
        System.out.println("Parent");
    }
}
