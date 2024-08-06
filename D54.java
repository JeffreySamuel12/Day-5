import java.util.TreeSet;
import java.util.List;
import java.util.ArrayList;

public class D54 {
    public static void main(String[] args) {
        List<Integer> inputList = new ArrayList<>();
        inputList.add(7);
        inputList.add(2);
        inputList.add(9);
        inputList.add(1);
        inputList.add(2);
        inputList.add(9);

        // Get the sorted unique elements
        TreeSet<Integer> sortedSet = getSortedUniqueElements(inputList);

        // Print the result
        System.out.println(sortedSet);
    }

    // Method to get unique elements sorted in ascending order
    public static TreeSet<Integer> getSortedUniqueElements(List<Integer> list) {
        return new TreeSet<>(list);
    }
}
