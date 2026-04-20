package ifandelse;

import java.util.Scanner;

public class CheckIfPositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = scanner.nextInt();

        if (input > 0) {
            System.out.println(input + " is Positive");
        } else {
            System.out.println(input + " is negative");
        }
    }
}
