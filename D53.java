import java.util.LinkedHashSet;
import java.util.List;
import java.util.ArrayList;

public class D53 {
    public static void main(String[] args) {
        List<Integer> inputList = new A);rrayList<>();
        inputList.add(4);
        inputList.add(5);
        inputList.add(6);
        inputList.add(4);
        inputList.add(7);
        inputList.add(8);
        inputList.add(5);

        // Find the first non-duplicate element in the list
        Integer firstNonDuplicate = findFirstNonDuplicate(inputList);

        // Print the result
        if (firstNonDuplicate != null) {
            System.out.println("First non-duplicate element: " + firstNonDuplicate);
        } else {
            System.out.println("No non-duplicate element found.");
        }
    }

    // Method to find the first non-duplicate element in a list
    public static Integer findFirstNonDuplicate(List<Integer> list) {
        // LinkedHashSet to store unique elements while maintaining insertion order
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        // LinkedHashSet to store duplicate elements
        LinkedHashSet<Integer> duplicates = new LinkedHashSet<>();

        // Iterate through the list
        for (Integer num : list) {
            // Try to add the element to the set
            if (!set.add(num)) {
                // If the element is already in the set, add it to duplicates
                duplicates.add(num);
            }
        }

        // Iterate through the set of unique elements
        for (Integer num : set) {
            // Return the first element that is not in duplicates
            if (!duplicates.contains(num)) {
                return num;
            }
        }

        // Return null if no non-duplicate element is found
        return null;
    }
}
