import java.util.Arrays;
import java.util.List;

public class StreamAPIExample {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9);

        System.out.println("Numbers greater than 4 (Sorted):");

        numbers.stream()
               .filter(number -> number > 4)
               .sorted()
               .forEach(System.out::println);
    }
}
