package LeetCodeAll.arrays;

import java.util.Arrays;

public class Q_17_First_Missing_Positive {
    public static void main(String[] args) {
          int[] nums1 = {1, 2, 0};        System.out.println("nums = " + Arrays.toString(nums1));
        System.out.println("First Missing Positive: " + firstMissingPositive(nums1));
        // Test 2
        System.out.println();        int[] nums2 = {3, 4, -1, 1};    System.out.println("nums = " + Arrays.toString(nums2));
        System.out.println("First Missing Positive: " + firstMissingPositive(nums2));
    }
    public static int firstMissingPositive(int[] nums){
        if(nums==null || nums.length==0){return 1;}
        int n=nums.length;

        for(int i=0;i<n;i++){
            while(nums[i]>=1 && nums[i]<=n && nums[nums[i]-1] !=nums[i]){

                int home=nums[i]-1;
                int temp=nums[home];
                nums[home]=nums[i];
                nums[i]=temp;
            }
        }

        for(int i=0;i<n;i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }
        return n+1;
    }
}
