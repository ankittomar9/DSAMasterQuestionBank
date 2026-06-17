package LeetCode150.LeetCode150_1;

import java.util.ArrayList;
import java.util.List;

public class Q_106_Generate_Parentheses {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));  
    }
    public static List<String> generateParenthesis(int n){
        List<String> result=new ArrayList<>();
        backtrack(result,new StringBuilder(),0,0,n);
        return result;
    }
    public static void backtrack(List<String> result,StringBuilder current,
        int open,int close,int max){
            if(current.length()==max*2){
                result.add(current.toString());
                return;
            }

            if(open < max){
                current.append('(');
                backtrack(result, current, open+1, close, max);
                current.deleteCharAt(current.length()-1);
            }

            if(close<open){
                current.append(')');
                backtrack(result, current, open, close+1, max);
                current.deleteCharAt(current.length()-1);
            }
        }
}
