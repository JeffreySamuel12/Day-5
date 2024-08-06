import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Set;

public class D56 {
    public static void main(String[] args) {
        // Create sets using different implementations
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        // Add elements to setA
        setA.add(1);
        setA.add(2);
        setA.add(3);

        // Add elements to setB
        setB.add(1);
        setB.add(2);
        setB.add(3);
        setB.add(4);

        // Check if setA is a subset of setB
        System.out.println("HashSet: Is setA a subset of setB? " + isSubset(setA, setB));

        // Test with LinkedHashSet
        setA = new LinkedHashSet<>(setA);
        setB = new LinkedHashSet<>(setB);
        System.out.println("LinkedHashSet: Is setA a subset of setB? " + isSubset(setA, setB));

        // Test with TreeSet
        setA = new TreeSet<>(setA);
        setB = new TreeSet<>(setB);
        System.out.println("TreeSet: Is setA a subset of setB? " + isSubset(setA, setB));
    }

    // Method to check if one set is a subset of another
   //T is generic(placeholder) allows mwthod to worl with any ytpe of Set
   public static <T> boolean isSubset(Set<T> setA, Set<T> setB) {
        return setB.containsAll(setA);
    }
}
