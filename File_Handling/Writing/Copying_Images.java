package File_Handling.Writing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//As not finding files is a checked exception , it either has to be handled or 
//Thrown explicitly by the executing method , so IOException is required to be 
//thrown by the main method below 
public class Copying_Images {
    public static void main(String[] args) throws IOException {
        //To create the jpg file 
        String File_Path = "/home/raider/Desktop/Renamed/image.jpg";
        File file = new File(File_Path);
        file.createNewFile();

        //Now writing the Destination path :- 
        String dest_Path = "/home/raider/Desktop/Renamed/image.jpg";
        File destination = new File(dest_Path);


        //Now writing the Source File :- 
        String source_path = "The file location where the image will be copied from ";
        File source = new File(source_path);

        //Uses File input and output Stream inorder to copy from and write to 

        //Reading data from the source file/image
        FileInputStream fis = new FileInputStream(source);
        byte arr[] = new byte[(int)source.length()];
        fis.read(arr);

        //Writing the copying code :- 
        FileOutputStream fos = new FileOutputStream(destination);
        fos.write(arr);


        //Closing the input an output Streams  , as they are intensive resources 
        fos.close();
        fis.close();

    }
}
