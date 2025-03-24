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
public class DriverAssociations_Composition {
    //Main method for driving the other classes
    public static void main(String args[]){

        //object of the container class , where both the name and lastname is passed.
        Container C = new Container("Subho" , "Mukherjee");

        //display method within the container class. 
        C.display();
    }
}


//here , the object of the container class is made in the main method and the 
//contained class object is made within the container class , and this chained method of
//object creation is called as associativity and this kind of association is called as COMPOSITION
//and this kind of tighy binding is called as early binding , where the moment the object of the 
//container class is created , the object of the contained class is also created within the container class. 
