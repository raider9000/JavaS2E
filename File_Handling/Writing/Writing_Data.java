package File_Handling.Writing;

import java.io.IOException;
import java.io.File;
import java.io.FileOutputStream;

public class Writing_Data {
    public static void main(String[] args) throws IOException{
        String path = "/home/raider/Desktop/Renamed/Demo.txt";

        File file = new File(path);

        //Making the file output stream
        FileOutputStream fos = new FileOutputStream(file , true);
        //File output Stream is required to read and write the bytes 

        String message = "Welcome to this file today";

        //As FileOutputStream only deals with Byte Streams and because of that 
        //we need to convert to a ByteArray in order to write and read from the 
        //file. 
        byte arr[] = message.getBytes();
        fos.write(arr);

        //Another way to do it using Strings :- 

        //Taking each of the characters from a string and then adding to the file 
        //each character taken o
        for(int i = 0 ; i <message.length() ; i++){
            fos.write(message.charAt(i));
        }
    }
}
