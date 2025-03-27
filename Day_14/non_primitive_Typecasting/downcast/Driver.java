package Day_14.non_primitive_Typecasting.downcast;
//this class demonstrates downcasting on non primitive datatypes 
public class Driver {
    public static void main(String args[]){
        //the following is upcasting
        Animal d = new Dog("husky"); // here , the reference inside the animal type container d is Dog type and because of this , it will call the Dog class method only.
        d.sound();
        //here as the reference of breed is in the child class which is the dog, so the parent has to be converted to the child class type object
        //here , (Dog)d is the type cast operator of the Animal type object to Dog class object. 
        //after the downcast , .breed is visible as the parent animal conatiner is converted to dog class object. 
        String dog_breed = ((Dog)d).breed;
        System.out.println(dog_breed);
        Animal t = new Tiger();
        t.sound();
    }

    //[Note:-] The container does not matter but what reference the container contains majorly matters. 
    //This will only be possible if the dog is extended or inheriting from the animal class , 
    //if there is no inheritance , then upcasting is not possible between the non primitive datatypes. 
    //the reference of the object in the container will only determine what is being executed. 
}
