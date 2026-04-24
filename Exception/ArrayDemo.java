import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] nums = new int[5];
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter 5 integers ");
            for (int i = 0; i < nums.length; i++) {
                System.out.print("Element " + i + ": ");
                nums[i] = scanner.nextInt();
            }
            System.out.print("Enter an index to display (0-4): ");
            int index = scanner.nextInt();//accessing an index
            System.out.println("Value at index " + index + " is: " + nums[index]);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter integers only");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: That index doesn't exist! Choose a number between 0 and 4.");
        } finally {
            System.out.println("Program execution completed.");
        }
    }
}
