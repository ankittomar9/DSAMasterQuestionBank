package LeetCode150.LeetCode150_1;

public class Q_119_Find_Minimum_in_Rotated_Sorted_Array {
    public static void main(String[] args) {
          int[] nums1 = {3, 4, 5, 1, 2};
        System.out.println("Input: " + java.util.Arrays.toString(nums1));
        System.out.println("Minimum: " + findMin(nums1));

        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        System.out.println("\nInput: " + java.util.Arrays.toString(nums2));
        System.out.println("Minimum: " + findMin(nums2));
    }
    public static int findMin(int[] nums){
        int left=0; int right=nums.length-1;

        while(left<right){
            int mid=left+(right-left)/2;
            
            if(nums[mid]>nums[right]){
                left=mid+1;
            }else{
                right=mid;

            }
        }
        return nums[left];
    }
}
