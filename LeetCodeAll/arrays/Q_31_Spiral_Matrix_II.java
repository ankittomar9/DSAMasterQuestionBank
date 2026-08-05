package LeetCodeAll.arrays;

public class Q_31_Spiral_Matrix_II {
    public static void main(String[] args) {
         System.out.println("n = 3");        printMatrix(generateMatrix(3));

        System.out.println("\nn = 4");        printMatrix(generateMatrix(4));

        System.out.println("\nn = 1");        printMatrix(generateMatrix(1));
    }
    public static int[][] generateMatrix(int n){
        int[][] matrix=new int[n][n];
        int[] dr={0,1,0,-1};
        int[] dc={1,0,-1,0};
        int dir=0,row=0,col=0;
        for(int num=1;num<=n*n ;num++){
            matrix[row][col]=num;
            int nextRow = row+dr[dir];
            int nextCol = col+dc[dir];

            if(nextRow<0 || nextRow>=n || nextCol<0 || nextCol >=n || matrix[nextRow][nextCol] !=0){
                dir=(dir+1) %4;
            }
            row=row+dr[dir];
            col=col+dc[dir];
        }
        return matrix;
    }

     private static void printMatrix(int[][] matrix) {
        int n = matrix.length;
        int width = String.valueOf(n * n).length() + 1;
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.printf("%" + width + "d", val);
            }
            System.out.println();
        }
    }
}
