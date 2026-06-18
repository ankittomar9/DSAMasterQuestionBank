package LeetCode150.LeetCode150_1;

public class Q_112_Maximum_Subarray {
    public static void main(String[] args) {
         int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Input: " + java.util.Arrays.toString(nums));
        System.out.println("Maximum Subarray Sum: " + maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums){
        if(nums==null || nums.length==0){return 0;}
        int maxSum=nums[0];
        int currentSum=nums[0];

        for(int i=1;i<nums.length;i++){
            currentSum=Math.max(nums[i],currentSum+nums[i]);
            maxSum=Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
