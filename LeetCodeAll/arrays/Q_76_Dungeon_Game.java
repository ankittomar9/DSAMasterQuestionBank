package LeetCodeAll.arrays;

import java.util.Arrays;

public class Q_76_Dungeon_Game {
    public static void main(String[] args) {
          int[][] dungeon1 = {{-2, -3, 3}, {-5, -10, 1}, {10, 30, -5}};
        System.out.println("dungeon = [[-2,-3,3],[-5,-10,1],[10,30,-5]]");
        System.out.println("Minimum Initial Health: " + calculateMinimumHP(dungeon1));

        
    }
    public static int calculateMinimumHP(int[][] dungeon){
        int m=dungeon.length;
        int n=dungeon[0].length;

        int[][] dp=new int[m+1][n+1];

        for(int[] rows:dp){
            Arrays.fill(rows, Integer.MAX_VALUE);
        }
        dp[m][n-1]=1;        dp[m-1][n]=1;
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){

                int minNextHealth=Math.min(dp[i+1][j],dp[i][j+1]);
                dp[i][j]=Math.max(1, minNextHealth-dungeon[i][j]);

            }
        }
        return dp[0][0];
    }
}
