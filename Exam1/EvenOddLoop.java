import java.util.Scanner;

public class EvenOddLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers do you want to check? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();

            if (num % 2 == 0) {
                System.out.println(num + " is an EVEN number.");
            } else {
                System.out.println(num + " is an ODD number.");
            }
        }
        System.out.println("\nAll numbers processed. Goodbye!");
        sc.close();
    }
}
