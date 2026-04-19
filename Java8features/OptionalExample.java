import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        String name = "Nikita";
        String emptyName = null;

        // 1. Check a present value
        checkString(name);

        // 2. Check a null value
        checkString(emptyName);
    }

    public static void checkString(String input) {
        // Optional.ofNullable handles both actual values and nulls
        Optional<String> opt = Optional.ofNullable(input);

        if (opt.isPresent()) {
            System.out.println("Value present: " + opt.get());
        } else {
            System.out.println("Value is null");
        }
    }
}
