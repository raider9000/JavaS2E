package Day_23;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//This class deals with phone validation using regex
public class PhoneValidation {
    public static void main(String[] args) {
        //This is the regular expression to check the phone number
        //d{9} is the quantifier for the number of digits , that means that the number should contain 9 digits
        //[789] means that it will accept the number only if it starts with 7 ,8 , or 9 and if the number starts with 7 8 or 9
        //Then 9 digits of the number will be taken
        //If a number is not found and a ^ is present , then it starts with 789 only and an ending with $ the regular expression
        //means that the numbers given has to be exactly 9 characters and anymore or less will cause an error
        String regex = "^[789]\\d{9}";
        //^means it has to strictly start with 7 8 or 9 , so the first number has to start with 7 8 or 9 , else it will end up rejecting the
        //String then and there.
        //The phone numbers :-
        String text = "8387486879,8979833489";

        //Pattern and matcher objects
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        //The comma in the string will be ignored and the next number will be counted from
        while(matcher.find()){
            System.out.println(matcher.group() + "  "+matcher.start());
        }
    }
}
