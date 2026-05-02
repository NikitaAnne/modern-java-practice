import java.util.*;

public class DuplicateRemover {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 3, 4, 5, 6, 6));
        System.out.println("Original list: " + numbers);

        //Remove duplicates using a Set
        Set<Integer> set = new LinkedHashSet<>(numbers); //linked-hashset maintains order
        List<Integer> uniqueNumbers = new ArrayList<>(set);
        System.out.println("Unique list: " + uniqueNumbers);
    }
}
