package LeetCode150.LeetCode150_1;

import java.util.Arrays;

public class Q_20_Longest_Common_Prefix {
    public static void main(String[] args) {
        String[] strs1 = {"flower", "flow", "flight"};
        String[] strs2 = {"dog", "racecar", "car"};

        System.out.println("Input  \n: " +Arrays.toString(strs1));
        System.out.println("Output \n: " + longestCommonPrefix(strs1));

        System.out.println("\nInput  : " +Arrays.toString(strs2));
        System.out.println("Output : \n"  + longestCommonPrefix(strs2) );
    }

    public static String longestCommonPrefix(String[] strs){
        if(strs==null || strs.length==0){return "";}

        String prefix=strs[0];

        for(int i=1;i<strs.length;i++){
            
            while(strs[i].indexOf(prefix)!=0){
                if(prefix.isEmpty()){
                    return "";
                 }
                  prefix=prefix.substring(0,prefix.length()-1);
            }
           
        }
        return prefix;
    }
}
