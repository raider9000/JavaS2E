//This is the Driver class for demonstrating the association by COMPOSITION

//[Note:-] Concept is that every first name also has a lastname , that shows a HAS A relationship


//[Note :-] First when jvm starts , it will look for the main method , then after main method is found , 
//The object of the Container class is being created (Object has non static members only) , which also 
//creates an object of the contained class which stores the lastname. 

//Here , the container class has the refrence of the contained class which has the dependency lastname for the 
//container class. 

//[COMPOSITION] : Here , the container and contained classes are tightly bound where , container class 
//is mandatorily required in order to access the contained class. Contained class does not exisit independently
//and needs the container class to exist. Hence , if the container class doesnot exist , then the 
//container class also does not exist.
public class DriverAssociations {
    public static void main(String args[]){
        Container C = new Container("Subho" , "Mukherjee");
        C.display();
    }
}
