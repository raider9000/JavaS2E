package Day_23;
//This class deals with password validation using regex
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class PasswordValidation {
    public static void main(String[] args) {
        String password1 = "Strong@123";
        String password2 = "weakpassword";

        System.out.println("Passowrd1 valid ? : " + isValidPassword(password1));
        System.out.println("Password2 valid ? : " + isValidPassword(password2));
    }
    public static boolean isValidPassword(String password){
        //This is the regex statement for the condition for checking the password strength
        //basically every block that starts with ?= , means that it should contain at least zero or more of that type
        //so ?=.*[0-9] means that it should contain at least one number , and the same for the other blocks
        //the .* ignores the newline character during reading the String
        //the \\S signifies to exclude the spaces and \\s will include the spaces
        //Ending it with $ in the end , makes the rule that is defined in the regex , to be mandatory in that way only
        //the {8,20} means that the minimum length has to be 8 and maximum to be 20
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,20}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
