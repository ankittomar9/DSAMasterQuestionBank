package LeetCode150.LeetCode150_1;

import java.util.ArrayList;
import java.util.List;

public class Q_101_Letter_Combinations_of_a_Phone_Number {
    public static void main(String[] args) {
         System.out.println(letterCombinations("23"));
        System.out.println(letterCombinations(""));
        System.out.println(letterCombinations("2"));
    }
     public static List<String> letterCombinations(String digits) {
        List<String> result=new ArrayList<>();
        if(digits==null || digits.isEmpty()){
            return result;        }
            
        String[] mapping={
             "", "", "abc", "def", "ghi", "jkl",
            "mno", "pqrs", "tuv", "wxyz"
        };

        backtrack(digits,0,new StringBuilder(),result,mapping);
        return result;
     }
     public static void backtrack(String digits,int index,StringBuilder current,
        List<String> result,String[] mapping){
            if(index==digits.length()){
                result.add(current.toString());
                return;
            }
        String letters =mapping[digits.charAt(index)-'0'];
        for(char c : letters.toCharArray()){
            current.append(c);
            backtrack(digits, index+1, current, result, mapping);
            current.deleteCharAt(current.length()-1);
                }       
        }
}
