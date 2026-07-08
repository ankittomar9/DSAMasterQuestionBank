package LeetCodeAll.arrays;
import java.util.Arrays;
public class Q_38_Sort_Colors {
    public static void main(String[] args) {
         int[] nums1 = {2, 0, 2, 1, 1, 0};        System.out.println("Input:  " + Arrays.toString(nums1));
        sortColors(nums1);        System.out.println("Output: " + Arrays.toString(nums1));
        // Test 2
        System.out.println();        int[] nums2 = {2, 0, 1};
        System.out.println("Input:  " + Arrays.toString(nums2));
        sortColors(nums2);        System.out.println("Output: " + Arrays.toString(nums2));
    }
    public static void sortColors(int[] nums){
        if(nums==null || nums.length<=1){ return;}
        int low=0;
        int mid=0;
        int high=nums.length-1;

        while(mid<=high){
            if(nums[mid]==0){
                swap(nums, mid, low);
                low++;mid++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                swap(nums, mid, high);
                high--;
            }
        }

    }
    public static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
