package LeetCode150.LeetCode150_1;

import java.util.Arrays;
public class Q_5_Majority_Element {
 public static void main(String[] args) {
     int[] arr = {3,2,3};
       
        int result = majorityElement(arr);
        System.out.println("Original Array :  \n" +Arrays.toString(arr));
        System.out.println("Majority Element: " + result);

          int[] arr2 = {2,2,1,1,1,2,2};
        int result2 = majorityElement(arr2);
        System.out.println("Original Array :  \n" +Arrays.toString(arr2));
        System.out.println("Majority Element: " + result2);
     
    }
    public static int majorityElement(int[] arr){
        if(arr==null || arr.length==0){return 0;}
        int candidate=arr[0];
        int count=1;

        for(int i=1;i<arr.length;i++){
            if(count==0){
                candidate=arr[i];
                count=1;
            }   else if(arr[i]==candidate){
                count++;
            }else{
                count--;
            }
        }
        return candidate;
    }   
}
