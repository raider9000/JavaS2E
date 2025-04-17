package Day_20.Collection_Frameworks.Sets.Hash_Sets;
import java.util.HashSet;
public class StudentDriver {
    public static void main(String[] args) {

        //HashSet accepting the Student type of data objects 
        HashSet<Student> hs = new HashSet<Student>();


        //Creating the Student objects that need to be added to the HashSet
        Student s1 = new Student(123, "IDK");
        Student s2 = new Student(347, "nahiBOLUNGA");
        Student s3 = new Student(25, "patanhi");
        Student s4 = new Student(25 , "patanhi");

        //Adding the Student objects created above to the HashSet
        hs.add(s3);
        hs.add(s1);
        hs.add(s2);
        hs.add(s4); //this object has duplicate values with s3 and will get printed , we need to remove it 
        //by manually overriding the equals and hashcode method.


        //As the equals and hashCode method has been overridden in the Student class , the hashSet calls 
        //the overridden method innately in order to distinguish between the given values and remove the 
        //duplicates. If the methods were not overridden then the hashCode method calls the default 
        //methods of equals and hashCode from the Object Superclass , which being default , are not designed to 
        //handle user-defined , so by default duplicate values are added and shown. 
        System.out.println(hs);
    }
}
