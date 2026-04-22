package Array;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] numbers = {3,5,9,6};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : numbers) {
            //If current number is greater than largest
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            }
            // If current number is between largest and second largest
            else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element (all elements might be the same).");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }
    }

}
