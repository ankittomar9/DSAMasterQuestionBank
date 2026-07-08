package LeetCodeAll.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q_22_Permutations_II {
    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};        System.out.println("nums = " + Arrays.toString(nums1));
        System.out.println("Output: " + permuteUnique(nums1));
        // Test 2
        System.out.println();        int[] nums2 = {1, 2, 3};    
           System.out.println("nums = " + Arrays.toString(nums2));
        System.out.println("Output: " + permuteUnique(nums2));
    }
    public static List<List<Integer>> permuteUnique(int[] nums){
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        boolean[] used=new boolean[nums.length];
         backtrack(nums, used, new ArrayList<>(), result);
          return result;
    }
    public static void backtrack(int[] nums,boolean[] used,List<Integer> current,
        List<List<Integer>>result){
        if(current.size() ==nums.length){
            result.add(new ArrayList<>(current)); return;
        }   
        for(int i=0;i<nums.length;i++){
            if(used[i]) continue;

            if(i> 0 && nums[i]==nums[i-1] && !used[i-1]) continue;
            used[i]=true;
            current.add(nums[i]);
            backtrack(nums, used, current, result);
        
            used[i]=false;
            current.remove(current.size()-1);
        }
 
    }

}
