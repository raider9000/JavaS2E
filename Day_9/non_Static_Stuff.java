//this is interlinked with the static_stuff class.
public class non_Static_Stuff {
    public non_Static_Stuff(){ //this is the constructor of the class
        System.out.println(Static_stuff.id); //static variable accessed from the static_stuff class

        //Creating an object reference of static_things class to access the non-static variable name
        Static_stuff s1 = new Static_stuff();
        System.out.println(s1.name); //works as the object is created for non-static variable under 
        //static_stuff class.
    }
    
    public static void main(String args[]){

    }
}
