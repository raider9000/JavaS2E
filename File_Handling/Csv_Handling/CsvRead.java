package File_Handling.Csv_Handling;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CsvRead {
    public static void main(String[] args) {
        String path = "C:\\Users\\hp\\OneDrive\\Desktop\\FileHandling\\Test\\Capgemini\\StudentData.csv";
        File file = new File(path);

        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
            String line;
            boolean isHeader = true;

            while ((line = reader.readLine()) != null){
                if (isHeader){
                    isHeader = false; // skip header
                    continue;
                }
                String[] values = line.split(",");
                int id = Integer.parseInt(values[0]);
                String name = values[1];
                int age = Integer.parseInt(values[2].trim());

                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
