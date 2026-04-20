import java.util.Scanner;

public class SquareRootExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double input = sc.nextDouble();
        if (input < 0) {
            System.out.println("Cannot calculate square root of negative number!");
        } else {
            double output = Math.sqrt(input);
            System.out.println("Output: " + output);
        }
        sc.close();
    }
}
