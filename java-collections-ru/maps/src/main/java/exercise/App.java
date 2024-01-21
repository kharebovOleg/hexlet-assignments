package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// BEGIN
public class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        Map<String, Integer> wordCount = new HashMap<>();
        if (sentence.isEmpty()) return wordCount;
        String[] sentenceWords = sentence.split(" ");
        for (String word : sentenceWords) {
            if (wordCount.containsKey(word)) {
                Integer count = wordCount.get(word) + 1;
                wordCount.put(word, count);
            } else {
                wordCount.put(word, 1);
            }
        }
        return wordCount;
    }

    public static String toString(Map<String, Integer> map) {
        String start = "{";
        String finish = "}";
        StringBuilder medium = new StringBuilder();
        Set<String> actualValues = map.keySet();
        if (!actualValues.isEmpty()) {
            start = start + "\n";
        } else return "{}";
        for (String word : actualValues) {
            medium.append("  ").append(word).append(": ").append(map.get(word)).append("\n");
        }
        return start + medium + finish;
    }
}
//END
