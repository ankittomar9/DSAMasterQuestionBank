package LeetCode150.LeetCode150_1;

import java.util.Arrays;

public class Q_16_Rain_Water_trapping_1 {
    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        // int[] height = {4, 2, 0, 3, 2, 5};

        System.out.println("Height : " + Arrays.toString(height));
        int water = trap(height);
        System.out.println("Trapped Water : " + water);
    }
    public static int trap(int[] height){
        if (height == null || height.length == 0) {  return 0;       }
        int n=height.length;

        int left=0;
        int right=n-1;

        int leftMax=0;int rightMax=0; int waterTrapped=0;
        while(left<right){

            leftMax=Math.max(leftMax, height[left]);
            rightMax=Math.max(rightMax, height[right]);

            if(leftMax<rightMax){
                waterTrapped=waterTrapped+leftMax-height[left];
                left++;
            }else{
                waterTrapped=waterTrapped+rightMax-height[right];
                right--;
            }
        }
        return waterTrapped;
    }
}
