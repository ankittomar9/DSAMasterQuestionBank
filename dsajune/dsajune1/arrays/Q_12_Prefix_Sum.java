package dsajune.dsajune1.arrays;

import java.util.Arrays;

public class Q_12_Prefix_Sum {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        prefixHelper(arr);

    } 
    public static void prefixHelper(int[] arr){
        if(arr==null || arr.length==0){
        System.out.println("Array is either empty or null");    return;
        }

        int prefixArr[]=new int[arr.length];
        prefixArr[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefixArr[i]=prefixArr[i-1]+arr[i];
        }
        System.out.println("Original Array : "+Arrays.toString(arr));
        System.out.println("Prefix Array : "+Arrays.toString(prefixArr));
        
    }
}

