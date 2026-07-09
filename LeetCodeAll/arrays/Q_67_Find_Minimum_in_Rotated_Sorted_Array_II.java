package LeetCodeAll.arrays;

import java.util.Arrays;

public class Q_67_Find_Minimum_in_Rotated_Sorted_Array_II {
    public static void main(String[] args) {
        // Test 1: no rotation
        int[] nums1 = {1, 3, 5};        System.out.println("nums = " + Arrays.toString(nums1));
        System.out.println("Minimum: " + findMin(nums1));
        // Test 2: rotated with duplicates
        System.out.println();        int[] nums2 = {2, 2, 2, 0, 1}; System.out.println("nums = " + Arrays.toString(nums2));
        System.out.println("Minimum: " + findMin(nums2));
        // Test 3: duplicates at pivot point
        System.out.println();        int[] nums3 = {3, 1, 3};        System.out.println("nums = " + Arrays.toString(nums3));
        System.out.println("Minimum: " + findMin(nums3));
    }
    public static int findMin(int[] nums){
         int left=0;int right=nums.length-1;
        while(left< right){
            int mid=left+(right-left)/2;
            if(nums[mid]<nums[right]){
                right=mid;
            }
            else if(nums[mid]>nums[right]){
                left=mid+1;
            }else{
               right--;
            }
        }
        return nums[left];
    }
}
