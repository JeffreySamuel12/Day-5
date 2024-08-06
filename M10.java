import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class M10 {
    public static int[] findIntersection(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> intersection = new ArrayList<>();

        
        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

       
        for (int num : arr2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                intersection.add(num);
                map.put(num, map.get(num) - 1);
            }
        }

        
        int[] result = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) {
            result[i] = intersection.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5};
        int[] arr2 = {2, 4,8,9};

        int[] result = findIntersection(arr1, arr2);

        System.out.print("Intersection: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
