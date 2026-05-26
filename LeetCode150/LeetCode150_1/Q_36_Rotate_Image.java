package LeetCode150.LeetCode150_1;

public class Q_36_Rotate_Image {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
           System.out.println("Input Matrix:");        printMatrix(matrix);
        rotate(matrix);
        System.out.println("\nAfter Rotating:");
        printMatrix(matrix);
    }
    public static void rotate(int[][] matrix){
        int n=matrix.length;
        if(matrix==null || matrix.length==0){return ;}
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            int left=0; int right=n-1;
            while(left<right){
                int temp=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;
                left++;right--;
            }
        }
    }
    public static void printMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
