package Sets;
import java.util.HashSet;
import java.util.Iterator;

public class IterateSets {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // Add strings to the HashSet
        for(int i=0;i<10;i++){
            set.add(new String("string"+i));
        }

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        set.forEach(element -> System.out.println(element));

        set.stream().forEach(element -> System.out.println(element));
    }
}