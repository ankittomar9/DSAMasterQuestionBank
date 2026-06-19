package LeetCode150.LeetCode150_1;

public class Q_113_Maximum_Sum_Circular_Subarray {
    public static void main(String[] args) {
        int[] nums = {1, -2, 3, -2};
        System.out.println("Input: " + java.util.Arrays.toString(nums));
        System.out.println("Maximum Circular Subarray Sum: " + maxSubarraySumCircular(nums));
    }
    public static int maxSubarraySumCircular(int[] nums){
        int totalSum=0;
        int maxSum=Integer.MIN_VALUE;
        int currentMax=0; int minSum=Integer.MAX_VALUE;int currentMin=0;


        for(int num:nums){
            totalSum=totalSum+num;

            currentMax=Math.max(currentMax+num,num);
            maxSum=Math.max(maxSum, currentMax);

            currentMin=Math.min(currentMin+num, num);
            minSum=Math.min(minSum,currentMin);
        }
        if(maxSum<0){
            return maxSum;
        }
        int result=Math.max(maxSum,totalSum- minSum);
        return result;

    }
}
