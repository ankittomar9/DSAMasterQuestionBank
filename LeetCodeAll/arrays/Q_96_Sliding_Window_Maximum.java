package LeetCodeAll.arrays;

import java.util.Arrays;

public class Q_96_Sliding_Window_Maximum {
    public static void main(String[] args) {
         // Test 1
        int[] nums1 = {1, 3, -1, -3, 5, 3, 6, 7};
        System.out.println("nums = " + Arrays.toString(nums1) + ", k=3");
        System.out.println("Result: " + Arrays.toString(maxSlidingWindow(nums1, 3)));

         // Test 4: descending array
        System.out.println();
        int[] nums4 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("nums = " + Arrays.toString(nums4) + ", k=3");
        System.out.println("Result: " + Arrays.toString(maxSlidingWindow(nums4, 3)));

        // Test 5: ascending array
        System.out.println();
        int[] nums5 = {1, 2, 3, 4, 5};
        System.out.println("nums = " + Arrays.toString(nums5) + ", k=3");
        System.out.println("Result: " + Arrays.toString(maxSlidingWindow(nums5, 3)));
    }
}
