import java.util.Arrays;

public class SortStrings {
    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "cat", "dog"};

        Arrays.stream(strings)
                .sorted((str1, str2) -> {
                    if (str1.length() == str2.length()) {
                        return Character.compare(str2.charAt(str2.length() - 1), str1.charAt(str1.length() - 1));
                    } else {
                        return Integer.compare(str1.length(), str2.length());
                    }
                })
                .forEach(System.out::println);
    }
}
