public class LengthOfString {
    public static void main(String[] args) {
        String str = "nikita";
        int length = str.length();
        System.out.println("Length of string using the length() function is : "+length);

        //Without using length() function

        char ch[] = str.toCharArray();
        int count=0;
        for(int i=0;i< ch.length;i++){
            count++;
        }
        System.out.println("Length of string without using the length() function is : "+ count);
    }
}
