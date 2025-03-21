public class StudentDriver {
    public static void main(String args[]){
        //The following has two reference variables s1 and s2 which hold the reference to the 
        //newly created objects from the constructor new Student()
        Student s1 = new Student(14 , 21.3);
        Student s2 = new Student(12 ,22.3);
 
        System.out.println(s1.college + " " + s1.roll_no);
        s1.study();

        //The following modifies the values of only the s1 object , as the methods and attributes
        //are all non-static in nature 
        //s1.college = "UEMK";//
        //s1.marks = 12.89; 
        //even after this , the s2 object attributes are not affected and will remain default values 
        System.out.println("----------------------------------");
        System.out.println(s2.college + " " + s2.roll_no);
        s2.study(); //executes the study method in the class 
    }
}
