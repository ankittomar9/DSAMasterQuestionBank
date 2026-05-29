package LeetCode150.LeetCode150_1;

import java.util.Arrays;

public class Q_47_Longest_Consecutive_Sequence_1 {
      public static void main(String[] args) {
        int[] nums1 = {100, 4, 200, 1, 3, 2};
        int[] nums2 = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};

        System.out.println("Input  : " + java.util.Arrays.toString(nums1));
        System.out.println("Output : " + longestConsecutive(nums1));

        System.out.println("\nInput  : " + java.util.Arrays.toString(nums2));
        System.out.println("Output : " + longestConsecutive(nums2));
    }
    public static int longestConsecutive(int[] nums){
    if (nums == null || nums.length == 0) {
        return 0;
    }
    Arrays.sort(nums);

    int maxLen = 1;
    int currentStreak = 1;

    for (int i = 1; i < nums.length; i++) {
        if (nums[i] == nums[i - 1]) {
            continue;
        }

        if (nums[i] == nums[i - 1] + 1) {
            currentStreak++;
        }
        else {
            maxLen = Math.max(maxLen, currentStreak);
            currentStreak = 1;
        }
    }
    return Math.max(maxLen, currentStreak);
}
}
