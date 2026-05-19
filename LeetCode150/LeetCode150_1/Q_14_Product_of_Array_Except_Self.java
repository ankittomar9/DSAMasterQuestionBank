package LeetCode150.LeetCode150_1;

import java.util.Arrays;

public class Q_14_Product_of_Array_Except_Self {
    public static void main(String[] args) {
    int[] nums = {1,2,3,4}; System.out.println("Original Array: \n " +Arrays.toString(nums));
        int[] result = productExceptSelf(nums);
        System.out.println("Result   : " + Arrays.toString(result));
                // int[] nums = {-1,1,0,-3,3};
    int[] nums2= {-1,1,0,-3,3}; System.out.println("Original Array :\n " +Arrays.toString(nums2));
        int[] result2 = productExceptSelf(nums2);
        System.out.println("Result   : " + Arrays.toString(result2));

    }
    public static int[] productExceptSelf(int[] nums){
        if(nums==null || nums.length==0){
            return nums;
        }
        int n=nums.length; int[] answer=new int[n];
        answer[0]=1;
        for(int i=1;i<n;i++){
            answer[i]=answer[i-1]*nums[i-1];
        }

        int right=1;
         for(int i=n-1; i>=0;i--){
            answer[i]=answer[i]*right;
            right=right*nums[i];
        }
        return answer;
    }
}
