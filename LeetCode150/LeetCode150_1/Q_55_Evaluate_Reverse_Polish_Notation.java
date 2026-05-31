package LeetCode150.LeetCode150_1;
import java.util.Arrays;
import java.util.Stack;
public class Q_55_Evaluate_Reverse_Polish_Notation {
    public static void main(String[] args) {
         String[] tokens1 = {"2","1","+","3","*"};
        String[] tokens2 = {"4","13","5","/","+"};

        System.out.println("Input  : " +Arrays.toString(tokens1));
        System.out.println("Output : " + evalRPN(tokens1));

        System.out.println("\nInput  : "+Arrays.toString(tokens2));
        System.out.println("Output : " + evalRPN(tokens2));
    }
    public static int evalRPN(String[] tokens){
        Stack<Integer> stack=new Stack<>();
        
        for(int i=0;i<tokens.length;i++){
             String token = tokens[i];
            if(token.equals("+") || token.equals("-")
                || token.equals("*") || token.equals("/")){
                    int b=stack.pop();
                    int a=stack.pop();
                
                switch(token){
                    case "+": stack.push(a+b);break;
                    case "-": stack.push(a-b);break;
                    case "*": stack.push(a*b);break;
                    case "/": stack.push(a/b);break;
                }
            }
            else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}

