package Super_keyword;
//use class name for the specific class static variable 
//not using classname will result in error for static variable

//for a static attribute in parent class , access that static attribute
//in the child class only by using classname.attribute and not 
//super.attribute , as it generates a warning. 
public class Child extends Parent{
    String a = "Child";
    static int b = 10;
    public void print(){
        System.out.println(a);
        System.out.println(super.a);
        System.out.println(b);
    }
}
