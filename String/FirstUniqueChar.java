public class FirstUniqueChar {
    public static void main(String[] args) {
        String str = "leetcode";
        char result = firstUniqChar(str);
        System.out.println(result);
        if (result != '\0') {
            System.out.println("The first non-repeating character is: '" + result + "'");
        } else {
            System.out.println("All characters repeat or the string is empty.");
        }
    }

    public static char firstUniqChar(String str) {
        int charCount[] = new int[256];
        //count occurrence of each character
        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }
        //find first character with count =1
        for (int i = 0; i < str.length(); i++) {
            if (charCount[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }
        return '\0';
    }

}
