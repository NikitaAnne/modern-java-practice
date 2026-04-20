package typecasting;

public class Demo {
    public static void main(String[] args) {
        int i = 10;
        double b = i; // Automatic casting - converting smaller to larger type

        double d = 2.5;
        int n = (int) d; //narrowing or manual casting- converting a larger type
        // to a smaller type
        System.out.println("Manual casting result: " + b);
        System.out.println("Automatic casting result: " + n);
    }
}
