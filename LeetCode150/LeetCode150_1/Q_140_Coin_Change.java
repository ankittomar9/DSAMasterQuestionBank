package LeetCode150.LeetCode150_1;

import java.util.Arrays;

public class Q_140_Coin_Change {
    public static void main(String[] args) {
     int[] coins1 = {1, 2, 5};
        System.out.println("coins = " + Arrays.toString(coins1) + ", amount = 11");
        System.out.println("Fewest Coins: " + coinChange(coins1, 11));

        int[] coins2 = {2};
        System.out.println("\ncoins = " + Arrays.toString(coins2) + ", amount = 3");
        System.out.println("Fewest Coins: " + coinChange(coins2, 3));
    }   
    public static int coinChange(int[] coins ,int amount){
        if(amount==0){return 0;}
        int[] dp=new int[amount+1];
        Arrays.fill(dp, amount+1);
        dp[0]=0;


        for(int i=1;i<=amount;i++){
            for(int coin:coins ){
                if(coin<=i){
                    int candidate=dp[i-coin]+1;
                    dp[i]=Math.min(dp[i], candidate);
                }
            }
        }
      
    if (dp[amount] > amount) {
    return -1;
        } else {
           return dp[amount];
    }
    }
}
