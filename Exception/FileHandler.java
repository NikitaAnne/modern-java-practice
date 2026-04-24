import java.io.FileReader;
import java.io.IOException;

public class FileHandler {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("nikita.txt");
            System.out.println("File opened...");
        } catch (IOException e) {
            System.out.println("Could not find file");
        } finally {
            try {
                if (reader != null) {
                    System.out.println("File closed");
                    reader.close();
}
            }catch(IOException e){
                System.out.println("Error while closing file!");
            }
        }
    }
}
