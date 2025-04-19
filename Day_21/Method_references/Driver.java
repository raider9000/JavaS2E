package Day_21.Method_references;

public class Driver {

    //Syntax is ClassName::Methodname to call that method 
    public static void main(String[] args) {
        Demo d = System.out::println; //Dont use parantheses , only using method name
        d.print("HEllO");

        //creating the obejct of the driver class to access the method inside it 
        Driver driver  = new Driver();
        Test t = driver::print;//passing the reference of that method.
        t.greet(5 , "Welcome");
        
        Table table = Driver::printTable;
        table.printTable(0);


    }

    public void print(int number , String message){
        for(int i = 0 ; i < number ; i++){
            System.out.println(message);
        }
    }

    public static void printTable(int x){
        for(int i = 1 ; i <= x ; i++){
            System.out.println(i*x);
        }
    }
}
