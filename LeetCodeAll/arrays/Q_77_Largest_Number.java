package LeetCodeAll.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Q_77_Largest_Number {
    public static void main(String[] args) {
        int[] nums1 = {10, 2};        System.out.println("nums = " + Arrays.toString(nums1));
        System.out.println("Largest Number: " + largestNumber(nums1));
        // Test 2
        System.out.println();        int[] nums2 = {3, 30, 34, 5, 9};        System.out.println("nums = " + Arrays.toString(nums2));
        System.out.println("Largest Number: " + largestNumber(nums2));

        // Test 3: all zeros
        System.out.println();        int[] nums3 = {0, 0};        System.out.println("nums = " + Arrays.toString(nums3));
        System.out.println("Largest Number: " + largestNumber(nums3));
    }
    public static String largestNumber(int[] nums){
        String[] strs = new String[nums.length];
        for (int i=0; i<nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String order1 = a+b;
                String order2 = b+a;
                return order2.compareTo(order1); 
            }
        });
      
        if (strs[0].equals("0")) return "0";
        StringBuilder sb = new StringBuilder();
        for (String s:strs) {
            sb.append(s);
        }
        return sb.toString();
    }
}