package File_Handling.Writing;
//not completed
import java.io.File;
import java.io.FileWriter;

public class Using_BufferedReader {
    public static void main(String[] args) {
        String path = "File path";
        File file = new File(path);

        String message = "Hello , this will be added ";

        FileWriter fwr = new FileWriter(file, true);
    }
}   
