package LeetCodeAll.arrays;

import java.util.Arrays;

public class Q_99_Single_Number_III {
    public static void main(String[] args) {
         // Test 1
        int[] nums1 = {1, 2, 1, 3, 2, 5};
        System.out.println("nums = " + Arrays.toString(nums1));
        System.out.println("Result: " + Arrays.toString(singleNumber(nums1)));

        // Test 2: negative numbers
        System.out.println();
        int[] nums2 = {-1, 0};
        System.out.println("nums = " + Arrays.toString(nums2));
        System.out.println("Result: " + Arrays.toString(singleNumber(nums2)));
              System.out.println();
        int[] nums4 = {1, 1, 2, 2, 3, 4, 4, 5};
        System.out.println("nums = " + Arrays.toString(nums4));
        System.out.println("Result: " + Arrays.toString(singleNumber(nums4)));

    }
    

}
