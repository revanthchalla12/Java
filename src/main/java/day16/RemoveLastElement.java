package day16;

import java.util.ArrayList;
import java.util.List;

public class RemoveLastElement {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        strings.add("!");

        if (!strings.isEmpty()) {
            strings.remove(strings.size() - 1);
        }

        System.out.println(strings);
    }
}
