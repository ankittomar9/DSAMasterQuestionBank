package LeetCode150.LeetCode150_1;

import java.util.HashSet;
import java.util.Set;

public class Q_31_Longest_Substring_Without_Repeating_Characters {
   public static void main(String[] args) {
        String s1 = "abcabcbb";
               System.out.println("Input  : " + s1);
        System.out.println("Output : " + lengthOfLongestSubstring(s1));

         String s2 = "bbbbb";
        System.out.println("\nInput  : " + s2);
        System.out.println("Output : " + lengthOfLongestSubstring(s2));
   } 
   public static int lengthOfLongestSubstring(String s){
    if(s==null || s.isEmpty()){return 0;}
    
        int left=0; int maxLen=0;
        Set<Character>set=new HashSet<>();

        for(int right=0;right<s.length();right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            int newLength=right-left+1;
            maxLen=Math.max(maxLen,newLength);
        }
        return maxLen;

   }
}
