package LeetCodeAll.arrays;

public class Q_97_Search_a_2D_Matrix_II {
    public static void main(String[] args) {
        int[][] matrix = {
            {1,  4,  7, 11, 15},
            {2,  5,  8, 12, 19},
            {3,  6,  9, 16, 22},
            {10, 13, 14, 17, 24},
            {18, 21, 23, 26, 30}
        };        // Test 1: found
        System.out.println("target = 5  → " + searchMatrix(matrix, 5));
        // Test 2: not found
        System.out.println("target = 20 → " + searchMatrix(matrix, 20));
        // Test 3: top-left corner
        System.out.println("target = 1  → " + searchMatrix(matrix, 1));
        // Test 4: bottom-right corner
        System.out.println("target = 30 → " + searchMatrix(matrix, 30));
    }
    public static boolean searchMatrix(int[][] matrix,int target){
        int m=matrix.length; int n=matrix[0].length;

            int row=0;int col=n-1;

            while(row <m && col>=0){
                int current =matrix[row][col];

                if(current==target){
                    return true;
                }else if(current>target){
                    col--;
                }else{
                    row++;
                }
            }
    
            return false;
        }
}
