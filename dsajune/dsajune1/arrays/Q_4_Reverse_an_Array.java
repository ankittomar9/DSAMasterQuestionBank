package dsajune.dsajune1.arrays;

import java.util.Arrays;

public class Q_4_Reverse_an_Array {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,5};
        System.out.println("Original Array : \n"+Arrays.toString(arr));
        reverseHelper(arr);
        System.out.println("Array is reversed : \n"+Arrays.toString(arr));

    }
    public static void reverseHelper(int[] arr){
        if(arr==null || arr.length==0){
            System.out.println("Array is Empty or null");
            return;
        }
        int start=0; int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;end--;
        }
       // System.out.println("Array is reversed : \n"+Arrays.toString(arr));
    }
}
