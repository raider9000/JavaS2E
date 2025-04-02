package Day_17.exceptions_handling;
//shows the stackoverflow error exception 
public class initializing_error_demonstration {
    static String s1 = null; //this gives an exception initializer exception as this occurs before the main method and before the class loading process , so this error occurs as jvm gets it at first. 
    static String s2 = s1.toUpperCase(); //this causes the nullpointerexception as null tries to access a method from a static variable.
    
    public static void main(String[] args) {
        rec(); //this causes a stackoverflow error exception as this is an infinite recursion 
        //when initilaized inside main method , staitc doesnt work but written as string s1 = null; , then it simply prints null as no staic is invoked by a null. 
        System.out.println(s2);
    }
    public static void rec(){
        rec();
    }
}
