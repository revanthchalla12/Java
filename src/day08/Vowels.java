package day08;
import java.io.*;
import java.util.*;
public class Vowels {
    static int countOfVowels(String str){
        int count=0;
        char[] c=str.toCharArray();
        for(int i=0;i<c.length;i++) {
            if ((c[i] == 'a') || (c[i] == 'e') || (c[i] == 'i') || (c[i] == 'o') || (c[i] == 'u')
                    || (c[i] == 'A') || (c[i] == 'E') || (c[i] == 'I') || (c[i] == 'O')
                    || (c[i] == 'U')) {
                count++;
            }
        }
        return count;


    }
    public static void main(String [] args){
        String str="KeshTech";
        System.out.println("The number of vowels are:"+countOfVowels(str));

    }
}
