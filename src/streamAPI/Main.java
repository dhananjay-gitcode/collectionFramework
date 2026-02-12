package streamAPI;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 3, 4, 5, 5, 6);

        Set<Integer> items = new HashSet<>();
        List<Integer> duplicates = list.stream()
                .filter(n -> !items.add(n))
                .collect(Collectors.toList());

        System.out.println(duplicates); // Output: [3, 5]
    }
}
