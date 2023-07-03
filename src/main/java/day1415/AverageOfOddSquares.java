import java.util.Arrays;

public class AverageOfOddSquares {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};

        double average = Arrays.stream(numbers)
                .filter(num -> num % 2 != 0)
                .mapToDouble(num -> Math.pow(num, 2))
                .average()
                .orElse(0);

        System.out.println("Average of squares of odd numbers: " + average);
    }
}
