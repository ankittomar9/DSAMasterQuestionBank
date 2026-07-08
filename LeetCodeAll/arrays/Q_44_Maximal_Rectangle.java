package LeetCodeAll.arrays;

public class Q_44_Maximal_Rectangle {
    public static void main(String[] args) {
          // Test 1
        char[][] matrix1 = {
            {'1','0','1','0','0'},
            {'1','0','1','1','1'},
            {'1','1','1','1','1'},
            {'1','0','0','1','0'}
        };
            System.out.println("Input Matrix:");
        for (char[] row : matrix1) System.out.println(java.util.Arrays.toString(row));
        System.out.println("Maximal Rectangle Area: " + maximalRectangle(matrix1));
    }

}
