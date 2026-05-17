package LeetCode150.LeetCode150_1;

import java.util.Arrays;

public class Q_4_RemoveDuplicatesII {
    public static void main(String[] args) {
           int arr1[] = {1,1,1,2,2,3}; 
         System.out.println("Original Array : " + Arrays.toString(arr1));
         int result=removeDuplicateshelper(arr1);
          System.out.println("k = " + result);
            System.out.println("Array After  k : " + Arrays.toString(arr1));

         int arr2[] = {0,0,1,1,1,1,2,3,3};
         System.out.println("Original Array : " + Arrays.toString(arr2));
         int result2=removeDuplicateshelper(arr2);
          System.out.println("k = " + result2);
            System.out.println("Array After  k : " + Arrays.toString(arr2));
    }
    public static int removeDuplicateshelper(int arr[]){
        if(arr==null || arr.length<=2){return arr.length;}
        int slow=2;

        for(int fast=2;fast<arr.length;fast++){
            if(arr[fast]!=arr[slow-2]){
                arr[slow]=arr[fast];
                slow++;
            }
        }
        return slow;
    }
}
