package LeetCodeAll.arrays;

import java.util.Arrays;

public class Q_77_Largest_Number {
    public static void main(String[] args) {
        int[] nums1 = {10, 2};
        System.out.println("nums = " + Arrays.toString(nums1));
        System.out.println("Largest Number: " + largestNumber(nums1));

        // Test 2
        System.out.println();
        int[] nums2 = {3, 30, 34, 5, 9};
        System.out.println("nums = " + Arrays.toString(nums2));
        System.out.println("Largest Number: " + largestNumber(nums2));

        // Test 3: all zeros
        System.out.println();
        int[] nums3 = {0, 0};
        System.out.println("nums = " + Arrays.toString(nums3));
        System.out.println("Largest Number: " + largestNumber(nums3));
    }
}
