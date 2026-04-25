import java.io.FileWriter;
import java.io.IOException;

public class WriteTofFile {
    public static void main(String[] args) {
        try {

            FileWriter writer = new FileWriter("filename.txt");
            writer.write("Operation JAVA !!!");
            writer.close();
            System.out.println("Successfully wrote to the file");
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
