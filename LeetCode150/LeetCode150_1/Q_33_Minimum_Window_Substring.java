package LeetCode150.LeetCode150_1;

public class Q_33_Minimum_Window_Substring {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";System.out.println("Input s : " + s);
        String t = "ABC"; System.out.println("Input t : " + t);
        System.out.println("Output  : " + minWindow(s, t));
    }
    public static String minWindow(String s,String t){
        if(s==null || t==null || s.length()<t.length()){return "";}

        int[] count=new int[128]; //build freq hashmap for t
        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            count[c]++;
        }
        int left=0; int minLen=Integer.MAX_VALUE; int minStart=0; int required=t.length();

        for(int right=0; right<s.length();right++){
            char r=s.charAt(right);

            if(count[r]>0){
                required--;
            }
            count[r]--;

            while(required ==0 ){
                int windowLen=right-left+1;
                if(windowLen<minLen){
                    minLen=windowLen;
                    minStart=left;
                }

                char l=s.charAt(left);
                count[l]++;
                if(count[l]>0){
                    required++;
                }
                left++;
            }
        }
        if (minLen==Integer.MAX_VALUE) {
            return "";
        } else {
            return s.substring(minStart, minStart + minLen);
        }

    }
}
