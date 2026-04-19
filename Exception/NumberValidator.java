import java.util.Scanner;

public class NumberValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a whole number: ");
        String userInput = scanner.nextLine();
        try{
        int number = Integer.parseInt(userInput);
            System.out.println("Success! You entered the number: " + number);
        }
        catch(NumberFormatException e){
            System.out.println("Error: '" + userInput + "' is not a valid integer.");
            System.out.println("Please run the program again and enter digits only.");
        }
        finally {
            scanner.close();
            System.out.println("Scanner closed.");
        }

    }
}
