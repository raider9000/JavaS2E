package Aggregation.Many_to_many;
//This class demonstrates the many to many aggregation based association

//the student class 
public class Student {
    String name; //name attribute of the student class 
    Course[] courses; //Making a course array of objects to store the course objects 
    int count = 0; //keeping the count of the course object array

    //constructor of the Student class
    public Student(String name , int size){
        this.name = name;
        this.courses = new Course[size]; //sets the course object array size
    }

    //This method adds the course relation with the the Student objects 
    public void addCourse(Course course){ //here , taking an input of Course class of obejct
        if(count < courses.length){ //simple check to see if the length is not corssed of the array 
            courses[count++] = course; //adding the course object inside the courses object array by post incrementing the count variable. 
        }else{ //condition to handle if more objects are forced into an already full array
            System.out.println("Array is full.");
        }
    }

    //Simple display method
    public void display(){
        for(Course course : courses){
            System.out.println(name + "\t" + course.name);
        }
    }
}
