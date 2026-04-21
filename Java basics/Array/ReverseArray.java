package Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        System.out.println("Original array: " + Arrays.toString(numbers));
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;
            left++;
            right--;
        }
        System.out.println("Reversed array: " + Arrays.toString(numbers));

        //Using reverse function
        //first convert array to a list
        Integer[] nums = {5, 6, 7, 8};
        System.out.println("Original array: " + Arrays.toString(nums));
        List<Integer> listNum = Arrays.asList(nums);
        Collections.reverse(listNum);
        System.out.println("Reversed array: " + Arrays.toString(nums));
    }


}
