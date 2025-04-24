package File_Handling;

//Importing the File class for handling files 
import java.io.File;
import java.io.IOException;

//IOException is required as creatig new file gives a checked exception, and in order to handle that , 
//we have to mention that it throws IOException. 

public class Handling_Files {
    public static void main(String[] args) throws IOException{
        //This is an ubuntu linux based location for the desktop , place specific
        //locations inside the path. 

        //This Folder file_handling_java is not present and this would create a new folder

        String path = "/home/raider/Desktop/file_handling_java";
        String rename_Path = "/home/raider/Desktop/Renamed";
        File file = new File(path);

        //This creates a single folder 
        //file.mkdir();
        
        //Creating a new File :- 
        //Creates a new file named Demo.txt
        String file_path = rename_Path + "/Demo.txt";
        File new_File = new File(file_path);
        new_File.createNewFile();

        //This creates multiple folders
        //file.mkdirs();

        //for multiple folders just simply make the nested folders inside the file path with , it would create the multiple nested folders. 

        //Renaming the file :- 
        //Only one folder at a time can be renamed 
        File renamed = new File(rename_Path);

        //This function renamed the file according to the new pathname 
        file.renameTo(renamed);
        
        //To get the FilePath :- 
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getParentFile());
        System.out.println(file.getName());

        //To delete the file/folder that is created :- 
        file.delete();


        //To fetch the names of the files inside the folder :- 
        String file_names[] = file.list();

        for(String i : file_names) System.out.println(i);
    }
}
