package dsajune.dsajune1.arrays;

import java.util.Arrays;

public class Q_7_Arrays_k_element_array {
    public static void main(String args[]){
            int arr[]={2,4,3,1,5,6,9,1,2,7};
            int k=3;
            System.out.println("Original Array : \n "+Arrays.toString(arr));
            kElementsHelper(arr, k);
    }
    public static void kElementsHelper(int arr[],int k){
        if(arr==null || arr.length==0){
            System.out.println("Array is empty or null"); return;
        }

        int countOfOperations=0; 

        for(int i=0;i<arr.length;i++){
            
            if(arr[i]>k){
                 
                 arr[i]=-1;
                countOfOperations++;
            }
        }
      
            System.out.println("Arrays after values are replaced : \n"+Arrays.toString(arr));
        System.out.println("Number of Operations Required : "+countOfOperations);
        
    }
}
