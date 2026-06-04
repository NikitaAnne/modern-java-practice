import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateUsers {
    public static void main(String[] args) {
        List<String> userIds = Arrays.asList("user101", "user202", "user106", "user103", "user103", "user205");

        Set<String> idSet = new HashSet<>();

        List<String> uniqueIds = userIds.stream()
                .filter(Ids -> !idSet.add(Ids))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Duplicate IDs with upper case: " + uniqueIds);

    }
}
