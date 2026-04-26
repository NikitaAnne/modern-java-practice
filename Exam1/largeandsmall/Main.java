package largeandsmall;

import java.util.Scanner;

class ArrayFinder {
    int largest;
    int smallest;

    public ArrayFinder(int[] arr) {
        largest = arr[0];
        smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
    }

    void display() {
        System.out.println("Largest Element: " + largest);
        System.out.println("Smallest Element: " + smallest);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] userArray = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            userArray[i] = sc.nextInt();
        }
        // Create object: The constructor will handle the calculation
        ArrayFinder finder = new ArrayFinder(userArray);
        finder.display();
        sc.close();
    }
}
