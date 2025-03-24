//This class shows the aggregation based associativity , a.k.a lazy binding. 

package Aggregation;


//[Theory:-] concept is that the sim and phones are different entities and can exist seperately. 
//Here , seperate objects will be made for the container phone class , and the contained sim class. 
//both the objects can exist seperately and seperately accessible. 
//The object of the sim class is passed to the constructor of the container class i.e phone. 


public class phone {
    String name; //name attribute of phone class
    Sim sim; //object of the sim class
    public phone(String name , Sim sim){
        //Sets the name attribute using this. , where this access the current object
        this.name = name; 

        //passes the sim object externally to the sim object in the container class of phone.
        this.sim = sim;
    }

    //method to display the contents. 
    public void display(){
        //here , this.sim is used because it access the sim object within the current instance of the 
        //phone. this.sim uses the current refrence , i.e the reference from the phone object reference to the 
        //sim object reference inside the phone object.
        System.out.println(name + " " + this.sim.sim_name + " " + this.sim.number);
    }
}
