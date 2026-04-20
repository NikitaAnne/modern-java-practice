import java.util.Scanner;

public class ComparisonCheckBoolean {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = scanner.nextInt();
        boolean isGreaterThanTen = input>10;//checks if a number is greater than 10
        System.out.println("Is the number greater than 10? "+ isGreaterThanTen);
        scanner.close();
    }
}
