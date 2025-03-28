package Day_15.Final_keyword;
//this class shows the usage of the final keyowrd 
public class Final_usage {
    //here , using the final keyowrd , makes the int a to be of final type. 
    //as a result , it cannot be rewritten , so a = 20; will produce an error.
    final int a = 10;

    //This is a final method and due to being of final type , this method cannot
    //be shadowed or overridden 
    final void demo(){

    }
    //A final type of a class cannot be inherited , as a result abstract class 
    //cannot be made final because it needs to be inherited mandatorily.
}
