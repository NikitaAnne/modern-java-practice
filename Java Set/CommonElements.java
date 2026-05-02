import java.util.*;

public class CommonElements {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6);
        //convert list to set
        Set<Integer> commonSet = new HashSet<>(list1);
        commonSet.retainAll(list2);//retainAll acts like a filter: "Keep only what is also in list2"
        List<Integer> result = new ArrayList<>(commonSet);//convert back to list
        System.out.println("Common list: " + result);
    }
}
