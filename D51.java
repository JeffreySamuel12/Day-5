import java.util.*;

public class D51 {
    // Method to create and return different sets from a list of integers
    public static void demonstrateSetBehavior(List<Integer> list) {
        // HashSet
        Set<Integer> hashSet = new HashSet<>(list);
        System.out.println("HashSet: " + hashSet);

        // LinkedHashSet
        Set<Integer> linkedHashSet = new LinkedHashSet<>(list);
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // TreeSet
        Set<Integer> treeSet = new TreeSet<>(list);
        System.out.println("TreeSet: " + treeSet);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 3, 5, 1, 2);
        System.out.println("Input List: " + list);

        demonstrateSetBehavior(list);
    }
}
