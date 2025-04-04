package Day_19.Sorting_Non_Primitive_Arrays;
import java.util.Arrays;
import java.util.Comparator;
public class Dog implements Comparable{
    String name; 
    int age;
    String breed;

    public Dog(String name, int age , String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public String toString(){
        return "Dog Name: " + this.name + "\n" + "Dog Age: " + this.age + "\n" + "Dog Breed: " + this.breed;
    }

    public static void main(String[] args) {
        Dog d1 = new Dog("Sam", 2 , "Terrier");
        Dog d2 = new Dog("alex" , 4 , "Bulldog" );
        Dog d3 = new Dog("Blahh", 5 , "labrador");

        Dog dogs[] = {d1, d2, d3};

        //The Arrays class has a sort method which is used to sort array type objects. 
        //here , a compareTo method is required and mandatorily implementing the comparable or comparator interface 
        //(This happenes seamlessly in Strings because , the Strings class by default has the comparable interface implemented)
        //The Arrays class has no comparable implemented by default , so we are implementing the comparable interface in the class 
        //and giving it the logic of comparision of the different objects by overriding the compareTo method. 
        //if multiple attributes at the same time needed to be compared then the comparator implemented class has to be 
        //explicitly made and then used here by creation of objects. 
        Arrays.sort(dogs); //this now sorts on the given logic which is defined below by overriding compareTo method 
        //The Arrays class calls the compareTo method implicitly and uses that logic in order to sort the non primitive type of array.

        //Using a for-each loop for printing the objects
        for(Dog d : dogs){
            //this implicitly calls the toString method , which prints the information within the 
            //in each of the dog objects as defined in the overridden toString method
            System.out.println(d);
        }


        //now using the different method in the Arrays class which calls the compare method and not the compareTo method 
        //Arrays class , normal .sort method calls the compareTo method by default and this other method is required to call 
        //the comparator rather than comparable. 
        Compare_breed cb1 = new Compare_breed();
        Arrays.sort(args, cb1);//this is used to sort the array of objects based on the breed of the dog 
        //This is an overloaded method of the sort , which takes the comparator as an argument and the array of non primitive objects 


    }

    //this overridden compareTo method of the comparable interface , is returning the difference 
    //between the names , if the names are same then it is returning the difference betweem the ages
    //and if th eages are also same , it is returning 0.
    public int compareTo(Object a){
        Dog d = (Dog)a;
        if(this.name.compareTo(d.name) != 0){
            return this.name.compareTo(d.name);
        }else if(this.age - d.age != 0){
            //the sorting is based on the ascending order 
            return this.age - d.age;
            //d.age - this.age; //for descending order
        }else{
            return 0;
        }
    }

    public static int compare_with_Breed(Object a , Object b){
        Dog d1 = (Dog)a;
        Compare_breed cb1 = new Compare_breed();
        return (int)(cb1.compare(a, b));
    }
}
