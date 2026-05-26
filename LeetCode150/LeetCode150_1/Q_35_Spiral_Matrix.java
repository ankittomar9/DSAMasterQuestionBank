package LeetCode150.LeetCode150_1;

import java.util.ArrayList;
import java.util.List;

public class Q_35_Spiral_Matrix {
    public static void main(String[] args) {
          int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Input Matrix:");
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println("\nSpiral Order: \n" + spiralOrder(matrix));
    }
    public static List<Integer> spiralOrder(int[][] matrix){
        List<Integer> result=new ArrayList<>();
        if(matrix==null || matrix.length==0){ return result;}

        int top=0;         int bottom=matrix.length-1;
        int left=0;        int right=matrix[0].length-1;

        while(top<=bottom && left<=right){
            for(int j=left;j<=right;j++){
                result.add(matrix[top][j]);
            }
            top++;

            for(int i=top; i<=bottom ;i++){
                result.add(matrix[i][right]);
            }
            right--;

            if(top<=bottom){
                for(int j=right;j>=left;j--){
                    result.add(matrix[bottom][j]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    result.add(matrix[i][left]);
                }
               left++;
            }
        }
         return result;
    }
}
