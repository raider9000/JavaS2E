package Day_15.Interfaces;
//the following shows implementation of interface
public interface Vehicle {
    int speed = 10; 
    void print();
    void Start();

    //the usage of static methods in interfaces allows for the usage of utilities inside the interface
    static void utility(){
        System.out.println("This is an utility");
    }

    //[Note :-]Static is allowed in interfaces in order for running the java program directly from the interface
    //that is , the interface can directly house the main method inside it.
}
