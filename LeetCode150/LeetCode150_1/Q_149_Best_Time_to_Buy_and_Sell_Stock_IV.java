package LeetCode150.LeetCode150_1;

import java.util.Arrays;

public class Q_149_Best_Time_to_Buy_and_Sell_Stock_IV {
   public static void main(String[] args) {
        int k = 2;
        int[] prices = {3, 2, 6, 5, 0, 3};
        System.out.println("k = " + k + ", prices = " + Arrays.toString(prices));
        System.out.println("Maximum Profit: " + maxProfit(k, prices));

        k = 2;
        prices = new int[]{2, 4, 1};
        System.out.println("\nk = " + k + ", prices = " + Arrays.toString(prices));
        System.out.println("Maximum Profit: " + maxProfit(k, prices));
   } 
   public static int maxProfit(int k,int[] prices){
    int n=prices.length;
    if(k>=n/2){
        int profit=0;
        for(int i=1;i<n;i++){
            if(prices[i]>prices[i-1]){
                profit=profit+prices[i]-prices[i-1];
            }
        }
        return profit;
    }
    int[][] dp=new int[k+1][2];
    for(int t=0;t<=k;t++){
        dp[t][0]=0;
        dp[t][1]=Integer.MIN_VALUE;
    }

    for(int i=0;i<prices.length;i++){
        for(int t=k;t>=1;t--){
            dp[t][0]=Math.max(dp[t][0], dp[t][1]+prices[i]);
            dp[t][1]=Math.max(dp[t][1], dp[t-1][0]-prices[i]);
        }
    }
    return dp[k][0];
   }
}
