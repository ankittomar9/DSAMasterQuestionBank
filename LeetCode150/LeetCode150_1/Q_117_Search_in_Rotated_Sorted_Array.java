package LeetCode150.LeetCode150_1;

import java.util.Arrays;

public class Q_117_Search_in_Rotated_Sorted_Array {
    public static void main(String[] args) {
             int[] nums = {4, 5, 6, 7, 0, 1, 2};
             System.out.println("Original Array :"+Arrays.toString(nums));
        System.out.println("result : "+search(nums, 0)); // 4
             System.out.println("\nOriginal Array :"+Arrays.toString(nums));
        System.out.println("result : "+search(nums, 3)); // -1
    }
    public static int search(int[] nums,int target){
        int left=0;int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }

            if(nums[left]<=nums[mid]){
                if(target>=nums[left] && target<nums[mid]){
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }else{
                if(target>nums[mid] && target<=nums[right]){
                    left=mid+1;
                }else{
                    right=mid-1;
                } 
            }
        }
        return -1;
    }
}
