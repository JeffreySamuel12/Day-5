import java.util.LinkedHashSet;
import java.util.List;
import java.util.ArrayList;

public class D52 {
    public static void main(String[] args) {
        List<String> inputList = new ArrayList<>();
        inputList.add("apple");
        inputList.add("banana");
        inputList.add("apple");
        inputList.add("orange");

        LinkedHashSet<String> resultSet = removeDuplicates(inputList);

        System.out.println(resultSet);
    }

    public static LinkedHashSet<String> removeDuplicates(List<String> list) {
        return new LinkedHashSet<>(list);
    }
}
