package LeetCodeAll.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q_18_Combination_Sum_II {
    public static void main(String[] args) {
         int[] candidates1 = {10, 1, 2, 7, 6, 1, 5};
        int target1 = 8;
        System.out.println("candidates = " + Arrays.toString(candidates1) + ", target = " + target1);
        System.out.println("Output: " + combinationSum2(candidates1, target1));

    }
    public static List<List<Integer>> combinationSum2(int[] candidates,int target){
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }
    public static void backtrack(int[] candidates,int remaining,int start,List<Integer> current,
        List<List<Integer>> result){
            if(remaining==0){
                result.add(new ArrayList<>(current));
                return;
            }
            for(int i=start;i<candidates.length;i++){
                if(candidates[i]>remaining) break;

                if(i>start && candidates[i]== candidates[i-1]) continue;
                current.add(candidates[i]);
                backtrack(candidates, remaining-candidates[i], i+1, current, result);

                current.remove(current.size()-1);
            }

        }
}
