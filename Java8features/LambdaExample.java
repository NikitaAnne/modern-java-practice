import java.util.Arrays;
import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(6,7,8,9,10);

        System.out.println("Printing elements using a Lambda Expression:");

        // The Lambda Expression syntax
        numbers.forEach(n -> System.out.println(n));
    }
}
