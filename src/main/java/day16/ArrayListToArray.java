package day16;
import java.util.ArrayList;
import java.util.List;

public class ArrayListToArray {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("!");

        String[] array = arrayList.toArray(new String[0]);

        // Print the elements of the array
        for (String element : array) {
            System.out.println(element);
        }
    }
}

