package dsajune.dsajune1.arrays;

import java.util.Arrays;

public class Q_8_Minimum_Pick {
    public static void main(String args[]){
        int arr[]={5,17,100,1};
          System.out.println("Original Array : "+Arrays.toString(arr));
        minimumPickHelper(arr);

    }
    public static void minimumPickHelper(int[] arr){
    if(arr==null || arr.length<1){
        System.out.println("Array is empty or null");
        return;
    }   
    int maxEven=Integer.MIN_VALUE;
    int minOdd=Integer.MAX_VALUE;

    for(int i=0;i<arr.length;i++){
        
            if(arr[i]%2==0){
                if(arr[i]>maxEven){
                       maxEven=arr[i];
                }
            
        }else {
            if(arr[i]<minOdd)
            minOdd=arr[i];
        }
    }
        System.out.println("Maximum Even  Value : "+maxEven);
        System.out.println("Minimum Odd  Value : "+minOdd);

        long difference=(long)Math.abs(maxEven)-Math.abs(minOdd);
          System.out.println("difference between maxEven and minOdd is : "+difference);

}

}
