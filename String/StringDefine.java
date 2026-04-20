/**
 * StringDefine class demonstrates how to count the occurrences of a specific character in a string.
 * This program counts how many times the letter 'i' appears in the given string.
 */
public class StringDefine {
    public static void main(String[] args) {
        // Define the input string to be analyzed
        String str = "i am a good girl";

        // Use Java Stream API to count occurrences of letter 'i' in the string
        // Convert string to stream of characters, filter for 'i', and count matches
        // This is a functional programming approach that is more concise and readable
        long count = str.chars()
                        // Create a stream of character codes from the string
                        .mapToObj(c -> (char) c)
                        // Filter the stream to include only the character 'i'
                        .filter(c -> c == 'i')
                        // Count the number of matching characters
                        .count();

        // Display the result showing how many times letter 'i' appears in the string
        System.out.println("The letter 'i' appears " + count + " times in the string: \"" + str + "\"");
    }
}
