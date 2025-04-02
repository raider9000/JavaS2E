package Day_17.String_buffers;
import java.util.*;

//This class deals with the usage of String buffers and then String builders
public class practice_buffers {

    //[Note :-] StringBuffer is Thread safe and Synchronized in nature , as a result 
    //it is slower than string builder and generally used for tasks where data 
    //inconsistencies are not tolerable.
    public static void main(String[] args) {
        //making an object s1 of the string buffer type 
        StringBuffer s1 = new StringBuffer();
        s1.append("Hello");//appending strings to string buffer 
        s1.append(12);//same method for appending numbers as a string
        char arr[] = {'a' , 'b' , 'c' , 'd'}; //making a char array
        s1.append(arr); //can directly add char array using append method 
        System.out.println(s1); 

        //This prints the capacity of the stringbuffer obejct , by default the capacity
        //is of 16 characters , but when exceeeded , it dynamically increases by the formula
        //(old cap. * 2) + 2 formula.
        System.out.println(s1.capacity());

        //The initial capacity can be increased during the object creation by passsing the 
        //capacity required in the constructor of the StringBuffer , which should be equal to 
        //or greater than the default capacity.

        //Using the insert method of the stringbuffer class
        StringBuffer s2 = new StringBuffer();
        s2.append("Hello");
        s2.insert(4 , arr , 1, 3);
        //(position of current stuff inside , array of char , starting location of char arr , ending locaiton of char arr)
        //This inserts the characters from the char array(from pos 1 to 3 (including))at position 4 of the hello already inside the Stringbuffer    
        System.out.println(s2);//prints hellbcdo

        //converting StringBuffer to a string type of object
        String s = new String(s2); //converts StringBuffer s2 into a String type of object
        StringBuffer s3 = new StringBuffer(s); //Converting a String to a StringBuffer 
    }
}
