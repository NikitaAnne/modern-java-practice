package loops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int input = scanner.nextInt();
        int originalNumber = input;
        int reversed =0;
        while (input > 0) {
            int remainder = input % 10;//gets last digit of the number
            reversed = reversed*10 +remainder;
            input = input/10;
        }
        if (originalNumber == reversed) {
            System.out.println(originalNumber + " is a palindrome");
        }
        else{
            System.out.println(originalNumber + " not a palindrome");
        }

        scanner.close();
    }

}
