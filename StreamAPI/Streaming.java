package StreamAPI;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
import java.util.Optional;
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
        
        //forEach method returns void , so that chained Stream cannot be stored in a new Stream. 


        //Way of fetching the minimum element, same way use .max(lambda exp) , in order to find the maximum element ((o1 , o2) -> o2-o1);

        System.out.println("------------------------------------------------");
        
        //This is using the optional interface nad using its reference in order to store the stream reference.
        //Optional class is a class for holding the objects , and help in handling the null values 
        //So that nullpointerExceptions are handled. 
        Optional<Integer> op1 = l1.stream().distinct().min((o1 , o2) -> o1-o2);
        
        //The isPresent() method will return null , if the element is not present. 
        if(op1.isPresent()){
            System.out.println(op1.get());
        }

        //The following returns an Integer object. 
        Integer a = l1.stream().distinct().max((o1 , o2) -> o1-o2).get();
        System.out.println(a);

        //Some other methods :- 
        l1.stream().sorted().forEach((n)->System.out.print("\n" + n+ " ")); //This method also returns a stream
        //so using forEach to print the elements with a lambda function 
        
        //using sorted to print in descending order :-
        l1.stream().sorted((o1 , o2) -> o2-o1).forEach((n) -> System.out.print("\n" + n + " "));
        //Passing a lambda function with the logic to sort in the descending order to the sorted() method
        //The sorted method also accepts a comparator , that is passed with a lambda function. 

        //Now writing a code for the stream to first remove duplicates , sort in ascending , multiply each element with itself and then print it out. 
        //the map() , allows for the iteration over each of the elements in the stream , and accepts a method , which makes it a higher order function. 
        l1.stream().distinct().sorted().map((n) -> n*n).forEach((n) -> System.out.print("\n" + n + " "));


        //Now writing the code to filter out the even numbers in the stream 
        l1.stream().distinct().filter((n) -> n%2 == 0).forEach((n) -> System.out.print("\n" + n + " "));
        //Here a Stream object is returned everytime , so we want to convert the stream back to a List
        System.out.println();

        List<Integer> li = l1.stream().distinct().filter((n) -> n%2 == 0).toList();
        //The above now stores the result inside the List li. 
        System.out.println(li);
        //Sameway , toArray() produces an array type as a return 


        //Now finding the first element of the Stream elements 
        Optional<Integer> op = li.stream().findFirst();
        System.out.println(op.get()); //This gets the first element inside the Stream 

        //Same for finding a random element 
        System.out.println(l1.stream().findAny().get()); //Directly gives an Integer type of object

        //Same but to find the count of elements in the Stream
        System.out.println(l1.stream().count());


        //Conacatenation of different types of Obejcts
        List<String> strings = Arrays.asList("HI" , "Hello" , "YO");
        List<Integer> ints = Arrays.asList(1 ,2 ,3);

        Stream<String> s1 = strings.stream();
        Stream<Integer> s3 = ints.stream();

        Stream.concat(s1 , s3).forEach(n->System.out.print(n + " "));
        System.out.println();
        //The above has concatenated the different Streams and returned a stream type of obejct 

        //using the allMatch() , method to check whether any element inside the Stream satisfies the given condition. If all the elements satisfies the condition , only then boolean True is returned. 
        System.out.println(l1.stream().distinct().allMatch(n->n%2==0));
        //If all the elements inside the Stream is divisible by 2 only then true is returned else false

        //Using anyMatch(); , just the opposite of the allMatch(); if any of the elements satisfy the condition , then it will return true else if no element satisfy then false. 
        System.out.println(l1.stream().distinct().anyMatch(n->n%2==0));

        

    }   
    
}
