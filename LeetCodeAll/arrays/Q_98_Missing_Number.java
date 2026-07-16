package LeetCodeAll.arrays;

import java.util.Arrays;

public class Q_98_Missing_Number {
    public static void main(String[] args) {
      // Test 1
        int[] nums1 = {3, 0, 1};        System.out.println("nums = " + Arrays.toString(nums1));
        System.out.println("Math:   " + missingNumberMath(nums1.clone()));
        System.out.println("XOR:    " + missingNumberXOR(nums1.clone()));
        // Test 2
        System.out.println();        int[] nums2 = {0, 1};
        System.out.println("nums = " + Arrays.toString(nums2));
        System.out.println("Math:   " + missingNumberMath(nums2.clone()));
        System.out.println("XOR:    " + missingNumberXOR(nums2.clone()));
        // Test 3
        System.out.println();        int[] nums3 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println("nums = " + Arrays.toString(nums3));
        System.out.println("Math:   " + missingNumberMath(nums3.clone()));
        System.out.println("XOR:    " + missingNumberXOR(nums3.clone()));
        // Test 4: missing 0
        System.out.println();        int[] nums4 = {1};        System.out.println("nums = " + Arrays.toString(nums4));
        System.out.println("Math:   " + missingNumberMath(nums4.clone()));
        System.out.println("XOR:    " + missingNumberXOR(nums4.clone()));
    }
    public static int missingNumberMath(int[] nums){
        int n=nums.length;
        int expectedSum=n*(n+1)/2;
        int actualSum=0;

        for(int i=0;i<nums.length;i++){
            actualSum=actualSum+nums[i];
        }
        return expectedSum-actualSum;
    }

    public static int missingNumberXOR(int[] nums){
        int n=nums.length;
        int result=n;
            for(int i=0;i<nums.length;i++){
          result=result^i;
          result=result^nums[i];
        }
        return result;
    }

}
