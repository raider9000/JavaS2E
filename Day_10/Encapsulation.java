//This class is linked with the Encapsulation demonstration class
//to show encapsulaton. 
public class Encapsulation {
    private int key = 10; //the private makes this int only accessible within this class
    private int balance; //This is the private balance
    
    //here , we are allowing controlled access to any caller function that uses the 
    //object. Hence , encapsulation is used for data validation and data authentication. 
    //This encapsulates the methods and the data under the class Encapsulation and 
    //the key and balance are binded with each other for authentication. 
    public void setbalance(int x , int n){
        if(n == key){ 
            this.balance = x;
            System.out.println("Balance Updated");
        }else{
            //Here, if wrong key provided by the user/caller , then the
            //access is not given. This si the demonstration of binding the 
            //balance value with the key value in order to give controlled acess.
            System.out.println("Key not matching!");
        }
    }

    //this function simply prints the balance. 
    public void getBalance(){
        System.out.println(balance);
    }
}


//Encapsulation allows the controlled access to private variables and data
//to other outside functions or callers , by first authenticating the request 
//which is achieved by binding keys with data that is requested , like Bank Systems. 

//Encapsulation prevents the public access of private data within a function by any caller method. 
