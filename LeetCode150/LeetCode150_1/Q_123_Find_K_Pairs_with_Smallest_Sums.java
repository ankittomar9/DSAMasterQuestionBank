package LeetCode150.LeetCode150_1;

import java.util.Arrays;
import java.util.List;

public class Q_123_Find_K_Pairs_with_Smallest_Sums {
    public static void main(String[] args) {
         int[] nums1 = {1, 7, 11};        int[] nums2 = {2, 4, 6};
        int k = 3;

        System.out.println("nums1 = " + Arrays.toString(nums1) +
                           ", nums2 = " + Arrays.toString(nums2) +
                           ", k = " + k);

        List<List<Integer>> result = kSmallestPairs(nums1, nums2, k);
        System.out.println("K Smallest Pairs: " + result);
    }
    public static List<List<Integer>>kSmallestPairs(int[] nums1,int[] nums2,int k){

    }
}
