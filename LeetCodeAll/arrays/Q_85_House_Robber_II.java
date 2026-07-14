package LeetCodeAll.arrays;

import java.util.Arrays;

public class Q_85_House_Robber_II {
    public static void main(String[] args) {
          // Test 1
        int[] nums1 = {2, 3, 2};
        System.out.println("nums = " + Arrays.toString(nums1));
        System.out.println("Max Robbery: " + rob(nums1));

        // Test 2
        System.out.println();
        int[] nums2 = {1, 2, 3, 1};
        System.out.println("nums = " + Arrays.toString(nums2));
        System.out.println("Max Robbery: " + rob(nums2));

        // Test 3
        System.out.println();
        int[] nums3 = {1, 2, 3};
        System.out.println("nums = " + Arrays.toString(nums3));
        System.out.println("Max Robbery: " + rob(nums3));
    }
    
}
