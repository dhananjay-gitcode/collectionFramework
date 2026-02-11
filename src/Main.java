import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> name = Arrays.asList("Java","C++","PHP","C#");

        name.forEach(System.out::println);
    }
}