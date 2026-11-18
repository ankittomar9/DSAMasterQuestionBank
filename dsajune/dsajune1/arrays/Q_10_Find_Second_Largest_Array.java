package dsajune.dsajune1.arrays;

import java.util.Arrays;

public class Q_10_Find_Second_Largest_Array {
    public static void main(String args[]){
        int arr[]={100,1,54,17,9,78,91,2,1,7,6,22};
        System.out.println("Original Array : \n"+Arrays.toString(arr));
        secondLargestArray(arr);
    }
    public static void secondLargestArray(int[] arr){
        if(arr==null || arr.length<1){
            System.out.println("Array is either empty or null");
                    return;
        }
        int max=Integer.MIN_VALUE;
        int secondMax=max;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secondMax=max;
                max=arr[i];
            }

            if(arr[i]<max && arr[i]>secondMax){
                secondMax=arr[i];
            }
        }
        System.out.println("Maximum Element in Array : "+max);
        System.out.println("Second Max : "+secondMax);
    }
}
