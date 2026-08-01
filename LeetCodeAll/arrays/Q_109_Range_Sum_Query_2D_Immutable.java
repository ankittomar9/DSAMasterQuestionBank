package LeetCodeAll.arrays;

public class Q_109_Range_Sum_Query_2D_Immutable {
    public static void main(String[] args) {
          int[][] matrix = {
            {3, 0, 1, 4, 2},
            {5, 6, 3, 2, 1},
            {1, 2, 0, 1, 5},
            {4, 1, 0, 1, 7},
            {1, 0, 3, 0, 5}
        };
        NumMatrix obj = new NumMatrix(matrix);
        // Test queries
        System.out.println("sumRegion(2,1,4,3) → " + obj.sumRegion(2, 1, 4, 3)); // 8
        System.out.println("sumRegion(1,1,2,2) → " + obj.sumRegion(1, 1, 2, 2)); // 11
        System.out.println("sumRegion(1,2,2,4) → " + obj.sumRegion(1, 2, 2, 4)); // 12
        // Edge: single cell
        System.out.println("sumRegion(0,0,0,0) → " + obj.sumRegion(0, 0, 0, 0)); // 3
        System.out.println("sumRegion(4,4,4,4) → " + obj.sumRegion(4, 4, 4, 4)); // 5
        // Edge: full matrix
        System.out.println("sumRegion(0,0,4,4) → " + obj.sumRegion(0, 0, 4, 4)); // 58
    }

public static class NumMatrix{
    private int[][] prefix;

    public NumMatrix(int[][] matrix){
        int m=matrix.length;
        int n=matrix[0].length;

        prefix=new int[m+1][n+1];

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                prefix[i][j]=matrix[i-1][j-1]+prefix[i-1][j]+prefix[i][j-1]-prefix[i-1][j-1];
            }
        }
    }

    public  int sumRegion(int row1,int col1,int row2,int col2){
        return prefix[row2+1][col2+1]
        -prefix[row1][col2+1]
        -prefix[row2+1][col1]
        +prefix[row1][col1];

    }
}
}
