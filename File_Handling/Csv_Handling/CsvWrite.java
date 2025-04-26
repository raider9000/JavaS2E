package File_Handling.Csv_Handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CsvWrite {
    public static void main(String[] args) throws Exception {
        String path = "C:\\Users\\hp\\OneDrive\\Desktop\\FileHandling\\Test\\Capgemini\\StudentData.csv";
        File file = new File(path);
        file.createNewFile();

        try(FileWriter writer = new FileWriter(file)){
            writer.append("id, name, age\n");
            writer.append("1, Rohit, 25\n");
            writer.append("2, Honey, 23\n");
            writer.append("1, Subho, 22\n");

            System.out.println("CSV file written successfully");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
