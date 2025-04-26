package File_Handling.Csv_Handling;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeEmployee {
    public static void main(String[] args) throws Exception{
        String path = "C:\\Users\\hp\\OneDrive\\Desktop\\FileHandling\\Test\\Capgemini\\serialize.txt";
        File file = new File(path);

        file.createNewFile();
        Employee employee = new Employee("Honey", 1, 30000);

        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(employee);
        oos.flush();

        oos.close();
        fos.close();
    }
}
