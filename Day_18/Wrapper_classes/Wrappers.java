package Day_18.Wrapper_classes;
//this class is used to convert primitive data types into objects and vice versa , using Wrapper classes
public class Wrappers {
public static void main(String[] args) {
    int i = 10;
    Integer a = new Integer(i); // Boxing , wrapper class , this is an older way of doing it , it is deprecated so its cut. 

    //now doing it the new way , autoboxing
    Integer b = i; // Autoboxing , this is the new way of doing it , it is not deprecated , directly converting primitive to object , implicitly done by java. 

    //using valueOf method , another way of boxing
    Integer z = Integer.valueOf(i); // Boxing , wrapper class , this is the new way of doing it , it is not deprecated , directly converting primitive to object , implicitly done by java , this is a static method of the Integer class , present in all wrapper classes.

    //some more examples of boxing
    Boolean c = true;
    Character d = 'a';
    Double e = 10.5;
    Float f = 10.5f;
    Long g = 10L;
    Short h = 10;
    Byte j = 10;

    //now unboxing , converting object to primitive
    int k = b.intValue();  //this is unboxing  
    boolean l = c.booleanValue(); //this is boolean unboxing
    char m = d.charValue(); //this is character unboxing
    double n = e.doubleValue(); //this is double unboxing
    float o = f.floatValue(); //this is float unboxing
    long p = g.longValue(); //this is long unboxing
    short q = h.shortValue(); //this is short unboxing
    byte r = j.byteValue(); //this is byte unboxing
    
    //now using autounboxing which is the newer way of doing it
    Character ch = 'a'; //this is autoboxing
    char ch1 = ch; //this is autounboxing , converts object to primitive implicitly

    //parsing methods
    String s1 = "hello";
    String s2 = "hello";
    //here s1 and s2 are two different objects but they point to the same string in the string pool , the same memory reference

    //There is no integer pool , so integers will be created in heap memory , in different locations
    Integer a1 = 10;
    Integer a2 = 10;
    System.out.println(a1 == a2); //this will print true , because both are pointing to the same object in the heap memory because for wrapper classes , they will be auto unboxed and compared , as a result this is true.
    //only for == operator uses range -128 to 127 for autoboxing and autounboxing , so if the value is in this range then it will point to the same object in the heap memory , otherwise it will create a new object in the heap memory.
    //behind the scenes a1 and a2 are converted to primitive int and then compared , so this is true.
    //this works for all operators such as + , - , * , / , % , etc. and logical operators such as && , || , ! , etc. and bitwise operators such as & , | , ^ , etc. and comparison operators such as < , > , <= , >= , == , != , etc.
    //auto unboxing works for only primitive data wrapper classes 

    //parsing of integers :- 
    int i1 = Integer.parseInt("10"); //this will parse the string and convert it to integer , autoboxing
    Boolean b1 = Boolean.parseBoolean("true"); //this will parse the string and convert it to boolean
    Character c1 = Character.valueOf('a'); //this will parse the character and convert it to character
    
}
}
