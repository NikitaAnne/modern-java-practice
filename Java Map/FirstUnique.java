import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUnique {
    public static void main(String[] args) {
        int[] numbers = {4, 5, 1, 2, 0, 4};
        // LinkedHashMap preserves the order in which elements are first added
        Map<Integer,Integer> counts = new LinkedHashMap<>();
        for(int num: numbers){
            counts.put(num, counts.getOrDefault(num,0) +1);
        }
        boolean found = false;
        for(Map.Entry<Integer,Integer> entry : counts.entrySet()){
            if(entry.getValue() == 1){
                System.out.println("First non-repeating element: " + entry.getKey());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No non-repeating elements found.");
        }
    }
}
