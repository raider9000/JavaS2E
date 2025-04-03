package Day_18.Wrapper_classes;
//this class is used to convert primitive data types into objects and vice versa , using Wrapper classes
public class Wrappers {
public static void main(String[] args) {
    int i = 10;
    Integer a = new Integer(i); // Boxing , wrapper class , this is an older way of doing it , it is deprecated so its cut. 

    //now doing it the new way , autoboxing
    Integer b = i; // Autoboxing , this is the new way of doing it , it is not deprecated , directly converting primitive to object , implicitly done by java. 

    //using valueOf method , another way of boxing
    
}
}
