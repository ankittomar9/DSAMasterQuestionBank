package LeetCodeAll.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q_126_Intersection_Two_Arrays {
    public static void main(String[] args) {
        int[] n1 = {1, 2, 2, 1}, n2 = {2, 2};
        System.out.println(Arrays.toString(intersection(n1, n2))); // [2]

        int[] n3 = {4, 9, 5}, n4 = {9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(intersection(n3, n4))); // [9, 4]

        int[] n5 = {1, 2, 3}, n6 = {4, 5, 6};
        System.out.println(Arrays.toString(intersection(n5, n6))); // []

        int[] n7 = {1, 2, 3}, n8 = {3, 2, 1};
        System.out.println(Arrays.toString(intersection(n7, n8))); // [1, 2, 3]
    }
    public static int[] intersection(int[] nums1,int[] nums2){
        if(nums1.length >nums2.length) return intersection(nums2,nums1);

        Set<Integer> set=new HashSet<>();
        for(int num :nums1) set.add(num);

        Set<Integer> result=new HashSet<>();
        for(int num:nums2){
            if(set.contains(num)) result.add(num);
        }

        int[] arr=new int[result.size()];
        int i=0;
        for(int num : result)arr[i++]=num;
        return arr;
    }
}
