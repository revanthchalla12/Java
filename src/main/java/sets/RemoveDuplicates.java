package Sets;

import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str="repeating";
        HashSet<Character> hs=new HashSet<>();
        for (char c: str.toCharArray()) {
            hs.add(c);
        }
        System.out.println(hs);
    }
}