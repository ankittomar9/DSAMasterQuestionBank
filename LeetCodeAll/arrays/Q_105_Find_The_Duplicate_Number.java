package LeetCodeAll.arrays;

import java.util.Arrays;

public class Q_105_Find_The_Duplicate_Number {
    public static void main(String[] args) {
           int[] nums1 = {1, 3, 4, 2, 2};
        System.out.println("nums = " + Arrays.toString(nums1) + "\n → Duplicate: " + findDuplicate(nums1));

        int[] nums2 = {3, 1, 3, 4, 2};
        System.out.println("nums = " + Arrays.toString(nums2) + "\n → Duplicate: " + findDuplicate(nums2));

        int[] nums3 = {3, 3, 3, 3, 3};
        System.out.println("nums = " + Arrays.toString(nums3) + "\n → Duplicate: " + findDuplicate(nums3));

        int[] nums4 = {2, 5, 9, 6, 9, 3, 8, 9, 7, 1};
        System.out.println("nums = " + Arrays.toString(nums4) + "\n → Duplicate: " + findDuplicate(nums4));
    }

        public static int findDuplicate(int[] nums){
            int slow=nums[0];
            int fast=nums[0];

            do{
                slow =nums[slow];
                fast=nums[nums[fast]];
            }
            while(slow !=fast);
        
            slow=nums[0];
            
            while(slow !=fast){
                slow=nums[slow];
                fast=nums[fast];
            }
            return slow;
        }
}
