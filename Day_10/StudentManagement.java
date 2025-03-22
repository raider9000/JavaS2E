//This is a sample code that is to show encapsulation and is made to test encapsulation 
//This code is not to learn from or refer to for Study. 
import java.util.*;
public class StudentManagement {
    private int Roll_no = 12;
    private String name = "Subho"; 
    private String Pswd = "1234";
    
    public void set_Roll(String psw , int x){
        if(psw == Pswd){
            this.Roll_no = x;
            System.out.println("Roll updated!");
        }else{
            System.out.println("Invalid Password");
        }
    }

    public void set_Name(String psw , String name){
        if(psw == Pswd){
            this.name = name;
            System.out.println("Name Updated");
        }else{
            System.out.println("Invalid Password");
        }
    }

    public void set_Pass(String old , String NEW){
        if(old == Pswd){
            System.out.print("Retype new password again : ");
            Scanner sc = new Scanner(System.in);
            final String temp = sc.nextLine(); sc.next(); sc.close();
            if(temp == NEW && NEW != old){
                set_Pass_HARD(NEW);
            }else if(NEW == Pswd){
                System.out.println("Old PASS Cannot BE NEW PASS");
            }else{
                System.out.println("Wrong Pass RETYPED.");
            }
        }else{
            System.out.println("Invalid Initial Password");
        }
    }

    private void set_Pass_HARD(String x){
        this.Pswd = x;
    }
}
