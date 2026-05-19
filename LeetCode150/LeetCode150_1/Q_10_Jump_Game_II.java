package LeetCode150.LeetCode150_1;

import java.util.Arrays;

public class Q_10_Jump_Game_II {
    public static void main(String[] args) {
       int[] nums1={2,3,1,1,4}; 
        System.out.println("Original Array: " + Arrays.toString(nums1));
        int  minJumps = canJump2(nums1);
         System.out.println("Minimum Jumps: " + minJumps);

         int[] nums2={2,3,0,1,4}; 
        System.out.println("Original Array: " + Arrays.toString(nums2));
        int  minJumps2 = canJump2(nums2);
         System.out.println("Minimum Jumps: " + minJumps2);
    }
    public static int canJump2(int[] nums){
        if(nums==null || nums.length<=1){            return 0;        }
        int n=nums.length;
        int jumps=0;
        int currentEnd=0;int farthest=0;
        for(int i=0;i<n-1;i++){
            farthest=Math.max(farthest, i+nums[i]);

            if(i==currentEnd){
                jumps++;
                    currentEnd=farthest;
            }
            if(currentEnd>=n-1){
                break;
            }
        }
        return jumps;
    }
}
