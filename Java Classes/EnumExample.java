import java.util.Scanner;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY
}

public class EnumExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day number (1-3): ");
        int input = scanner.nextInt();
        if (input > 1 && input < Day.values().length - 1) { // .values() returns array
            Day selectedDay = Day.values()[input - 1]; //day at specific index
            System.out.println("Selected day is: " + selectedDay);
        } else {
            System.out.println("Invalid input! Please enter a value between 1 -3");
        }
        scanner.close();

    }
}
