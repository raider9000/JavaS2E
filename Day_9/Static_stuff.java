//This class is interlinked with the non_static_stuff to showcase the uses and usage of the 
//static and non_static methods and variables.

public class Static_stuff {
    static int id = 10; //this is a static variable 
    String name = "Someone"; //this is a non-static variable
    public Static_stuff(){ //this is the constructor of the class
        System.out.println(id); //accessing the static variable
        System.out.println(name); //accessing the non-static variable 
        //the above shows that the static variables are accessible in a non static block without the classname
        //or the object name. 
    }
    //[Note] : Constructor always executes first after the creation of the object , so if there
    //is a print statement in the constructor then that will execute always first. 


    public static void main(String args[]){
        System.out.println(id);
        //System.out.println(name); will give an error as name is  non-static and will require an 
        //object creation to access it. 

        //creating an object to interact with the non-static variable name
        Static_stuff s1 = new Static_stuff();
        System.out.println(s1.name); //this works as a non-static variable is accessed with the 
        //created object s1. As non-static variables require objects to be interacted with.
    }
}
