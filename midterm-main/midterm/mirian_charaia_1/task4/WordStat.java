package midterm.mirian_charaia_1.task4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WordStat {
    public static void main(String[] args) {
        List<String> fantasyFormatData = DreamGenerator.fantasy;

        // Set to store unique words
        Set<String> uniqueWords = new HashSet<>();
        // Map to store word lengths and their counts
        Map<Integer, Integer> wordLengthCounts = new HashMap<>();

        for (String line : fantasyFormatData) {
            // Split the line into words
            String[] words = line.split(" ");
            for (String word : words) {
                // Remove punctuation and convert to lowercase
                word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
                // Add word to the set of unique words
                uniqueWords.add(word);
                // Update word length counts
                int length = word.length();
                wordLengthCounts.put(length, wordLengthCounts.getOrDefault(length, 0) + 1);
            }
        }

        // Print unique words
        System.out.println("Unique words:");
        System.out.println(uniqueWords);

        // Print word length counts
        System.out.println("\nWord length counts:");
        for (Map.Entry<Integer, Integer> entry : wordLengthCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Write results to task4.txt
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("task4.txt", true))) {
            writer.newLine();
            writer.newLine();
            writer.write("Unique words:\n" + uniqueWords + "\n");
            writer.write("Word length counts:\n" + wordLengthCounts + "\n");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
