import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DupeElements {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 5, 8, 3, 8, 5, 13, 6);
        Set<Integer> trackElements = new HashSet<>();
        List<Integer> duplicates = list.stream()
                .filter(num -> !trackElements.add(num))
                .collect(Collectors.toList());
        System.out.println("Duplicate elements: " + duplicates);
    }

}
