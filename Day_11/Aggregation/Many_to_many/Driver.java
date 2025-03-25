package Aggregation.Many_to_many;

public class Driver {
    public static void main(String args[]){

        //Adding the student objects
        Student s1 = new Student("Subho" , 3);
        Student s2 = new Student("Subhojeet" , 2);

        //making the course objects
        Course c1 = new Course("Java" , 3);
        Course c2 = new Course("SQL" , 2);
        Course c3 = new Course("ML" , 4);

        //adding the courses to s1 object
        s1.addCourse(c3);
        s1.addCourse(c2);
        s1.addCourse(c1);
        //as correct number of courses are added to the student , so no error is thorwn as 
        //size os 3 and the number of courses added is 3 , so no error in incurred and 
        //correct execution of display method of s1 occurs.
        s1.display();

        //adding the courses to s2 object 
        s2.addCourse(c1);
        //here , this will thorw a warning error as size for s2 has been initialized to 2
        //and only one course has been added , so eve after execution , it would throw an 
        //error after the display method is executed as the second positon is still null 
        //so a null reference error is thorwn. 
        s2.display();

    }
}
