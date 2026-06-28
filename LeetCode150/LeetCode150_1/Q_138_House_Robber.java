package LeetCode150.LeetCode150_1;

import java.util.Arrays;

public class Q_138_House_Robber {
    public static void main(String[] args) {
         int[] nums1 = {1, 2, 3, 1};
        System.out.println("Input: " + Arrays.toString(nums1));
        System.out.println("Maximum Robbed: " + rob(nums1));

        int[] nums2 = {2, 7, 9, 3, 1};
        System.out.println("\nInput: " + Arrays.toString(nums2));
        System.out.println("Maximum Robbed: " + rob(nums2));
    }
    public static int rob(int[] nums){
        int n=nums.length; 
        if(n==1) return nums[0];

        int prev2=nums[0];
        int prev1=Math.max(nums[0], nums[1]);

        for(int i=2;i<n;i++){
            int current = Math.max(prev1, prev2+nums[i]);
            prev2=prev1;
            prev1=current;
        }
        return prev1;
    }
}
