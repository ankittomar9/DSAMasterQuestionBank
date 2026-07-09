package LeetCodeAll.arrays;

import java.util.Arrays;

public class Q_65_Maximum_Product_Subarray {
    public static void main(String[] args) {
         // Test 1
        int[] nums1 = {2, 3, -2, 4};
        System.out.println("nums = " + Arrays.toString(nums1));
        System.out.println("Max Product: " + maxProduct(nums1));

        // Test 2: zero in array
        System.out.println();
        int[] nums2 = {-2, 0, -1};
        System.out.println("nums = " + Arrays.toString(nums2));
        System.out.println("Max Product: " + maxProduct(nums2));

        // Test 3: two negatives flip min→max
        System.out.println();
        int[] nums3 = {-2, 3, -4};
        System.out.println("nums = " + Arrays.toString(nums3));
        System.out.println("Max Product: " + maxProduct(nums3));
    }
}
