package LeetCodeAll.arrays;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Q_96_Sliding_Window_Maximum {
    public static void main(String[] args) {
         // Test 1
        int[] nums1 = {1, 3, -1, -3, 5, 3, 6, 7};
        System.out.println("nums = " + Arrays.toString(nums1) + ", k=3");
        System.out.println("Result: " + Arrays.toString(maxSlidingWindow(nums1, 3)));

         // Test 4: descending array
        System.out.println();
        int[] nums4 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("nums = " + Arrays.toString(nums4) + ", k=3");
        System.out.println("Result: " + Arrays.toString(maxSlidingWindow(nums4, 3)));

        // Test 5: ascending array
        System.out.println();
        int[] nums5 = {1, 2, 3, 4, 5};
        System.out.println("nums = " + Arrays.toString(nums5) + ", k=3");
        System.out.println("Result: " + Arrays.toString(maxSlidingWindow(nums5, 3)));
    }
    public static int[] maxSlidingWindow(int[] nums,int k){
        int n=nums.length; int[] result=new int[n-k+1];
        Deque<Integer> deque=new ArrayDeque<>();

        for(int i=0;i<n;i++){

            while(!deque.isEmpty() && deque.peek()  <= i-k){
                deque.poll();
            }

            while(!deque.isEmpty() && nums[deque.peekFirst()]  <= nums[i]){
                deque.pollLast();
            }

            deque.offerLast(i);

            if(i >=k-1){
                result[i-k+1]= nums[deque.peekFirst()];
            }
        }
        return result;
    }
}
