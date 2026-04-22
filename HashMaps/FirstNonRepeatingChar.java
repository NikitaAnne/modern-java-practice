import java.util.HashMap;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "aabbcde";

        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        for (char ch : str.toCharArray()) {
            if (map.get(ch) == 1) {
                System.out.println("The first non repeating character is: " + ch);
                break;
            }
        }
    }
}
