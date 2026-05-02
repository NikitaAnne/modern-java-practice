import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AdvancedStringSorter {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("Banana", "Apple", "Kiwi", "Mango", "Cherry", "Pear", "Fig"));
        words.sort(Comparator.comparingInt(String::length) //extracts the length of each string and compares them.
                // If two strings have the same length, Java looks at this
                // second rule to decide their order.
                // For Strings, "Natural Order" is alphabetical.

                .thenComparing(Comparator.naturalOrder()));
        System.out.println("Sorted List (Length then Alphabetical): " + words);

    }
}
