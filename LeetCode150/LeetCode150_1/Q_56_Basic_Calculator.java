package LeetCode150.LeetCode150_1;
import java.util.Stack;
public class Q_56_Basic_Calculator {
    public static void main(String[] args) {
        String s1 = "1 + 1";        String s2 = "(1+(4+5+2)-3)+(6+8)";
        System.out.println("Input  : " + s1);
        System.out.println("Output : " + calculate(s1));

        System.out.println("\nInput  : " + s2);
        System.out.println("Output : " + calculate(s2));
    }
    public static int calculate(String s){
        Stack<Integer> stack=new Stack<>();
        int result=0; int sign=1; int num=0;
    
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);

            if(Character.isDigit(c)){
                num=num * 10 + (c -'0');
            }
            else if(c == '+'){
                result=result + (sign *num);
                num=0; sign=1;
            }
            else if(c == '-'){
                result=result + (sign *num);
                num=0; sign=-1;
            }

            else if( c == '('){
                stack.push(result);
                stack.push(sign);
                result=0;
                sign=1;
            }
            else if( c == ')'){
                result =result +(sign * num);
                num=0;
                int savedSign=stack.pop();
                int savedResult=stack.pop();
                result=savedResult +(savedSign *result);
            }
        }
        if(num !=0){
            result=result +(sign *num);
        }
        return result;
    }
}
