import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class VotingSystem {
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is less than 18. Not eligible to vote.");
        } else
            System.out.println("Eligible to vote");
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age ");
        int input = scanner.nextInt();
        try {
            VotingSystem.checkAge(input);
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught! " + e.getMessage());
        } finally {
            scanner.close();
            ;
        }


    }
}
