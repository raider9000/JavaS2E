package File_Handling.Csv_Handling;
import java.io.*;

public class DeserializeEmployee {
    public static void main(String[] args) throws Exception{
        String path = "C:\\Users\\hp\\OneDrive\\Desktop\\FileHandling\\Test\\Capgemini\\serialize.txt";
        File file = new File(path);

        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        Employee employee = (Employee)ois.readObject();
        System.out.println(employee);

    }
}
