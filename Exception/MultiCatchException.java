import java.util.Scanner;

public class MultiCatchException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {10, 20, 30};
      try{
          //perform division
          System.out.print("Enter a number to divide 100 by: ");
          int divisor = scanner.nextInt();
          int result = 100 / divisor;
          System.out.println("Result of division: " + result);

          //Access index
          System.out.print("Enter an array index to access (0-2): ");
          int index = scanner.nextInt();
          System.out.println("Value at index " + index + ": " + numbers[index]);
      } catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
          System.out.println("An error occurred: " +e.getMessage());
      }
      finally {
          scanner.close();;
      }
    }
}
