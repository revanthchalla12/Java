import java.util.Arrays;
import java.util.stream.Collectors;

public class StringCapitalization {
    public static void main(String[] args) {
        String[] strings = { "banana", "cat", "dog","apple"};

        Arrays.stream(strings)
                .map(str -> Character.toUpperCase(str.charAt(0)) + str.substring(1))
                .sorted()
                .forEach(System.out::println);
    }
}
