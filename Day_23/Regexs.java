package Day_23;
//For the use of Regular expressions in java , we need the pattern class to be imported 
import java.util.regex.Pattern;
import java.util.regex.Matcher;
//This class deals with regular expressions in Strings

//[Note :] Regular expressions are basically kind of expressions that are technically search patterns 
//It is used to find specific patterns inside Strings or Sub-Strings 
public class Regexs {
    public static void main(String[] args) {
         //Basically the '.' allows the regex over the String and compare each of the element in the String
        //the matcher.find() returns true only when a character exists in the String and returns false when the
        //String ends and skips any newline characters as it is not supported by the '.' operator in regex


        String str = "Hello World\nGood morning"; //This is the initial String
        String regex = "."; //here "." will match any character
        //Some of the other regular expressions :-
        //String regex = "[^abc]"; //This fetches any character besides a,b,c.
        //String regex = "[abc]"; //This fetches only characters a,b,c.
        //String regex = "[a-z]"; //This matches any character between a to z (no numbers , \n , etc are not supported and will not be matched and skipped)
        //String regex = "[a-z\\d]"; //This matches any character between a to z as well as any number , \\d means any number will also be matched.
        //String regex = "\\w"; //This matches any words and skip whitespaces , using \\s as well will add the white spaces as well
        //String regex = "^[0-9]"; //matches everything besides 0 to 9
        //Read others from the documentation sir sent . ^_^

        Pattern pattern = Pattern.compile(regex); //This is the pattern object that takes the String regex as an
        //Argument.

        //This is the matcher object that takes the initial String as an argument
        Matcher matcher = pattern.matcher(str);

        //Using the While loop in order to find the
        while(matcher.find()){
            System.out.print(matcher.group());
        }

        

        
    }
}
