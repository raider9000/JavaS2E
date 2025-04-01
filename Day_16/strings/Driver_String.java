package Day_16.strings;

public class Driver_String {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        ///comparing two string literals using the == operator , this will result in true 
        ///because , both the variables are pointing to the same memory reference
        ///in the String constant 
        System.out.println(s1==s2);
        //This also returns true , as the euals method is overridden in the 
        //String class , as a result it only compares values and not references.
        System.out.println(s1.equals(s2));

        //new string object is created which is in the heap area as a new object
        //It has a new memory refrence address.
        String s3 = new String("Hello"); 
        ///As a result , this is returned as false as the references are compared
        /// in the == operator. 
        System.out.println(s1 == s3);

        String s4 = "hello"; // this when compared with the s1 or s2 will also result
        //in it being false if == operator is used. as s4 will have a different memory location 
        //as has a different literal value stored in it. 

        s1 = s1+"World";//This is changed and as a result , the previous reference
        //is updated with a new referecne as it is placed in a new block directly
        //inside the heap and no longer in the string constant pool. This will cause
        //the original refrence changed and the garbage collector will delete the data
        //in the older reference in order to free up memory as the older refrence has
        //no pointer. 

        String s5 = "hello" + "world"; //this uses the concatenation between two 
        //literals and as a result , the obejct is created in the String constant pool
        //rather than directly in the heap area.

        String s6 = s5 + "mellow"; //As this is concatenating with a String reference , 
        //The s5 object is created in the heap area rather than the String constant pool.
    }
}
