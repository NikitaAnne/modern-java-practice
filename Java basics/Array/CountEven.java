package Array;

import java.util.Scanner;

public class CountEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get the size of the array
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();
        //Initialize the array with that size
        int[] numbers = new int[size];
        System.out.println("Enter " + size + " integers: ");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("Number of even numbers in this array are: " + count);
    }
}
