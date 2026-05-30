package LeetCode150.LeetCode150_1;
import java.util.Stack;
public class Q_53_Simplify_Path {
    public static void main(String[] args) {
        String p1 = "/home/";        String p2 = "/../";        String p3 = "/home//foo/";
        System.out.println("Input  : " + p1);System.out.println("Output : " + simplifyPath(p1));
        System.out.println("\nInput  : " + p2);System.out.println("Output : " + simplifyPath(p2));
        System.out.println("\nInput  : " + p3);System.out.println("Output : " + simplifyPath(p3));
    }
    public static String simplifyPath(String path){
        Stack<String>  stack=new  Stack<>();
        String[] parts=path.split("/");

        for(int i=0;i<parts.length;i++){
            String part=parts[i];
        
            if(part.isEmpty() || part.equals(".")){ continue;}
            if(part.equals("..")){
            if(!stack.isEmpty()){
                stack.pop();
            }
        }
        else{
            stack.push(part);
        }
     }
        if(stack.isEmpty()){
            return "/";
        }
        StringBuilder result=new StringBuilder();
        for(int i=0;i<stack.size();i++){
            result.append("/").append(stack.get(i));
        }    
        return result.toString();
    }
}


