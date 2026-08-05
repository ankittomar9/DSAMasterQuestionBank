package LeetCodeAll.arrays;

import java.util.Arrays;

public class Q_117_Wiggle_Sort_II {
    public static void main(String[] args) {
         int[] nums1 = {1, 5, 1, 1, 6, 4};
        System.out.print("Before: " + Arrays.toString(nums1));
        wiggleSort(nums1);
        System.out.println(" → After: " + Arrays.toString(nums1));

        int[] nums2 = {1, 3, 2, 2, 3, 1};
        System.out.print("Before: " + Arrays.toString(nums2));
        wiggleSort(nums2);
        System.out.println(" → After: " + Arrays.toString(nums2));

        int[] nums3 = {4, 5, 5, 6};
        System.out.print("Before: " + Arrays.toString(nums3));
        wiggleSort(nums3);
        System.out.println(" → After: " + Arrays.toString(nums3));

        int[] nums4 = {1, 1, 2, 1, 2, 2, 1};
        System.out.print("Before: " + Arrays.toString(nums4));
        wiggleSort(nums4);
        System.out.println(" → After: " + Arrays.toString(nums4));
    }

    public static void wiggleSort(int[] nums){
        
    }
}
