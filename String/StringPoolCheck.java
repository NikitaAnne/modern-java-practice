public class StringPoolCheck {
    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = "Java";


        String s3 = new String("Java");

        // Moving the Heap string into the String Pool (or getting the pool reference)
        String s4 = s3.intern();

        System.out.println("Checking references using ==\n");

        // 1. Literal vs Literal
        System.out.println("s1 == s2: " + (s1 == s2));


        // 2. Literal vs Heap Object
        System.out.println("s1 == s3: " + (s1 == s3));


        // 3. Literal vs Interned String
        System.out.println("s1 == s4: " + (s1 == s4));

    }
}
