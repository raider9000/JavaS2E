package Day_14.non_primitive_Typecasting.upcast;
//this class demonstrates upcasting on non primitive datatypes 
public class Driver {
    public static void main(String args[]){
        //here , the non primitive datatype is upcasted to the Animal class from the dog class. 
        //The object reference of the dog class is stored in a animal parent class variable. 
        //however , the dog class or the child class methods will only be executed as , 
        //the animal class variable is simply a container. 
        //The reference of the dog object is stored in the animal container.
        Animal d = new Dog(); // here , the reference inside the animal type container d is Dog type and because of this , it will call the Dog class method only.
        d.sound();
        Animal t = new Tiger();
        t.sound();
    }

    //[Note:-] The container does not matter but what reference the container contains majorly matters. 
    //This will only be possible if the dog is extended or inheriting from the animal class , 
    //if there is no inheritance , then upcasting is not possible between the non primitive datatypes. 
    //the reference of the object in the container will only determine what is being executed. 
}
