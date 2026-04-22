import java.util.HashMap;
import java.util.Map;

public class NumberFrequency {
    public static void main(String[] args) {
        Integer[] nums = {1, 2, 1, 2, 3, 4, 5};
        Map<Integer, Integer> freqNum = new HashMap<>();
        for (int n : nums) {
            if (freqNum.containsKey(n)) {
                freqNum.put(n, freqNum.get(n) + 1);

            } else {
                freqNum.put(n, 1);
            }

        }
        for (Map.Entry<Integer, Integer> entry : freqNum.entrySet()) {
            System.out.println("Number - " + entry.getKey() + ": " + entry.getValue());
        }
    }
}
