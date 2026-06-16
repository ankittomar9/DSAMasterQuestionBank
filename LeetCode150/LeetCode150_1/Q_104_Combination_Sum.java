package LeetCode150.LeetCode150_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q_104_Combination_Sum {
    public static void main(String[] args) {
          int[] candidates = {2, 3, 6, 7};
        int target = 7;
        System.out.println("Input: candidates = " + Arrays.toString(candidates) + ", target = " + target);
        System.out.println("Combinations: " + combinationSum(candidates, target));
    }
    public static List<List<Integer>> combinationSum(int[] candidates,int target){
        List<List<Integer>> result=new ArrayList<>();
        backtrack(result, new ArrayList<>(), 0, target, candidates);
        return result;
    }
    public static void backtrack(List<List<Integer>> result,
                            List<Integer> current,int start,int remain,int[] candidates){
                                if(remain ==0){
                                    result.add(new ArrayList<>(current));
                                    return;
                                }

        if(remain <0){  return ;}
        
        for(int i=start;i<candidates.length;i++){
            current.add(candidates[i]);
            backtrack(result, current, i, remain-candidates[i], candidates);
            current.remove(current.size()-1);
        }
    }

}
