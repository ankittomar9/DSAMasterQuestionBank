package LeetCode150.LeetCode150_1;

import java.util.Arrays;

public class Q_129_Single_Number_II {
    public static void main(String[] args) {
          int[] nums1 = {2, 2, 3, 2};
        System.out.println("Input: " + Arrays.toString(nums1));
        System.out.println("Single Number: " + singleNumber(nums1));

          int[] nums2 = {4, 1, 2, 1, 2};
        System.out.println("\nInput: " + Arrays.toString(nums2));
        System.out.println("Single Number: " + singleNumber(nums2));
    }
    public static int singleNumber(int[] nums){
        int ones=0;int twos=0;  
    
        for(int i=0;i<nums.length;i++){
             ones=(ones^nums[i]) & ~twos;
             twos=(twos^nums[i]) & ~ones;
        }
        return ones;
    }
}
