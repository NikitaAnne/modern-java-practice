import java.io.IOException;

public class ExceptionDelegation {
    public static void findFile(String fileName) throws IOException {
        if (fileName.equals("database.txt")) {
            throw new IOException("Access Denied: File is locked by another process.");
        } else {
            System.out.println("Searching for " + fileName);
        }
    }
    public static void main(String[] args) {
        try {
            System.out.println("Calling the method..");

            findFile("database.txt");

            System.out.println("File found successfully!");

        }
        catch (IOException e) {
            // Handling the checked exception passed up from the method
            System.out.println("Caught in main: " + e.getMessage());
        }

        System.out.println("Program continues safely.");
        }


}
