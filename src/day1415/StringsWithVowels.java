import java.util.Arrays;

public class StringsWithVowels {
    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "cat", "dog"};

        Arrays.stream(strings)
                .filter(str -> str.matches(".*[aeiouAEIOU].*"))
                .forEach(str -> System.out.println(str + " - " + str.replaceAll("[^aeiouAEIOU]", "").length()));
    }
}
