package LeetCode150.LeetCode150_1;

public class Q_150_Maximal_Square {
    public static void main(String[] args) {
         char[][] matrix = {
            {'1','0','1','0','0'},
            {'1','0','1','1','1'},
            {'1','1','1','1','1'},
            {'1','0','0','1','0'}
        };

        System.out.println("Input Matrix:");
        for (char[] row : matrix) System.out.println(java.util.Arrays.toString(row));

        System.out.println("\nMaximum Square Area: " + maximalSquare(matrix));
    }
    public static int maximalSquare(char[][] matrix){
        int m=matrix.length; int n=matrix[0].length;
        int[][] dp=new int[m][n];
        int maxSide=0;

        for(int j=0;j<n;j++){
            dp[0][j]=matrix[0][j]-'0';
            maxSide=Math.max(maxSide,dp[0][j]);
        }

        for(int i=0;i<m;i++){
            dp[i][0]=matrix[i][0]-'0';
            maxSide=Math.max(maxSide, dp[i][0]);
        }

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][j]=='0'){
                    dp[i][j]=0;
                }else{
                    dp[i][j]= Math.min(dp[i-1][j],Math.min(dp[i][j-1], dp[i-1][j-1]))+1;
                }
                maxSide=Math.max(maxSide, dp[i][j]);
            }
        }
         System.out.println("\nDP Table:");
        for (int[] row : dp) System.out.println(java.util.Arrays.toString(row));
        return maxSide*maxSide;
    }
    
}


//65 32 84