package LeetCode150.LeetCode150_1;

import java.util.Arrays;

public class Q_118_Find_First_and_Last_Position {
    public static void main(String[] args) {
         int[] nums = {5, 7, 7, 8, 8, 10};
        System.out.println("Input: " + Arrays.toString(nums) + ", target = 8");
        System.out.println("Output: " + Arrays.toString(searchRange(nums, 8)));

        System.out.println("\nInput: " + Arrays.toString(nums) + ", target = 6");
        System.out.println("Output: " + Arrays.toString(searchRange(nums, 6)));
    }
    public static int[] searchRange(int[] nums,int target){
        int[] result={-1,-1};

        int left=0;int right=nums.length-1;

        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                result[0]=mid;
                right=mid-1;
            }else if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }

          left=0; right=nums.length-1;

        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                result[1]=mid;
                left=mid+1;
            }else if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return result;
    }
}
