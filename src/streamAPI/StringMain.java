package streamAPI;

import java.util.*;
import java.util.stream.*;

public class StringMain {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Kiwi", "Banana", "Fig", "Mango");

        long count = fruits.stream()
                .filter(f -> f.length() > 4)
                .count();

        System.out.println("Fruits with length > 4: " + count);
    }
}