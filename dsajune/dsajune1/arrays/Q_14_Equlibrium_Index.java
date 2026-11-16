package dsajune.dsajune1.arrays;

import java.util.Arrays;

public class Q_14_Equlibrium_Index {
    public static void main(String args[]){
        int arr[]={-7,1,5,2,-4,3,0};
        System.out.println("Original Array : \n"+Arrays.toString(arr));
        int pivot=equilibriumIndex(arr);

        if(pivot!= -1){
            System.out.println("Equlibrium Index found at : "+ pivot);
        }else{
            System.out.println("Equlibrium Index Does not exists ");
        }
    }
    public static int equilibriumIndex(int arr[]){
        if(arr==null || arr.length<1){
            System.out.println("Array is either empty or null"); return -1 ;
        }
        long totalSum=0;
        for(int i=0;i<arr.length;i++){
            totalSum=totalSum+arr[i];
        }
        long leftSum=0;

        for(int i=0;i<arr.length;i++){
            long rightSum=totalSum-leftSum-arr[i];

            if(leftSum==rightSum){
                return i;
            }
            leftSum=leftSum+arr[i];
        }
        return -1;
        
    }
}
