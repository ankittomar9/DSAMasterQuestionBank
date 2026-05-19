package LeetCode150.LeetCode150_1;
import java.util.Arrays;
public class Q_9_Jump_Game {
    public static void main(String[] args) {
               int[] nums1 = {2,3,1,1,4};
        // int[] nums2 = {3, 2, 1, 0, 4};

        System.out.println("Original Array: " + Arrays.toString(nums1));
        boolean canReach1 = canJump(nums1);
        System.out.println("Can Reach Last Index: " + canReach1);

        int[] nums2 = {3, 2, 1, 0, 4};
        System.out.println("Original Array: " + Arrays.toString(nums2));
        boolean canReach2 = canJump(nums2);
        System.out.println("Can Reach Last Index: " + canReach2);
    }
    public static boolean canJump(int[] nums){
        if(nums==null || nums.length==0){return true;}
        int n=nums.length;
        int maxReach=0;

        for(int i=0;i<=maxReach;i++){
            if(i>=n){break;}

            maxReach=Math.max(maxReach, i+nums[i]);
            if(maxReach>=n-1)
            return true;
        }
        return false;
    }
}
