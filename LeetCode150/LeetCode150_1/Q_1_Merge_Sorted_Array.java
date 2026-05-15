package LeetCode150.LeetCode150_1;

import java.util.Arrays;

public class Q_1_Merge_Sorted_Array {
    public static void main(String[] args) {
     int nums1[]={1,2,3,0,0,0};System.out.println("Array1: " + Arrays.toString(nums1));
     int m=3;
     int nums2[]={2,5,6};System.out.println("Array2: " + Arrays.toString(nums2));
     int n=3;
        System.out.println("Before: " + Arrays.toString(nums1));
         MergeSortedArray(nums1, m, nums2, n);
        System.out.println("After:  " + Arrays.toString(nums1));
    }
    public static void MergeSortedArray(int nums1[],int m,int nums2[],int n){
        int i=m-1;
        int j=n-1;
        int k=m+n-1;

        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                k--;
                i--;
            }else{
                nums1[k]=nums2[j];
                k--;j--;
            }
        }
        while(j>=0){
            nums1[k]=nums2[j];
            k--;j--;
        }
    }
    
}
