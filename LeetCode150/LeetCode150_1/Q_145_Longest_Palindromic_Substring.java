package LeetCode150.LeetCode150_1;

public class Q_145_Longest_Palindromic_Substring {
    public static void main(String[] args) {
        System.out.println("input String : babad \n"+longestPalindrome("babad")); // "bab" or "aba"
        System.out.println("input String : cbbd \n"+longestPalindrome("cbbd"));  // "bb"
    }
    public static String longestPalindrome(String s){
        if(s==null ||s.length()<2){ return s;}

        int start=0,maxLen=1;

        for(int i=0;i<s.length();i++){
            int len1=expandAroundCenter(s,i,i);
            int len2=expandAroundCenter(s,i,i+1);

            int len=Math.max(len1,len2);

            if(len>maxLen){
                maxLen=len;
                start=i-(len-1)/2;
            }
        }
        return s.substring(start,start+maxLen);
    }
    private static int expandAroundCenter(String s,int left,int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
}
