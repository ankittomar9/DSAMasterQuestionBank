package LeetCode150.LeetCode150_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q_32_Substring_with_Concatenation_of_All_Words_1 {
    public static void main(String[] args) {
          String s = "barfoothefoobarman"; System.out.println("Input s     : " + s);
        String[] words = {"foo", "bar"};  System.out.println("Input words : " + Arrays.toString(words));
        System.out.println("Output      : " + findSubstring(s, words));
    }
public static List<Integer> findSubstring(String s, String[] words) {
    List<Integer> result = new ArrayList<>();
    if (s == null || words == null || words.length == 0) return result;

    int wordLen=words[0].length();    int totalWords=words.length;

    // Build frequency map
    Map<String, Integer> map = new HashMap<>();
    for (String word:words) {
        map.put(word, map.getOrDefault(word, 0)+1);
    }

    // Sliding window for each offset
    for (int i=0; i<wordLen; i++) {
        int left=i, right=i, count=0;
        Map<String, Integer> windowCount = new HashMap<>();

        while (right + wordLen <= s.length()) {
            String word = s.substring(right, right + wordLen);
            right += wordLen;

            if (map.containsKey(word)) {
                windowCount.put(word, windowCount.getOrDefault(word, 0) + 1);
                count++;

                // Shrink window if word freq exceeds from required
                while (windowCount.get(word) > map.get(word)) {
                    String leftWord = s.substring(left, left + wordLen);
                    windowCount.put(leftWord, windowCount.get(leftWord) - 1);
                    count--;
                    left += wordLen;
                }
                // If all words matched in
                if (count==totalWords) {
                    result.add(left);
                }
            } else {
                windowCount.clear();
                count = 0;
                left = right;
            }
        }
    }
    return result;
}
}





