public class Non_Static_Stuff {
    //This is a non-static initializer
    //It is executed when the Object is created of the class and the object is loaded
    //and is executed by the JVM 
    {
        System.out.println("Multi_Line Non-Static Initializer");
    }
    //This is the constructor of the class
    public Non_Static_Stuff(){
        System.out.println("This is the Constructor");
    }
    //this is the main method
    public static void main(){
        //developing the object :- 
        //This object executes the non-static block and the SOP line in the 
        //non static block , will execute after the creation of the obejct. 
        //Everytime a object is created , the non-static block is always executed
        //unlike the static block which executes once in a prog. regardless whether the 
        //object is used or not.  
        Non_Static_Stuff N1 = new Non_Static_Stuff();
        
        System.out.println("Main Method");
    }
}

//[Note] :- Static and non-Static intializers can exist in the same prog,
//where the static initializer is executed at the beginning before the main
//method only once throughout the program. The non-static initializer is executed 
//everytime an object is created , and it is called and executed after the object has loaded

//regardless the object is used or not.