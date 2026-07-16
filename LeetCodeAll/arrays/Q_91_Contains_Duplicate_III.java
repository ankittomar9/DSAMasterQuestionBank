package LeetCodeAll.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
        int n=nums.length;
        long bucketWidth=(long) valueDiff+1;

       Map<Long, Long> bucketMap=new HashMap<>();
        for (int i = 0; i < n; i++) {
        long currentVal = nums[i];
        long bucketId = getBucketId(currentVal, bucketWidth);
            if (bucketMap.containsKey(bucketId)) return true;

              Long leftNeighbor = bucketMap.get(bucketId - 1);
        if (leftNeighbor!=null && Math.abs(currentVal - leftNeighbor)<=valueDiff) return true;

          Long rightNeighbor=bucketMap.get(bucketId + 1);
        if (rightNeighbor!=null && Math.abs(currentVal - rightNeighbor)<=valueDiff) return true;

          bucketMap.put(bucketId, currentVal);

           if (i >= indexDiff) {
            long evictVal = nums[i - indexDiff];
            long evictBucketId = getBucketId(evictVal, bucketWidth);
            bucketMap.remove(evictBucketId);
        }
    }
    return false;
}     
    private static long getBucketId(long value, long width) {
    if (value >= 0) {
        return value / width;
    } else {
        return (value + 1) / width - 1;
    }
}
}
