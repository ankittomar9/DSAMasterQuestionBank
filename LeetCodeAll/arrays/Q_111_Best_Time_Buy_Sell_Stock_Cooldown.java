package LeetCodeAll.arrays;

import java.util.Arrays;

public class Q_111_Best_Time_Buy_Sell_Stock_Cooldown {
    public static void main(String[] args) {
          int[] prices1 = {1, 2, 3, 0, 2};
        System.out.println("prices = " + Arrays.toString(prices1));
        System.out.println("Max Profit: " + maxProfit(prices1));

        // Test 2
        System.out.println();
        int[] prices2 = {1};
        System.out.println("prices = " + Arrays.toString(prices2));
        System.out.println("Max Profit: " + maxProfit(prices2));

        // Test 3
        System.out.println();
        int[] prices3 = {1, 2, 4};
        System.out.println("prices = " + Arrays.toString(prices3));
        System.out.println("Max Profit: " + maxProfit(prices3));
    }
    public static int maxProfit(int[] prices){
        
    }

}
