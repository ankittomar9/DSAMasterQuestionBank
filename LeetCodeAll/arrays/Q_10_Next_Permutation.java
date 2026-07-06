package LeetCodeAll.arrays;

import java.util.Arrays;

public class Q_10_Next_Permutation {
    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 4, 2};        System.out.println("Input:  " + Arrays.toString(nums1));
        nextPermutation(nums1);       System.out.println("Output: " + Arrays.toString(nums1));
 System.out.println();// Test 2   
         int[] nums2 = {3, 2, 1};        System.out.println("Input (largest):  " + Arrays.toString(nums2));
        nextPermutation(nums2);        System.out.println("Output (largest): " + Arrays.toString(nums2));
    }
    public static void nextPermutation(int[] nums){
        if(nums ==null && nums.length<=1){return;}
        int n=nums.length; int pivot=-1;

        for(int i=n-2;i>=0;i--){
            if(nums[i] <nums[i+1]){
                pivot=i; 
                break;
            }
        }
        if(pivot==-1){
            reverse(nums,0,n-1);
            return ;
        }

        for(int j=n-1;j>pivot;j--){
            if (nums[j] > nums[pivot]) {
            swap(nums, pivot, j);
            break;
        }
        }
        reverse(nums,pivot+1,n-1);
    }   
    public static void swap(int[] nums ,int i,int j){
        int temp=nums[i];nums[i]=nums[j];nums[j]=temp;
    }
    public static void reverse(int[] nums, int l,int r){
        while(l<r){ swap(nums,l,r);
            l++;r--;
        }
    }
}
