package LeetCode150.LeetCode150_1;

import java.util.Arrays;

public class Q_8_BestTimeToBuyAndSellStockII {
    public static void main(String[] args) {
      int[] prices={7,1,5,3,6,4};
         System.out.println("Original Array : \n"+Arrays.toString(prices));
        int profit=maxProfit(prices);
          System.out.println("Maximum Profit  : " + profit);

          int[] crashPrices = {7, 6, 4, 3, 1};
        System.out.println("Crash Array : \n" + Arrays.toString(crashPrices));
        System.out.println("Maximum Profit  : " + maxProfit(crashPrices));
      
    }
    public static int maxProfit(int[] prices){
           if(prices==null || prices.length==0){return 0;}
     //   int minBuy=prices[0];
        int profit=0;

        for(int i=1;i<prices.length;i++){
          //  int currentPrice=prices[i]-prices[i-1];
            if(prices[i]>prices[i-1]){
                profit=profit+prices[i]-prices[i-1];
            }
        }
        return profit;
    }
    }

