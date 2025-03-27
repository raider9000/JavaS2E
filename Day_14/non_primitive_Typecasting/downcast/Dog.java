package Day_14.non_primitive_Typecasting.downcast;
public class Dog extends Animal{
    public void sound(){
        System.out.println("Dog is barking");
    }
    public Dog(String breed){
        this.breed = breed;
        System.out.println(breed);
    }
}
