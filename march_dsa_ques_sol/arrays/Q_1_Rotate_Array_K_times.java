package march_dsa_ques_sol.arrays;

import java.util.Arrays;

public class Q_1_Rotate_Array_K_times {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int k=3;int n=arr.length;
        k=k%n;

        rotateHelper(arr,0,n-1);
        System.out.println(Arrays.toString(arr));        
        rotateHelper(arr,0,k-1);
         System.out.println(Arrays.toString(arr)); 
        rotateHelper(arr,k,n-1);
         System.out.println(Arrays.toString(arr)); 

    }
    public static void rotateHelper(int arr[],int start,int end){
        if(arr==null || arr.length==0){return;}

        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
