package Day_14.non_primitive_Typecasting.upcast;
//Here , in this class the method sound is overridden from the original parent class which is animal. 
//in order to access the method of the parent class , then the super.method_name keyword is required in order to acess the parent's sound method. 
public class Animal {
    //here , the sound method of the parent class is overridden. 
    //the overridden method can be either broadened or kept same as parent method , not reduced. 
    //Here , public is kept so no error but if made private , will throw an error. 
    
    //changing the return type from void to int will throw an error , changing return type during method overriding is not allowed.
    //method overriding should have the entire declaration same , unlike overloading where , where only signature needs to match. 
    //method overriding still allows the return of covariant return types.
    public void sound(){
        System.out.println("makes sound");
    }
}
