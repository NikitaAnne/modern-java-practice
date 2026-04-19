import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(8,9,10,11,12);
        List<Integer> output = input.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }
}
