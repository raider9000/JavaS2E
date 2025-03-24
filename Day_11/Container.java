//Day_11 of the training , this class covers the associations in java. 

//This is the container class  , which has the reference object of the 
//contained class in it. 

//Everytime an object of the container class is made , the contained class obejct is also automatically created.

public class Container {
    String name; //attribute of the container class
    Contained C1; //Reference object of the contained class

    //constructor of the Container class.
    public Container(String name , String lastName){ 
        this.name = name; //sets the name attribute in the contained class
        C1 = new Contained(lastName); //This passes the last name to the contained class through the object.
    }

    //method to print the name attribute
    public void display(){
        System.out.println(name + " " + C1.lastName);
    }
}
