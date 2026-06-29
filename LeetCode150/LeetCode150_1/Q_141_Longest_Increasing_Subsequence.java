package LeetCode150.LeetCode150_1;

import java.util.Arrays;

public class Q_141_Longest_Increasing_Subsequence {
    public static void main(String[] args) {
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println("Input: " + Arrays.toString(nums));
        System.out.println("Length of LIS: " + lengthOfLIS(nums));
    }

    public static int lengthOfLIS(int[] nums){
        if(nums==null || nums.length==0){ return 0;}

        int[] tails=new int[nums.length];
        int size=0;

        for(int i=0;i<nums.length;i++){
            int position=Arrays.binarySearch(tails,0,size,nums[i]);

            if(position<0){
                position=-(position+1);
            }
            tails[position]=nums[i];

            if(position==size){
                size++;
            }
        }
        return size;
    }
}
