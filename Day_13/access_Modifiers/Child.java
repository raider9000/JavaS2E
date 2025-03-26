package access_Modifiers;
//This class demonstrates how the access modifiers function and are implemented
public class Child {
    void validate(){
        System.out.println(Parent.a);
        
        //here , being a public static method in parent class , it is accessible by 
        //simple classname.attribute.
        Parent.print();
    }
}
