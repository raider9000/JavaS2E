package Method_Chaining;

public class Student {
    //This class demonstrates method chaining 

    String name;
    int id;

    public Student Set_Name(String name){
        this.name  = name;
        //the following will return the reference of the newly made student object. 
        //Student s1 = new Student();
        //return s1;

        //however , if we want to return the currently exisiting object , then we return 'this', not using this and returning the newly created obejct as seen in the above comments , this would create a new obejct and return that newly created object reference , which would have a different memory reference than theactual obejct passed. So to get the reference back of the object used in the main method , we use return this.
        return this;

        //this keyword 
    }
    
    public void display(){
        System.out.println(this.name + " " + this.id);
    }
}
