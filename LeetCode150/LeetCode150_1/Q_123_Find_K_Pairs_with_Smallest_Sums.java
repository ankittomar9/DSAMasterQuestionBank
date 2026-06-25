package LeetCode150.LeetCode150_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

public class Q_123_Find_K_Pairs_with_Smallest_Sums {
    public static void main(String[] args) {
         int[] nums1 = {1, 7, 11};        int[] nums2 = {2, 4, 6};
        int k = 3;

        System.out.println("nums1 = " + Arrays.toString(nums1) +
                           ", nums2 = " + Arrays.toString(nums2) +
                           ", k = " + k);

        List<List<Integer>> result = kSmallestPairs(nums1, nums2, k);
        System.out.println("K Smallest Pairs: " + result);
    }
    public static List<List<Integer>>kSmallestPairs(int[] nums1,int[] nums2,int k){
        List<List<Integer>> result=new ArrayList<>();
        if(nums1.length==0 || nums2.length==0 || k==0) return result;

        PriorityQueue<int[]> minHeap=new PriorityQueue<>((a,b)->a[0]-b[0]);
        Set<String> visited=new HashSet<>();

        minHeap.offer(new int[]{nums1[0]+nums2[0],0,0});
        visited.add("0,0");

        while(k>0 && !minHeap.isEmpty()){
            int[] curr=minHeap.poll();
            int sum=curr[0]; int i=curr[1];int j=curr[2];

            result.add(Arrays.asList(nums1[i],nums2[j]));
            k--;

            if(j+1 <nums2.length && !visited.contains(i+","+(j+1))){
                minHeap.offer(new int[]{nums1[i]+nums2[j+1],i,j+1});
                visited.add(i+","+(j+1));
            }

            
            if(i+1 <nums1.length && !visited.contains((i+1)+","+(j))){
                minHeap.offer(new int[]{nums1[i+1]+nums2[j],i+1,j});
                visited.add((i+1)+","+(j));
            }
        }
        return result;
    }
}

/*
import java.util.*;
class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> res=new ArrayList<>();

        if(nums1.length==0 || nums2.length==0 || k==0)return res;
        PriorityQueue<int[]> minHeap=new PriorityQueue<>(
            (a,b)-> (nums1[a[0]]+nums2[a[1]])-(nums1[b[0]]+nums2[b[1]])
        );

        for(int i=0;i<Math.min(nums1.length,k);i++)minHeap.offer(new int[]{i,0});
        while (k>0 && !minHeap.isEmpty()){
            int[] curr=minHeap.poll();
            int i=curr[0];
            int j=curr[1];
            res.add(Arrays.asList(nums1[i],nums2[j]));
            k--;

            if(j+1<nums2.length)minHeap.offer(new int[]{i,j+1});
        }
        return res;
    }
}


*/