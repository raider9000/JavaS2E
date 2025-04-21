package StreamAPI;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
//This class deals with the usage of the Stream API inside the Java.Util package
//[Note : ] Stream is an interface that can be used after impoerting it from the 
//util package. 
public class Streaming{
    //[Note : ] Streams are stateless , as a result it will not alter the original collection 
    //It will return a new Stream everytime. 
    public static void main(String[] args) {

        //[Note : ] This is a simple impementation of a Stream. 
        //Generally pipeline checkpoints are used , but here suing different Stream references to perform the operations. 

        //Creating a list and using asList inside Arrays in order to store a List
        List<Integer> l1 = Arrays.asList(1 , 2, 5, 7, 8 , 7 , 4 , 3 , 1);

        //Now trying to remove the duplicates using the Stream API , rather than 
        //writing my own logic and creating a for loop.
        //Also , we do not want to alter the original List but still want to perform operations on the  List. 

        //In order to do the above, the List has to be converted to a Stream first.
        //Storing the l1 List as a stream inside a Stream reference 
        Stream s = l1.stream();

        //This is the method inside Stream interface<Stream API> in order to remove the duplicates. 
        //This also returns a Stream only. 
        //s.distinct();
        //However , on one stream , only one function can be done and performing any other function on that stream will result in an error as that stream is closed. 
        //So in order to iterate over that stream , we need to create another stream reference and store that stream's function in that stream. 
        Stream s2 = s.distinct(); //after this Stream s is closed and in order to iterate over the distince Stream that we get by the distinct method 
        //We have to iterate over the Stream s2. 


        //forEach is a method inside the Stream APi , which can be used on the Stream type references. 
        //The forEach method is a higher order function , that takes a function as an arguement , So we are passing a lambda expression as an arguement. 
        //n->(S.O.P(n)) means that in the method , directly the single line logic is passed to the interface. 
        s2.forEach(n->System.out.println(n));//Prints the distinct elements 

        //[Note : ] Any method that accepts a functional Interface is a Higher Order Function.

        //On printing the original List , we can see that nothing is modified , This is the Stateless property of Streams.
        System.out.println(l1);



        //Now using the pipelines on Streams :-
        
        //Performing oeprations on Streams return a new Stream and the old Stream is closed and deleted by the garbage collector. 
        
        //Using method chain to pipeline the operations 
        l1.stream().distinct().forEach(n->System.out.println(n));

        //if using a custom interface example :-
        ///interface Consumer<T>{
        /// void accept(T t);
        ///}
        /// Then the code for the Stream is :-
        /// Consumer<Integer> c = n -> System.out.println(n);
        /// //Passing the Interface reference to the forEach(); Higher order function. 
        /// l1.stream().forEach(c);
        /// 
        /// The above is the same as l1.stream().forEach(n->System.out.println(n));
        /// but for custom interfaces , The lambda expression now targets the Consumer 
        /// interface abstract method. 
        
        //[Note : ]Lambda expressions are anonymous method , this creates an anonymous class , and an anonymous object is created of that class and that reference of that anonymous class
        //is stored in the interface reference , example :- 
        //Demo d = () -> S.o.p("Hello"); , the anonymous class reference is stored in the Interface reference d , as objects of interfaces are not possible. 
        
        
    }   

}
