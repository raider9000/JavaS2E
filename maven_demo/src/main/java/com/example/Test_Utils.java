package com.example;
import java.util.Collections;
import java.util.List;
//This is the source file which has the methods that will be tested with jUnit 

//These are the simple methods that need to be tested with jUnit 
public class Test_Utils {

    //Simple addition method
    public int add(int a , int b){
        return a+b;
    }

    //Simple return list method 
    public List returnList(List list){
        return list;
    }

    //Simple method to take an input of a list and sort it. 
    //Since sort of list needs a comparator , we are using streams to sort it and return it asList.
    public List sorterd(List list){
        return list.stream().sorted().toList();
    }
    public int divide(int x , int y) throws ArithmeticException{
        if(y!=0) return x/y;
        if(y == 0) throw new java.lang.ArithmeticException();
        else return -1;
    }

    //This returns the String only if the String starts with "H"
    public String returnString(String s){
        if(s.startsWith("H")) return s;
        else return null;
    }

    //returns the sorted list 
    public List<Integer> checkSameListAfterModifying(List<Integer> list){
        Collections.sort(list);
        return list;
    }

    //returns the String list by making all the characters in UPPERCASE
    public List<String> checkMatchers(List<String> list){
        return list.stream().map(String::toUpperCase).toList();
    }
}
