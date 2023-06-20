package day16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListTraversal {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        strings.add("!");


        System.out.println("Using for loop:");
        for (int i = 0; i < strings.size(); i++) {
            String element = strings.get(i);
            System.out.println(element);
        }

        // Using enhanced for loop
        System.out.println("\nUsing enhanced for loop:");
        for (String element : strings) {
            System.out.println(element);
        }

        // Using iterator
        System.out.println("\nUsing iterator:");
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        // Using forEach
        System.out.println("\nUsing forEach:");
        strings.forEach(System.out::println);

        // Using parallel Stream
        System.out.println("\nUsing parallel Stream:");
        strings.parallelStream().forEach(System.out::println);
    }
}
