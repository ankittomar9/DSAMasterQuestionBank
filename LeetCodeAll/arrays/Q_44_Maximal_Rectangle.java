package LeetCodeAll.arrays;

import java.util.ArrayDeque;
import java.util.Deque;

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
    public static int maximalRectangle(char[][] matrix){
        if(matrix==null || matrix.length==0){ return 0;}
        int rows=matrix.length;        int cols=matrix[0].length;
        int[] heights=new int[cols];         int maxArea=0;

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
              if(matrix[i][j]=='1'){
                heights[j]=heights[j]+1;
              }else{
                heights[j]=0;
              }
            }
            maxArea=Math.max(maxArea, largestRectangleHistogram(heights, i));
        }
        return maxArea;
    }
    public static int largestRectangleHistogram(int[] heights,int n){
         int[] h = new int[heights.length + 1];
      // int[] h=new int[n+1];
        System.arraycopy(heights, 0, h, 0, heights.length);
        Deque<Integer> stack=new ArrayDeque<>();
        int maxArea=0;

        for(int i=0;i<=heights.length;i++){
            while(!stack.isEmpty() && h[i]  < h[stack.peek()]){
                int height=h[stack.pop()];

                int width;
                if(stack.isEmpty()){   width=i;      }else{ width=i-stack.peek()-1;}
                maxArea=Math.max(maxArea,height*width);
            }
            stack.push(i);
        }
        return maxArea;
    }
}
