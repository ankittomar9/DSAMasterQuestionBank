package LeetCode150.LeetCode150_1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q_139_Word_Break {
    public static void main(String[] args) {
         String s1 = "leetcode";
        List<String> wordDict1 = Arrays.asList("leet", "code");
        
        System.out.println("Input: s = \"" + s1 + "\", wordDict = " + wordDict1);
        System.out.println("Can Break: " + wordBreak(s1, wordDict1));

        String s2 = "catsandog";
        List<String> wordDict2 = Arrays.asList("cats", "dog", "sand", "and", "cat");
        System.out.println("\nInput: s = \"" + s2 + "\", wordDict = " + wordDict2);
        System.out.println("Can Break: " + wordBreak(s2, wordDict2));
    }
    public static boolean wordBreak(String s,List<String> wordDict){
        Set<String> wordSet=new HashSet<>(wordDict);
        int n=s.length();

        boolean[] dp=new boolean[n+1];
        dp[0]=true;

        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                boolean condition=wordSet.contains(s.substring(j,i));
                if(dp[j] && condition){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[n];
    }
}
