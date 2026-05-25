package LeetCode150.LeetCode150_1;

import java.util.Arrays;

public class Q_30_Minimum_Size_Subarray_Sum {
    public static void main(String[] args) {
     int[] nums1 = {2,3,1,2,4,3};        int target1 = 7;
        System.out.println("Input  : " + Arrays.toString(nums1));
        System.out.println("Target : " + target1);
        System.out.println("Output : " + minSubArrayLen(target1, nums1));

        int[] nums2 = {1,4,4};        int target2 = 4;
        System.out.println("\nInput  : " + Arrays.toString(nums2));
        System.out.println("Target : " + target2);
        System.out.println("Output : " + minSubArrayLen(target2, nums2));

    }

    public static int minSubArrayLen(int target,int[] nums){
        if(nums==null || nums.length==0){ return 0;}
        int left=0;
        int sum=0; 
        int minLen=Integer.MAX_VALUE;

        for(int right=0;right<nums.length;right++){
            sum=sum+nums[right];

            while(sum>=target && left<=right){
                int newLength=right-left+1;
                minLen=Math.min(minLen, newLength);
                sum=sum-nums[left];
                left++;
            }
        }
        if(minLen>Integer.MAX_VALUE){
            return 0;
        }else{ return minLen;} 
      //  return minLen==Integer.MAX_VALUE ? 0: minLen;
    }
}
