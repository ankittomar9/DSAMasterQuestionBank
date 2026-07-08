package LeetCodeAll.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q_39_Subsets {
    public static void main(String[] args) {
          int[] nums1 = {1, 2, 3};
        System.out.println("nums = " + Arrays.toString(nums1));
        List<List<Integer>> result1 = subsets(nums1);
        System.out.println("All subsets (" + result1.size() + " total):");
        for (List<Integer> subset : result1) System.out.println(subset);

         // Test 3
        System.out.println();
        int[] nums3 = {1, 2, 3, 4};
        System.out.println("nums = " + Arrays.toString(nums3));
        List<List<Integer>> result3 = subsets(nums3);
            for (List<Integer> subset : result3) System.out.println(subset);
        System.out.println("Total subsets: " + result3.size()); // 2⁴ = 16
    }
    public static List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> result=new ArrayList<>();
        backtrack(nums,0,new ArrayList<>(),result);
        return result;
    }
    public static void backtrack(int[] nums,int start,
        List<Integer> current,List<List<Integer>>result){
        result.add(new ArrayList<>(current));
        for(int i=start;i<nums.length;i++){
            current.add(nums[i]);
            backtrack(nums, i+1, current, result);
            current.remove(current.size()-1);
        }
    }
}
