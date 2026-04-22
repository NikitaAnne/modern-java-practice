import java.util.Arrays;

public class StringReverse {
    public static void main(String[] args) {
        String str = "nikita";
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            // Swap characters
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        System.out.println("Swapped word: " + new String(charArray));
    }
}
