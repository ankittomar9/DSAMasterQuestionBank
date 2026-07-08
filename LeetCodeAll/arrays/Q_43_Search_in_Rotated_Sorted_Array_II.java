package LeetCodeAll.arrays;

import java.util.Arrays;

public class Q_43_Search_in_Rotated_Sorted_Array_II {
    public static void main(String[] args) {
         int[] nums1 = {2, 5, 6, 0, 0, 1, 2};
        System.out.println("nums = " + Arrays.toString(nums1));
        System.out.println("target = 0 → " + search(nums1, 0));
        System.out.println("target = 3 → " + search(nums1, 3));
         System.out.println();
        int[] nums2 = {1, 0, 1, 1, 1};
        System.out.println("nums = " + Arrays.toString(nums2));
        System.out.println("target = 0 → " + search(nums2, 0));
    }
     public static boolean search(int[] nums,int target){
        if(nums==null || nums.length==0){return false;}
        int left=0;int right=nums.length-1;

        while(left<=right){
            int mid=left+(right-left)/2;

            if(nums[mid]==target){return true;}

            if(nums[left]== nums[mid] && nums[mid]==nums[right]){
                left++;right--;
            }else if(nums[left]<=nums[mid]){
                if(target>=nums[left] && target <nums[mid]){
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }
            else{
                 if(target>nums[mid] && target <=nums[right]){
                    left=mid+1;
                }else{
                    right=mid-1;
                }
            }
        }
        return false;
     }
}
