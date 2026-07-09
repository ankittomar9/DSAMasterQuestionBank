package LeetCodeAll.arrays;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Q_45_Largest_Rectangle_in_Histogram {
    public static void main(String[] args) {
        int[] heights1 = {2, 1, 5, 6, 2, 3};        System.out.println("heights = " + Arrays.toString(heights1));
        System.out.println("Largest Rectangle Area: " + largestRectangleArea(heights1));

        // Test 2
        System.out.println();        int[] heights2 = {2, 4};        System.out.println("heights = " + Arrays.toString(heights2));
        System.out.println("Largest Rectangle Area: " + largestRectangleArea(heights2));

          System.out.println();        int[] heights3 = {3, 3, 3, 3};        System.out.println("heights = " + Arrays.toString(heights3));
        System.out.println("Largest Rectangle Area: " + largestRectangleArea(heights3));
    }
    public static int largestRectangleArea(int[] heights){
         int[] h = new int[heights.length + 1];
      // int[] h=new int[n+1];
        System.arraycopy(heights, 0, h, 0, heights.length);
        Deque<Integer> stack=new ArrayDeque<>();
        int maxArea=0;

        for(int i=0;i<=heights.length;i++){
            while(!stack.isEmpty() && h[i]  < h[stack.peek()]){
                int poppedHeight=h[stack.pop()];

                int width;
                if(stack.isEmpty()){   width=i;      }else{ width=i-stack.peek()-1;}
                maxArea=Math.max(maxArea,poppedHeight*width);
            }
            stack.push(i);
        }
        return maxArea;
    }
    
}
