package dsajune.dsajune1.arrays;
import java.util.Arrays;
public class Q_1_Rotate_Array_Right {
 public static void main(String[] args){
    int[] arr={1,2,3,4,5};
    int k=3; k=k%arr.length;
    System.out.println("Original Array : \n"+Arrays.toString(arr));
    rotateHelper(arr, k);
    
    System.out.println("Rotated Array k times  : \n"+Arrays.toString(arr));
 }
 public static void rotateHelper(int arr[],int k){
    
    int start=0;int end=arr.length-1;
    if(arr==null || arr.length==0){
        System.out.println("Array is empty of null");
        return ;
    }
    reverseHelper(arr, 0, end);
    reverseHelper(arr, start, k-1);
    reverseHelper(arr, k, end);

 }
 public static void reverseHelper(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++; end--;
        }
 }
}
