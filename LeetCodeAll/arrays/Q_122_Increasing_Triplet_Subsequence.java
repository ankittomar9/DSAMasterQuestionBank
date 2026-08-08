package LeetCodeAll.arrays;

import java.util.Arrays;

public class Q_122_Increasing_Triplet_Subsequence {
    public static void main(String[] args) {
         // Test 1: clear triplet
        int[] nums1 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(nums1) + " → " + increasingTriplet(nums1));
        // true

        // Test 2: strictly decreasing
        int[] nums2 = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(nums2) + " → " + increasingTriplet(nums2));
        // false

        // Test 3: non-obvious triplet with first update
        int[] nums3 = {2, 1, 5, 0, 4, 6};
        System.out.println(Arrays.toString(nums3) + " → " + increasingTriplet(nums3));
        // true (0 < 4 < 6)

        // Test 4: equal elements
        int[] nums4 = {1, 1, 1, 1};
        System.out.println(Arrays.toString(nums4) + " → " + increasingTriplet(nums4));
        // false (not strictly increasing)

        // Test 5: triplet at the very end
        int[] nums5 = {20, 100, 10, 12, 5, 13};
        System.out.println(Arrays.toString(nums5) + " → " + increasingTriplet(nums5));
        // true (10 < 12 < 13)

        // Test 6: two elements only
        int[] nums6 = {1, 2};
        System.out.println(Arrays.toString(nums6) + " → " + increasingTriplet(nums6));
        // false (need at least 3)

        // Test 7: negative numbers
        int[] nums7 = {-5, -3, -1};
        System.out.println(Arrays.toString(nums7) + " → " + increasingTriplet(nums7));
        // true (-5 < -3 < -1)
    }

public static boolean increasingTriplet(int[] nums){
    int first=Integer.MAX_VALUE;
    int second =Integer.MAX_VALUE;

    for(int num:nums){
        if(num<=first){
            first=num;
        }else if(num<=second){
            second=num;
        }else{
            return true;
        }
    }
    return false;
}
}
