package LeetCode150.LeetCode150_1;

import java.util.Arrays;

public class Q_6_Rotate_Array {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int k=3; 
        System.out.println("Original Array : \n"+Arrays.toString(arr));
       rotate(arr,k);
        System.out.println("Array after Rotation: \n"+Arrays.toString(arr));
    }
    public static void rotate(int[] arr,int k){
        if(arr==null || arr.length==0){return;}
        if(k==0)return;
        int n=arr.length;
        k=k%n;
         reverse(arr,0,n-1);

        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
       
    }
    public static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;end--;
        }
    }
}
