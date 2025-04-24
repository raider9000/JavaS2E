package File_Handling.Writing;
//Using fileWriter and fileReader

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;

public class Using_FileWriter {
    public static void main(String[] args) throws IOException{
        //Excatly same syntax as File input and output stream but this specifically uses 
        //Character array input only and not byte array. 

        //Only the FileInputStreams and input streams can handle both raw bytes as well as
        //Character array too.

        String path = "path of the file";
        File file = new File(path);

        //Thiw line would give an error called unhandled exception if throws IOException not given 
        //So the main method or any method using a File class has to throw the exception 
        FileReader fir = new FileReader(file);
        int x; 
        while((x = fir.read()) != -1){
            System.out.println((char)x);
        }

        String message = "This is a message that has to be written to the file";

        //Using the fileWriter :- 
        FileWriter fwr = new FileWriter(file , true);

        for(int i = 0 ; i < message.length() ; i++) fwr.write(message.charAt(i));
        
        //Another way to get it without closing it , is to flush the data from the file buffer to the file it has to be written to
        fwr.flush();

        //Unless the file writer is closed , the data will not be written from the file buffer to the actual file 
        //So always the fileWriter has to be closed in order to get the data from the file buffer to the file to which 
        //the data has to be written to. 
        fwr.close();

       
    }
}
