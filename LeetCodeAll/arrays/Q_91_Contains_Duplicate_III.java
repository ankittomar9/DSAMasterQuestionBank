package LeetCodeAll.arrays;

public class Q_91_Contains_Duplicate_III {
    public static void main(String[] args) {
       int[] nums1 = {1, 2, 3, 1};
        System.out.println("nums=" + Arrays.toString(nums1) + ", indexDiff=3, valueDiff=0");
        System.out.println("Result: " + containsNearbyAlmostDuplicate(nums1, 3, 0));

        // Test 2
        System.out.println();
        int[] nums2 = {1, 5, 9, 1, 5, 9};
        System.out.println("nums=" + Arrays.toString(nums2) + ", indexDiff=2, valueDiff=3");
        System.out.println("Result: " + containsNearbyAlmostDuplicate(nums2, 2, 3));

        // Test 3
        System.out.println();
        int[] nums3 = {1, 0, 1, 1};
        System.out.println("nums=" + Arrays.toString(nums3) + ", indexDiff=1, valueDiff=2");
        System.out.println("Result: " + containsNearbyAlmostDuplicate(nums3, 1, 2));  
    }
    public static boolean containsNearbyAlmostDuplicate(int[] nums,int indexDiff,int valueDiff){

    }
}
