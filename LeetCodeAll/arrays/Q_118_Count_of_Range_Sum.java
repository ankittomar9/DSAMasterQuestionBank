package LeetCodeAll.arrays;

import java.util.Arrays;

public class Q_118_Count_of_Range_Sum {
    public static void main(String[] args) {
          int[] nums1 = {-2, 5, -1};
        System.out.println("nums = " + Arrays.toString(nums1) + ", lower=-2, upper=2");
        System.out.println("Result: " + countRangeSum(nums1, -2, 2)); // 3

        int[] nums2 = {0};
        System.out.println("\nnums = " + Arrays.toString(nums2) + ", lower=0, upper=0");
        System.out.println("Result: " + countRangeSum(nums2, 0, 0)); // 1

        int[] nums3 = {0, 0};
        System.out.println("\nnums = " + Arrays.toString(nums3) + ", lower=0, upper=0");
        System.out.println("Result: " + countRangeSum(nums3, 0, 0)); // 3

        int[] nums4 = {-1, 1};
        System.out.println("\nnums = " + Arrays.toString(nums4) + ", lower=-1, upper=0");
        System.out.println("Result: " + countRangeSum(nums4, -1, 0)); // 1

        int[] nums5 = {Integer.MIN_VALUE, Integer.MAX_VALUE};
        System.out.println("\nnums = [MIN_VALUE, MAX_VALUE], lower=-1, upper=0");
        System.out.println("Result: " + countRangeSum(nums5, -1, 0)); // 1
    }

    
    
}
