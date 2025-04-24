package File_Handling.Reading_Files;

import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;

public class ReadingFiles {
    public static void main(String[] args) throws IOException{
        String path = "/home/raider/Desktop/Renamed/Demo.txt";
        File file = new File(path);
        FileInputStream fis = new FileInputStream(file);
        
        //When end of file is reached , it returns -1 , so using a while lop in order to print the
        //Characters , so if -1 is returned then the while loop is stopped. 
        //.read() method reads the data character by character , it reads in form of int
        //and that is being stored in x , then that x is converted back to character using
        //explicit conversion from int to char. 
        int x; 
        while((x=fis.read()) != -1){
            System.out.print((char)x);
        }
    }
}
