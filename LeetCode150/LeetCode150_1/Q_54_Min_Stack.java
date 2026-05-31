package LeetCode150.LeetCode150_1;
import java.util.Stack;
public class Q_54_Min_Stack {
    public static void main(String[] args) {
         MinStack minStack = new MinStack();
        minStack.push(-2);    minStack.push(0); minStack.push(-3);
        System.out.println("getMin() → " + minStack.getMin());  // -3

        minStack.pop();
        System.out.println("top()    → " + minStack.top());     // 0
        System.out.println("getMin() → " + minStack.getMin());  // -2
    }
    public static class MinStack{
        private final Stack<Integer> stack;
        private final Stack<Integer> minStack;

        public MinStack(){
            stack=new Stack<>();
            minStack=new Stack<>();
        }
        public void push(int x){
            stack.push(x);

            if(minStack.isEmpty() || x<=minStack.peek()){
                minStack.push(x);
            }else{
                minStack.push(minStack.peek());
            }
        }
        public void pop(){
            stack.pop();
            minStack.pop();
        }
        public int top(){
            return stack.peek();
        }
        public int getMin(){
            return minStack.peek();
        } 
    }
}
