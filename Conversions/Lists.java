package Conversions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//This class deals with the conversion between primitive and non-primitive lists and arrays , etc
public class Lists {
    public static void main(String[] args) {
        int arr[] = {1 , 2, 3, 4, 5 , 6 ,7 , 8, 9 , 10};

        //Conversion from Array of ints to ArrayList 
            //Way 1:- 
            ArrayList<Integer> al1 = new ArrayList<Integer>();
            for(int i : arr){
                al1.add(i);
            } //This adds each of the elements in the int array one by one to ArrayList

            //Way 2:- 
            List<Integer> al2 = new ArrayList<Integer>();
            al2 = Arrays.asList(Arrays.stream(arr).boxed().toArray(size -> new Integer[size]));

            //The following is the smae code as above but using method references 
            //al2 = Arrays.asList(Arrays.stream(arr).boxed().toArray(Integer[]::new));

        
        //Conversion to String builder / String buffer :- 
            //Way 1:-
            StringBuilder sb = new StringBuilder();

            for (int value : arr) {
            sb.append(value); // Append the integer (implicitly converted to String)
            sb.append(", ");} //Adding a seperator to get each of the values seperately 

            //Way2:-
            String result = Arrays.stream(arr).mapToObj(number -> String.valueOf(number)).collect(Collectors.joining(", ")); 
            //using Streams to make the StringBuilder and finally adding the ',' in order to seperate the values 


        //Conversion of Strings to String Builder 
        String str = "Something";
            
            //Way1 :-
            StringBuilder stB = new StringBuilder(str);

            //Converting back to String from StringBuilder 
            String backtoString = stB.toString(); //This converts the String Builder back to String

        
        

        
            
        


    }
}
