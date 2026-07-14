package LeetCodeAll.arrays;

import java.util.Arrays;

public class Q_94_Majority_Element_II {
    public static void main(String[] args) {
       int[] nums1 = {3, 2, 3};
        System.out.println("nums = " + Arrays.toString(nums1));
        System.out.println("Majority Elements: " + majorityElement(nums1));

        // Test 2: single element
        System.out.println();
        int[] nums2 = {1};
        System.out.println("nums = " + Arrays.toString(nums2));
        System.out.println("Majority Elements: " + majorityElement(nums2));

        // Test 3: two majorities
        System.out.println();
        int[] nums3 = {1, 1, 1, 3, 3, 2, 2, 2};
        System.out.println("nums = " + Arrays.toString(nums3));
        System.out.println("Majority Elements: " + majorityElement(nums3));
 
    }
}
