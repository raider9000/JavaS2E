package Day_20.Collection_Frameworks.Sets.Hash_Sets;

import java.util.Objects;

public class Student {
    private int id;
    private String name;


    //Constructor of the class 
    public Student(int id , String name){
        this.id = id;
        this.name = name;
    }

    //Simple overriding of the toString method.
    @Override
    public String toString(){
        return "Id : " + this.id + "\tName : " + this.name;
    }


    //Simple overriding of the equals method that allows for the comparision between the objects and 
    //this method is called during the hashset implementation accepting this class objects , to remove the 
    //duplicates.
    @Override
    public boolean equals(Object e){
        //checks whether the object passed is same as the current object. 
        return ((Student)this).id == ((Student)e).id;
    }


    //Simple overriding of the hashcode method that returns a hashcode using the function inside the Object 
    //super class , that takes in the data. 
    @Override
    public int hashCode(){
        //here , the hashCode is being genrated using two attributes , that means both the id and name 
        //are compared in order to distinguish uniqueness between two obejcts. 
        
        return Objects.hash(name , id);

        //If there were other attributes on which the hashcode was not generated and duplicate value were 
        //passed during the creation of the Student object in the Driverclass , that new object
        //even having the same value for the other attribute , will be considerd as an unique object , 
        //as hadnling that attribute is not defined in hashCode method. 
    }
}
