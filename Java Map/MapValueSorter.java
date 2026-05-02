import java.util.*;

public class MapValueSorter {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 3);
        map.put("B", 2);
        map.put("C", 1);
        // Convert Map entries to a List since HM doesn't maintain order
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort(Map.Entry.comparingByValue());

        // Put sorted entries into a LinkedHashMap to preserve order
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        System.out.println("Sorted Map: " + sortedMap);
    }
}
