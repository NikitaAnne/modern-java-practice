public class ArrayException {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};

        try {
            System.out.println("Attempting to access index 4...");

            int invalidElement = numbers[4];


            System.out.println("Value: " + invalidElement);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: You tried to access an index that doesn't exist!");
            System.out.println("Exception message: " + e.getMessage());

        } finally {
            System.out.println("Cleanup: Array access attempt completed.");
        }

        System.out.println("Program continues running...");
    }
    }

