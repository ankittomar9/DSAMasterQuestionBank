package LeetCodeAll.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Q_125_Top_K_Frequent_Elements {
    public static void main(String[] args) {
       System.out.println(Arrays.toString(topKFrequentHeap(new int[]{1,1,1,2,2,3}, 2)));
        System.out.println(Arrays.toString(topKFrequentHeap(new int[]{4,1,-1,2,-1,2,3}, 2)));

   //     System.out.println(Arrays.toString(topKFrequentBucket(new int[]{1,1,1,2,2,3}, 2)));
      //  System.out.println(Arrays.toString(topKFrequentBucket(new int[]{4,1,-1,2,-1,2,3}, 2))); 
    }
    public static int[] topKFrequentHeap(int[] nums,int k){
        Map<Integer ,Integer> freq=new HashMap<>();
        for(int num : nums)freq.merge(num, 1, Integer::sum);

        PriorityQueue<Integer> heap=new PriorityQueue<>(
            (a,b)-> freq.get(a) - freq.get(b)   );

            for(int num : freq.keySet()){
                heap.offer(num);
                if(heap.size() >k){
                    heap.poll();
                }
            }
            int [] result=new int[k];
            for(int i=0; i<k;i++){
                result[i]=heap.poll();
            }
            return result;

    }
}
