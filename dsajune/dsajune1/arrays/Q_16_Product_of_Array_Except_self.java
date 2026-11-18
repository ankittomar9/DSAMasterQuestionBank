package dsajune.dsajune1.arrays;

import java.util.Arrays;

public class Q_16_Product_of_Array_Except_self {
    public static void main(String args[]){
    int arr[]={1,2,3,4};     System.out.println("Original Array : \n"+Arrays.toString(arr));
    productPuzzleHelper(arr);
    }
    public static void productPuzzleHelper(int arr[]){
        if(arr==null || arr.length ==0){ return ;}

        int n=arr.length;
        int resultArr[]=new int[n];

        resultArr[0]=1;
        for(int i=1;i<arr.length;i++){
            resultArr[i]=resultArr[i-1]*arr[i-1];
        }
        int rightRunningProduct=1;
        for(int i=n-1;i>=0;i--){
            resultArr[i]=resultArr[i] * rightRunningProduct;
            rightRunningProduct=rightRunningProduct*arr[i];
        }

        System.out.println("final result o(1) : \n"+ Arrays.toString(resultArr));
    }
}
