public class StringComparison {
    public static void main(String[] args) {
        String str1 = "Hello";


        String str2 = new String("Hello");

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // Comparing using ==
        // Checks if both variables point to the same memory address.
        boolean referenceResult = (str1 == str2);
        System.out.println("Result of str1 == str2: " + referenceResult);

        // Comparing using .equals() (Value Comparison)
        // Checks if the actual sequence of characters is identical.
        boolean valueResult = str1.equals(str2);
        System.out.println("Result of str1.equals(str2): " + valueResult);
    }

    }
