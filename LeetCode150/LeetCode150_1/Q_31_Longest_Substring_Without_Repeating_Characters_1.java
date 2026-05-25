package LeetCode150.LeetCode150_1;

import java.util.Arrays;

public class Q_31_Longest_Substring_Without_Repeating_Characters_1 {
    public static void main(String[] args) {
         String s1 = "abcabcbb";
               System.out.println("Input  : " + s1);
        System.out.println("Output : " + lengthOfLongestSubstring(s1));

         String s2 = "bbbbb";
        System.out.println("\nInput  : " + s2);
        System.out.println("Output : " + lengthOfLongestSubstring(s2));
    }

    public static int lengthOfLongestSubstring(String s){
        if(s==null || s.isEmpty()){
            return 0;
        }

        int[] charArr=new int[128];
        Arrays.fill(charArr, -1);

        int left=0;int maxLen=0;
        for(int right=0;right<s.length();right++){
            char c=s.charAt(right);
            if(charArr[c]!=-1){
                left=Math.max(left, charArr[c]+1);
            }
            charArr[c]=right;
            int newLength=right-left+1;
            maxLen=Math.max(maxLen, newLength);
        }
        return maxLen;
    }

}
