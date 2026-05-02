import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 1, 1, 2, 2};
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : numbers) {
            if (freqMap.containsKey(num)) {
                freqMap.put(num, freqMap.get(num) + 1);
            } else freqMap.put(num, 1);
        }
        System.out.println("Element frequencies: ");
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + "-->" + entry.getValue());
        }
    }
}
