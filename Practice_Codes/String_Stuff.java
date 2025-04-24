package Practice_Codes;

import java.util.stream.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class String_Stuff {
    public static void main(String[] args) {
        String str[] = {"Hi" , "Hello" , "Hello" , "Banana" , "Coffee"};
        List<String> strings = Arrays.asList(str);
        List<String> new_string = strings.stream().distinct().toList();
        System.out.println(new_string);
        String arr[] = new String[new_string.size()];
        arr = new_string.toArray(arr);

        
        
    }
}
