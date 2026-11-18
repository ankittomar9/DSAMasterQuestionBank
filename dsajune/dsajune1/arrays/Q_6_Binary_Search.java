package dsajune.dsajune1.arrays;

import java.util.Arrays;

public class Q_6_Binary_Search {
    public static void main(String args[]){
        int arr[]={1,2,3,5,8,12,15,19,20};
        int target=19;
         System.out.println("original Array : \n"+Arrays.toString(arr));
         binarySearchHelper(arr, target);
    }
    public static void binarySearchHelper(int arr[],int target){
        if(arr==null || arr.length==0){
             System.out.println("Array is either null or empty");
             return;
        }
        boolean isFound=false;
        int left=0;int right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                System.out.println("Target Exists at index "+mid);
                isFound=true;return;
            }else if(arr[mid]>target){
                right=mid-1;
            }else if(arr[mid]<target){
                left=mid+1;
            }
       }
       if(isFound==false){
        
            System.out.println("Target doesn't exists");
            
       }
            
    }
}
