package LeetCodeAll.arrays;
import java.util.Arrays;
public class Q_117_Wiggle_Sort_II_1 {
    public static void main(String[] args) {
        int[] nums1 = {1, 5, 1, 1, 6, 4};        test(nums1);

        int[] nums2 = {1, 3, 2, 2, 3, 1};        test(nums2);

        int[] nums3 = {4, 5, 5, 6};        test(nums3);

        int[] nums4 = {1, 1, 2, 1, 2, 2, 1};        test(nums4);
    }

    private static void test(int[] nums) {
        System.out.print("Before: " + Arrays.toString(nums));
        wiggleSort(nums);
        System.out.println(" → After: " + Arrays.toString(nums));
    }

    public static void wiggleSort(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);

        int[] res=new int[n];
        int j=n-1;

        // fill odd indices
        for (int i= 1; i<n; i+=2) {
            res[i]=nums[j--];
        }
        // fill even indices
        for (int i=0; i<n; i+=2) {
            res[i]=nums[j--];
        }

        System.arraycopy(res, 0, nums, 0, n);
    }
}