package ifandelse;

import java.util.Scanner;

public class CheckPosAndEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println(num + " is positive number and even");
            } else if (num % 2 != 0) {
                System.out.println(num + " is postive number and odd");
            } else {
                System.out.println(num + " is not a positive number");
            }

        }
    }
}
