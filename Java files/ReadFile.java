import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        File obj = new File("filename.txt");
        try (Scanner reader = new Scanner(obj)) {
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
