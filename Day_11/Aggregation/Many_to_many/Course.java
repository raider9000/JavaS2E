package Aggregation.Many_to_many;

//This is the course class to which the students have many to many relation in uni direction Student -> Multiple courses
public class Course {
    String name; //name attribute of student course class, having course name
    Student[] students; //adding student object array in order to establish the many to many relationship 

    //constructor of Course class 
    Course(String name , int size){
        this.name = name; //setting the course name
        this.students = new Student[size]; //initialized the Student type of object array
    }
}
