package LeetCodeAll.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Q_63_Word_Break_II {
    public static void main(String[] args) {
        String s1 = "catsanddog";
        List<String> dict1 = Arrays.asList("cat", "cats", "and", "sand", "dog");
        System.out.println("s = \"" + s1 + "\", wordDict = " + dict1);
        System.out.println("Output: " + wordBreak(s1, dict1));

        System.out.println();
        String s2 = "pineapplepenapple";
        List<String> dict2 = Arrays.asList("apple", "pen", "applepen", "pine", "pineapple");
        System.out.println("s = \"" + s2 + "\", wordDict = " + dict2);
        System.out.println("Output: " + wordBreak(s2, dict2));

        System.out.println();
        String s3 = "catsandog";
        List<String> dict3 = Arrays.asList("cats", "cat", "and", "sand", "dog");
        System.out.println("s = \"" + s3 + "\", wordDict = " + dict3);
        System.out.println("Output: " + wordBreak(s3, dict3));

        System.out.println();
        String s4 = "apple";
        List<String> dict4 = Arrays.asList("apple");
        System.out.println("s = \"" + s4 + "\", wordDict = " + dict4);
        System.out.println("Output: " + wordBreak(s4, dict4));
    }
    public static List<String> wordBreak(String s,List<String> wordDict){
        Set<String> wordSet=new HashSet<>(wordDict);
        Map<Integer,List<String>> memo=new HashMap<>();
        return dfs(s, 0, wordSet, memo);
    }
    private static List<String> dfs(String s, int start,Set<String> wordSet,
        Map<Integer,List<String>>memo){
            if(memo.containsKey(start)){ return memo.get(start);}
            List<String> res=new ArrayList<>();
            if(start==s.length()){
                res.add("");
                return res;
            }

            for(int end=start+1;end<=s.length();end++){
                String word=s.substring(start,end);
                if(wordSet.contains(word)){
                    List<String> suffixes =dfs(s, end, wordSet, memo);
                    for(String suffix : suffixes){
                        res.add(suffix.isEmpty() ? word : word + " " +suffix);
                    }
                }
            }
            memo.put(start,res);
            return res;
    }

}
