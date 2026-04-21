package loops;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a 3-digit number: ");
        int input = scanner.nextInt();

        int sum = 0;
        while (input > 0) {
            int digit = input % 10;//gets last digit of the number
            sum += digit;
            input = input / 10;
        }
        System.out.println("Sum of digits= " + sum);
        scanner.close();
    }

}
