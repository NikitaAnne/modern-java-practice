public class Recursion {

    public static int find(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + find(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(find(3));
    }
}
