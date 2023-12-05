import java.util.*;

public class WordCounter {

    public static void main(String[] args) {
        String sentence = "The sun shines over the lake, as the sun sets behind the hills.";

        Map<String, Integer> wordCount = countWords(sentence);

        displayWordCount(wordCount);
    }
// Counts occurrences of words in a sentence
    public static Map<String, Integer> countWords(String sentence) {
        // Splits sentences into words and converting to lowercase
        String[] words = sentence.toLowerCase().split("[\\s,.]+"); // Split sentence into words
// Stores words in alphabetical order with their counts using treemap
        Map<String, Integer> wordCount = new TreeMap<>(); // Using TreeMap for sorting keys alphabetically

        //Loop through each word in the array
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1); // Count occurrences of each word
        }

        return wordCount; //
    }

    public static void displayWordCount(Map<String, Integer> wordCount) {
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            //Prints each word and its count
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
