package LeetCodeAll.arrays;

import java.util.Arrays;

public class Q_112_Burst_Balloons {
    public static void main(String[] args) {
        // Test 1
        int[] nums1 = {3, 1, 5, 8};
        System.out.println("nums = " + Arrays.toString(nums1));
        System.out.println("Max Coins: " + maxCoins(nums1));

        // Test 2
        System.out.println();
        int[] nums2 = {1, 5};
        System.out.println("nums = " + Arrays.toString(nums2));
        System.out.println("Max Coins: " + maxCoins(nums2));

        // Test 3: single balloon
        System.out.println();
        int[] nums3 = {5};
        System.out.println("nums = " + Arrays.toString(nums3));
        System.out.println("Max Coins: " + maxCoins(nums3));

        // Test 4: all ones
        System.out.println();
        int[] nums4 = {1, 1, 1, 1};
        System.out.println("nums = " + Arrays.toString(nums4));
        System.out.println("Max Coins: " + maxCoins(nums4));
    }
public static int maxCoins(int[] nums){
    int n=nums.length;
    int[] padded=new int[n+2];
    padded[0]=1;
    padded[n+1]=1;
    for(int i=0;i<n;i++){
        padded[i+1]=nums[i];
    }

    int[][] dp=new int[n+2][n+2];

    for(int len=2;len<=n+1;len++){
        for(int left=0;left+len<=n+1;left++){
            int right=left+len;
            for(int k=left+1;k<right;k++){
                int coins=padded[left] *padded[k]* padded[right]
                +dp[left][k]+dp[k][right];
                
                dp[left][right]=Math.max(dp[left][right],coins);
            }
        }
    }
    return dp[0][];
}


}
