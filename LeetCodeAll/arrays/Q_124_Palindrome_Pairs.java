package LeetCodeAll.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q_124_Palindrome_Pairs {
    public static void main(String[] args) {
         String[] words1 = {"abcd", "dcba", "lls", "s", "sssll"};
        System.out.println("Result: " + palindromePairs(words1));

        String[] words2 = {"bat", "tab", "cat"};
        System.out.println("Result: " + palindromePairs(words2));

        String[] words3 = {"a", ""};
        System.out.println("Result: " + palindromePairs(words3));

        String[] words4 = {"a", "b", "c", "ab", ""};
        System.out.println("Result: " + palindromePairs(words4));

        String[] words5 = {"abcdc", "ba"};
        System.out.println("Result: " + palindromePairs(words5));
    }
    public static List<List<Integer>> palindromePairs(String[] words){
        List<List<Integer>> result =new ArrayList<>();
        Map<String ,Integer> map=new HashMap<>();
        for(int i=0;i<words.length;i++){map.put(words[i], i);}

        for(int i=0;i<words.length;i++){
            String word=words[i];
            int len=word.length();

         for(int j=0;j<=len;j++){
         if(isPalindrome(word,j,len-1)){
        String revPrefix=new StringBuilder(word.substring(0,j)).reverse().toString();
        Integer k=map.get(revPrefix);
        if(k !=null && k!=i){
            result.add(Arrays.asList(i,k));
        }
     }
         if(j>0 && isPalindrome(word,0,j-1)){
        String revSuffix=new StringBuilder(word.substring(j)).reverse().toString();
        Integer k=map.get(revSuffix);
        if(k !=null && k!=i){
            result.add(Arrays.asList(k,i));
        }
     } 
    }
 }
    return result;
    }
    private static boolean isPalindrome(String s,int lo ,int hi){
        while(lo<hi){
            if(s.charAt(lo++) != s.charAt(hi--)) return false;
        }
        return true;
    }

}
