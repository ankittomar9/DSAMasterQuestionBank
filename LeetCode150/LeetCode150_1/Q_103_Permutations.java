package LeetCode150.LeetCode150_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q_103_Permutations {
    public static void main(String[] args) {
            int[] nums={1,2,3};
             System.out.println("Input: " + Arrays.toString(nums));
        System.out.println("Permutations:");        System.out.println(permute(nums));
    }
    public static List<List<Integer>> permute(int[] nums){
        List<List<Integer>> result=new ArrayList<>();
        backtrack(nums,0, result);
        return result;
    }
    public static void backtrack(int[] nums,int start,List<List<Integer>> result){
        if(start==nums.length){
            List<Integer> current =new ArrayList<>();
            for(int num:nums) 
                current.add(num);
            result.add(current);
            return;
        }
        for(int i=start;i<nums.length;i++){
            int temp=nums[start];
            nums[start]=nums[i];
            nums[i]=temp;

            backtrack(nums, start+1, result);

            temp=nums[start];
            nums[start]=nums[i];
            nums[i]=temp;
        }

    }
}
