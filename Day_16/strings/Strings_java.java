package Day_16.strings;
//This class deals with the intricacies of the String class in java 

//[Note :-] In  the heap area of the jvm execution , a specific part of the memory is kept 
//for the storing of the String literals only , called as the String constant Pool , here duplicates are not allowed. 
public class Strings_java {
    //the different methods of creating strings :-
    String s1 = "Hello"; //String literal | (Gets stored in the String constant pool)
    String s4 = "Hello"; // This literal also is in the String constant pool and s4 points to the same memory reference as s1. 
    String s2 = new String("Hello"); //By creating a string obejct | 
    //This string creates a new object and gets stored directly in the heap area as a new object.  
    char arr[] = {'a' , 'b' , 'c' , 'd' , 'e'}; //a character array
    String s3 = new String(arr); //converted to a string , by simply passing the character array.
    //same as above , gets stored in the heap area as a new String object.

    


}
