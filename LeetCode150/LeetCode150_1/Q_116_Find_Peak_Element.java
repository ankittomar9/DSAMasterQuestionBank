package LeetCode150.LeetCode150_1;

public class Q_116_Find_Peak_Element {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        System.out.println("Input: " + java.util.Arrays.toString(nums1));
        System.out.println("Peak Index: " + findPeakElement(nums1));

        int[] nums2 = {1, 2, 1, 3, 5, 6, 4};
        System.out.println("\nInput: " + java.util.Arrays.toString(nums2));
        System.out.println("Peak Index: " + findPeakElement(nums2));
    }
    public static int findPeakElement(int[] nums){
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int mid=left+(right-left)/2;

            if(nums[mid]<nums[mid+1]){
                left=mid+1;
            }else{
                right=mid;
            }
        }
        return left;
    }

}
