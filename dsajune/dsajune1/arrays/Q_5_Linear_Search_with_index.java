package dsajune.dsajune1.arrays;

import java.util.Arrays;

public class Q_5_Linear_Search_with_index {
    public static void main(String args[]){
          int[] arr={4,7,8,5,6,4,99,88,44,1,3,6,7,0,12,1};
          int target=0;
          System.out.println("Original Array \n"+Arrays.toString(arr));
          linearSearchHelper(arr, target);
         
    
    }
    public static void linearSearchHelper(int[] arr,int target){
        if(arr==null || arr.length<=1 ){
            System.out.println("Array is either empty or  null ");
            return ;}
                boolean isFound=false;int index=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]==target){
                    index=i;
                    isFound=true;
                    break;
                }
            }
            if(isFound){
                 System.out.println("Target found at index: "+index);
            }else{
                 System.out.println("Target doesn't exists");
            }

    }
}
