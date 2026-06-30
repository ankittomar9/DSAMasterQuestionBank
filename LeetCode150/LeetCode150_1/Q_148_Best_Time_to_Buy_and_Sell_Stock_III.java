package LeetCode150.LeetCode150_1;

import java.util.Arrays;

public class Q_148_Best_Time_to_Buy_and_Sell_Stock_III {
    public static void main(String[] args) {
         int[] prices = {3, 3, 5, 0, 0, 3, 1, 4};
        System.out.println("prices = " + Arrays.toString(prices));
        System.out.println("Maximum Profit with at most 2 transactions: " + maxProfit(prices));
    }
}
