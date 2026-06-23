package LeetCode150.LeetCode150_1;

import java.util.Arrays;

public class Q_121_Kth_Largest_Element_in_an_Array {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        System.out.println("Input: " + Arrays.toString(nums) + ", k = 2");
        System.out.println("Kth Largest: " + findKthLargest(nums, 2));
    }
    public static int findKthLargest(int[] nums,int k){
        return quickSelect(nums,0,nums.length-1,nums.length-k);
    }
    public static int quickSelect(int[] nums,int left,int right,int k){
        if(left==right){
            return nums[left];
        }

        int pivotIndex=partition(nums,left,right);
        if(k==pivotIndex){
            return nums[k];
        }else if(k<pivotIndex){
            return quickSelect(nums, left, pivotIndex-1, k);
        }else{
            return quickSelect(nums, pivotIndex+1, right, k);
        }
    }
    public static int partition(int[] nums,int left,int right){
        int pivot =nums[right];int i=left;

        for(int j=left;j<right;j++){
            if(nums[j]<pivot){
                swap(nums,i,j);
                i++;
            }
        }
        swap(nums,i,right);
        return i;
    }
    public static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

}
