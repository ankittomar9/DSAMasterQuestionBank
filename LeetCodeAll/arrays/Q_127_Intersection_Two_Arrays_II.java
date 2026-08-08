package LeetCodeAll.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q_127_Intersection_Two_Arrays_II {
    public static void main(String[] args) {
         int[] n1 = {1, 2, 2, 1}, n2 = {2, 2};
        System.out.println(Arrays.toString(intersect(n1, n2))); // [2, 2]

        int[] n3 = {4, 9, 5}, n4 = {9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(intersect(n3, n4))); // [4, 9] or [9, 4]

        int[] n5 = {1, 2}, n6 = {3, 4};
        System.out.println(Arrays.toString(intersect(n5, n6))); // []

        int[] n7 = {3, 3, 3}, n8 = {3, 3};
        System.out.println(Arrays.toString(intersect(n7, n8))); // [3, 3]
    }
    public static int[] intersect(int[] nums1,int[] nums2){
        if(nums1.length >nums2.length) return intersect(nums2,nums1);

        Map<Integer,Integer> count =new HashMap<>();
        for(int num:nums1) count.merge(num, 1, Integer::sum);

        List<Integer> result=new ArrayList<>();
        for(int num :nums2){
            int c=count.getOrDefault(num, 0);
            if(c>0){
                result.add(num);
                count.put(num,c-1);
            }
        }
        int[] arr=new int[result.size()];
        for(int i=0;i<result.size();i++){
            arr[i]=result.get(i);
        }
        return arr;
    }

}
