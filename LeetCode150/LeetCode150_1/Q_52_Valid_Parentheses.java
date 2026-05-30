package LeetCode150.LeetCode150_1;

import java.util.Stack;

public class Q_52_Valid_Parentheses {
    public static void main(String[] args) {
         String s1 = "()[]{}";
        String s2 = "(]";

        System.out.println("Input  : " + s1);
        System.out.println("Output : " + isValid(s1));

        System.out.println("\nInput  : " + s2);
        System.out.println("Output : " + isValid(s2));
    }
    public static boolean isValid(String s){
        if(s==null || s.length() %2!=0){            return false;        }

        Stack<Character> stack=new Stack<>();

        char[] charArr=s.toCharArray();

        for(int i=0;i<s.length();i++){
            if(charArr[i]=='(' || charArr[i]=='{' || charArr[i]=='[' ){
                stack.push(charArr[i]);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
            char top=stack.pop();
            if((charArr[i]==')' && top!='(')||
                charArr[i]=='}' && top!='{' ||
                charArr[i]==']' && top!='['){
                    return false;
                }    
            }
        }
        return stack.isEmpty();

    }
}
