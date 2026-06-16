package LeetCode150.LeetCode150_1;

import java.util.ArrayList;
import java.util.List;

public class Q_102_Combinations {
        public static void main(String[] args){
            System.out.println("Combining the two numbers : \n"+combine(4,2));
            System.out.println("Combining the two numbers : \n"+combine(1,1));
    }
    public static List<List<Integer>> combine(int n,int k){
        List<List<Integer>> result=new ArrayList<>();
        backtrack(result, new ArrayList<>(), 1, n, k);
        return result;
    }
    private static void backtrack(List<List<Integer>> result,List<Integer> current,
        int start,int n,int k){

            if(current.size()==k){
                result.add(new ArrayList<>(current));
                return;
            }
            for(int i=start;i<=n;i++){
                current.add(i);
                backtrack(result, current, i+1, n, k);
                current.remove(current.size()-1);
            }
        }

}
