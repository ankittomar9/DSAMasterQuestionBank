package LeetCode150.LeetCode150_1;
import java.util.Arrays;
public class Q_2_RemoveElement {
    public static void main(String[] args) {
          int arr[] = {3,2,2,3};
        int val=3;

        System.out.println("Original: " + Arrays.toString(arr));
       int result=removeElement(arr, val);
        System.out.println("k = " + result);
        System.out.println("Modified: " +
         Arrays.toString(arr) + "  (only first " + result + " matter)");
    }
        
    
    public static int removeElement(int arr[],int val){
        if(arr==null || arr.length==0){return 0;}

        int slow=0;

        for(int fast=0;fast<arr.length;fast++){
            if(arr[fast]!=val){
                arr[slow]=arr[fast];
                slow++;
            }
        }
        return slow;
    }
}
