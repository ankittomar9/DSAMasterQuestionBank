package LeetCode150.LeetCode150_1;

import java.util.Arrays;

public class Q_27_Two_Sum_II_Input_Array_Is_Sorted {
    public static void main(String[] args) {
        int[] numbers1={2, 7, 11, 15}; int target1 = 9;
   System.out.println("Original Array 1  : "+Arrays.toString(numbers1));
        System.out.println("target  : "+target1);
        System.out.println("Output : " + Arrays.toString(twoSum(numbers1, target1)));
        int[] numbers2={2, 3, 4};  int target2 = 6;
         System.out.println("Original Array 2  : "+Arrays.toString(numbers2));
        System.out.println("target  : "+target2);
            System.out.println("Output : " + Arrays.toString(twoSum(numbers2, target2)));
    }
    public static int[] twoSum(int[] numbers ,int target){
        if(numbers==null || numbers.length<2){
            return new int[]{-1,-1};
        }
        int left=0;
        int right=numbers.length-1;

        while(left<right){
            int sum=numbers[left]+numbers[right];

            if(sum==target){
                return new int[]{left+1,right+1};
            }
            else if(sum<target){
                left++;
            }else{
                right--;
            }

        }
        return new int[]{-1,-1};
    }
}
