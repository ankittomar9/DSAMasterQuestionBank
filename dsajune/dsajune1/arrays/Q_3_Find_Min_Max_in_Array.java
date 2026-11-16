package dsajune.dsajune1.arrays;

import java.util.Arrays;

public class Q_3_Find_Min_Max_in_Array {
    public static void main(String args[]){
        int[] arr={4,7,8,5,6,4,99,88,44,1,3,6,7,0,12,1};
          System.out.println("Original Array : \n"+Arrays.toString(arr));
          minMaxFindHelper(arr);
    }
    public static void minMaxFindHelper(int arr[]){
        if(arr==null || arr.length==0){
              System.out.println("Array is either empty or null");
              return;
            }
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;

            for(int i=0;i<arr.length;i++){
                if(arr[i]>max){
                    max=arr[i];
                }else if(arr[i]<min){
                    min=arr[i];
                }
            }
            System.out.println("Maximum Element in Array is : \n"+max);
            System.out.println("Minimum Element in Array is : \n"+min);
    }
    
}
