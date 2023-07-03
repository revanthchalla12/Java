package day08;

public class WordReverser {
    public static String reverseWords(String sentence) {
        String[] words = sentence.split("\\s+");
        StringBuilder reversedSentence = new StringBuilder();
        for (String word : words) {
            reversedSentence.append(reverseWord(word)).append(" ");
        }
        return reversedSentence.toString().trim();
    }
    private static String reverseWord(String word) {
        StringBuilder reversedWord = new StringBuilder(word);
        return reversedWord.reverse().toString();
    }

    public static void main(String[] args) {
        String sentence = "Java J2EE Reverse Me";
        String reversedSentence = reverseWords(sentence);
        System.out.println("Reversed sentence: " + reversedSentence);
    }
}
