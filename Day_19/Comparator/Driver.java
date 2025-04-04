package Day_19.Comparator;

public class Driver {
    
    public static void main(String[] args) {
        Employee e1 = new Employee("Subho", 123, 30000);
        Employee e2 = new Employee("Random", 12334, 12400);
        
        //using the overridden toStirng method in Employee class
        System.out.println(e1.toString());

        //using the custom written method 
        comparebyID(e1, e2);
        
    }

    public static void comparebyID(Employee a , Employee b){

        //for using comparator , an object has to be made of the class 
        //implementing the comparator interface 
        Compare_by_ID c1 = new Compare_by_ID();

        //here using the object of class implementing the comparator interface , 
        //the overridden compare method is called. 
        if(c1.compare(a, b) > 0){
            System.out.println("Employee 1 has a bigger ID");
        }else if(c1.compare(b, a) > 0){
            System.out.println("Employee 2 has Bigger ID");
        }else{
            System.out.println("Both have the same ID");
        }
    }

    
}
