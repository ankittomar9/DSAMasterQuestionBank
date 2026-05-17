package LeetCode150.LeetCode150_1;

import java.util.Arrays;

public class Q_3_RemoveDuplicates {
    public static void main(String[] args) {
         int arr1[] = {1, 1, 2}; 
         System.out.println("Original Array : " + Arrays.toString(arr1));
         int result=removeDuplicates(arr1);
          System.out.println("k = " + result);
            System.out.println("Array After  k : " + Arrays.toString(arr1));

         int arr2[] = {0,0,1,1,1,2,2,3,3,4};
         System.out.println("Original Array : " + Arrays.toString(arr2));
         int result2=removeDuplicates(arr2);
          System.out.println("k = " + result2);
            System.out.println("Array After  k : " + Arrays.toString(arr2));
    }
    public static int  removeDuplicates(int arr[]){
        if(arr==null || arr.length==0){ return 0;}
        int slow=1;

        for(int fast=0;fast<arr.length;fast++){
            if(arr[fast]!=arr[slow-1]){
                arr[slow]=arr[fast];
                slow++;
            }
        }
        return slow;
    }
}
