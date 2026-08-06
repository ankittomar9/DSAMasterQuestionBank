package LeetCodeAll.arrays;

public class Q_119_Longest_Increasing_Path_Matrix {
    public static void main(String[] args) {
         int[][] matrix1 = {{9,9,4},{6,6,8},{2,1,1}};
        System.out.println("Matrix 1 → Longest Path: " + longestIncreasingPath(matrix1)); // 4

        int[][] matrix2 = {{3,4,5},{3,2,6},{2,2,1}};
        System.out.println("Matrix 2 → Longest Path: " + longestIncreasingPath(matrix2)); // 4

        int[][] matrix3 = {{1}};
        System.out.println("Matrix 3 → Longest Path: " + longestIncreasingPath(matrix3)); // 1

        int[][] matrix4 = {{3,3,3},{3,3,3}};
        System.out.println("Matrix 4 → Longest Path: " + longestIncreasingPath(matrix4)); // 1

        int[][] matrix5 = {{1,2,3,4,5}};
        System.out.println("Matrix 5 → Longest Path: " + longestIncreasingPath(matrix5)); // 5
    }
       private static final int[][] dirs = {{0,1}, {0,-1}, {1,0}, {-1,0}};
    public static int longestIncreasingPath(int[][] matrix){
        int m=matrix.length;int n=matrix[0].length;
        int[][] memo =new int[m][n];
        int maxPath=1;

        for(int r=0;r<m;r++){
            for(int c=0;c<n;c++){
                maxPath=Math.max(maxPath, dfs(matrix, r, c, m, n, memo));
            }
        }
        return maxPath;
    }
    public static int dfs(int[][] matrix,int r,int c,int m,int n,int[][] memo){
        if(memo[r][c] !=0){return memo[r][c];}
        int longest=1;
        for(int[] d: dirs ){
            int nr=r+d[0],nc=c+d[1];
            if(nr>=0 && nr <m && nc>=0 && nc < n && matrix[nr][nc] > matrix[r][c]){
                longest=Math.max(longest,1+ dfs(matrix, nr, nc, m, n, memo));
            }
        }
        memo[r][c]=longest;
        return longest;
    }
}
