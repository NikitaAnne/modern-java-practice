import java.util.Scanner;

enum Days {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select a day (1-7):");
        System.out.println("1: MON, 2: TUE, 3: WED, 4: THU, 5: FRI, 6: SAT, 7: SUN");

        int input = sc.nextInt();
        Days selectedDay = null;

        // Mapping number to Enum using values()
        if (input >= 1 && input <= 7) {
            selectedDay = Days.values()[input - 1];
        }

        // Using Switch Case with Enum
        if (selectedDay != null) {
            switch (selectedDay) {
                case MONDAY:
                    System.out.println("Start of the work week!");
                    break;
                case FRIDAY:
                    System.out.println("The weekend is almost here.");
                    break;
                case SATURDAY:
                case SUNDAY:
                    System.out.println("It's the weekend! Relax.");
                    break;
                default:
                    System.out.println("It's a regular weekday: " + selectedDay);
                    break;
            }
        } else {
            System.out.println("Invalid selection.");
        }

        sc.close();
    }
}