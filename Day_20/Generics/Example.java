package Day_20.Generics;
//This class deals with using generics directly 
public class Example<T>{

    ///Here , T is the generic type parameter
    ///It will become any type such as Integer , String , etc or any non primitive type
    ///When the object of the class is created in the main method and the type is passed 
    /// calling the constructor of this class. 
    T data1;
    T data2;

    //Constructor of the class
    Example(T data1, T data2){
        this.data1 = data1;
        this.data2 = data2;
    }


    //Simple overriding of the toString method 
    @Override
    public String toString(){
        return data1 + " " + data2;
    }


    //Here , this method accepts a generic type parameter , which has to be metioned 
    //after static so , the arguements of the method can accept a generic parameter 
    //Here , the method accepts an array of generics in the form of T[] and prints the
    //elements of the array , using a for each loop which also uses a generic type as
    //placeholder.
    public static <T> void print(T[] arr){
        //Only generic array arguements are allowed to be taken , intitializing generic array 
        //inside classes or methods is not allowed as the compiler has no way of knowing what 
        //type the generic placeholder <T> will take before running the program , and as a 
        //result , the compiler will give an error. 
        //T[] arr = new T[5]; //will give error

        //Simple for each loop using a generic placeholder to loop through the array
        for(T i : arr){
            System.out.println(i);
        }
    }
    public static void main(String[] args){

        //Here , creating a generic object of the class Example and passing the type as Integer
        //The type of the generic placeholder <T> will be Integer and the data1 and data2
        //will be of type Integer.

        Example<Integer> e1 = new Example<Integer>(10,20);
        System.out.println(e1);
        System.out.println(e1.data1 instanceof Integer); //true as data1 is of type Integer
        System.out.println(e1.data2 instanceof Integer); //true as data2 is of type Integer


        //The same thing as above but now using String type of class 
        Example<String> e2 = new Example<String>("Hello", "World");
        System.out.println(e2);

        //The type can be of any non-primitive type , both user defined and built in types are allowed 
        //as long as the type is of non primitive. Passing primitive types such as int , bool , etc
        //are not allowed and will cause an error. 
        
        Integer[] arr1 = {1,2,3,4,5};
        String[] arr2 = {"hello", "world", "demo"};
        //Passing the array of generics to the static method print() which takes a generic type
        //as arguement and prints the elements of the array using a for each loop.
        print(arr1); //will print the elements of the array
        print(arr2); //will print the elements of the array
        
    }
}
