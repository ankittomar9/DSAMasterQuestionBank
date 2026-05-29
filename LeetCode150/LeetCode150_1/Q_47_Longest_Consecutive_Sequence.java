package LeetCode150.LeetCode150_1;

import java.util.HashSet;
import java.util.Set;

public class Q_47_Longest_Consecutive_Sequence {
    public static void main(String[] args) {
        int[] nums1 = {100, 4, 200, 1, 3, 2};
        int[] nums2 = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};

        System.out.println("Input  : " + java.util.Arrays.toString(nums1));
        System.out.println("Output : " + longestConsecutive(nums1));

        System.out.println("\nInput  : " + java.util.Arrays.toString(nums2));
        System.out.println("Output : " + longestConsecutive(nums2));
    }
    public static int longestConsecutive(int[] nums){
        if(nums==null || nums.length==0){
            return 0;        }
            Set<Integer> set=new HashSet<>();
            for(int i=0;i<nums.length;i++){
                set.add(nums[i]);
            }

            int maxLen=0;
            for(int i=0;i<nums.length;i++){
                if(!set.contains(nums[i]-1)){
                    int current=nums[i];
                    int streak=0;

                    while(set.contains(current)){
                        streak++;
                        current++;
                    }
                    maxLen=Math.max(maxLen, streak);
                }
            }
            return maxLen;
    }
}
