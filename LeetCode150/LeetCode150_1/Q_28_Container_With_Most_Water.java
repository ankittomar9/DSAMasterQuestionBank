package LeetCode150.LeetCode150_1;

import java.util.Arrays;

public class Q_28_Container_With_Most_Water {
    public static void main(String[] args) {
           int[] height1={1,8,6,2,5,4,8,3,7};
            System.out.println("Height : " + Arrays.toString(height1));
        System.out.println("Max Water : " + maxArea(height1));
             int[] height2 = {1,1};  
                 System.out.println("Height : " + Arrays.toString(height2));
        System.out.println("Max Water : " + maxArea(height2));
    }

    public static int maxArea(int[] height){
        if(height==null || height.length<2){return 0;}
    
        int left=0;int right=height.length-1;int maxArea=0; 

        while(left<right){
            int currentArea=Math.min(height[left], height[right]);
            int area=currentArea*(right-left);
            maxArea=Math.max(maxArea, area);

            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    
    }
}
