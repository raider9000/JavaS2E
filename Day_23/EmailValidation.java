package Day_23;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
    public static void main(String[] args) {
        //This is to check the format of a email
        //The first part of the checking expression , [a-zA-Z0-9._%+-] checks for the email id before of the @
        //The first ^ acts as a starts with symbol
        //The next part with the + means that it can be repeated , the + acts as an operator to show that the previous content can reoccur
        //The next part checks for the mailID that is after the @ , such as gmail.com , etc.
        //The \\. signifies the . to be checked
        String reg = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        String email = "rohit.jay+@gmail-.com";

        Pattern patter = Pattern.compile(reg);
        Matcher match = patter.matcher(email);

        //To print out the email if it is matching with the format
        if(match.find()){
            System.out.println(match.group() + "  " + match.start());
        }else{
            System.out.println("Match not found");
        }
    }
}
