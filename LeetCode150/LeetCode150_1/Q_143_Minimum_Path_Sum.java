package LeetCode150.LeetCode150_1;

import java.util.Arrays;

public class Q_143_Minimum_Path_Sum {
    public static void main(String[] args) {
           int[][] grid = {
            {1, 3, 1},
            {1, 5, 1},
            {4, 2, 1}
        };

        System.out.println("Input Grid:");
        for (int[] row : grid) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println("\nMinimum Path Sum: " + minPathSum(grid));
    }
    public static int minPathSum(int[][] grid){
        int m=grid.length;
        int n=grid[0].length;

        for(int j=1;j<n;j++){
            grid[0][j]=grid[0][j]+grid[0][j-1];
        }
        for(int i=1;i<m;i++){
             grid[i][0]=grid[i][0]+grid[i-1][0];
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                int minimum=Math.min(grid[i - 1][j], grid[i][j - 1]);
                   grid[i][j]=grid[i][j]+minimum;  
            }
        }
        return grid[m-1][n-1];
    }
}
