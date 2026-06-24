package LeetCode150.LeetCode150_1;

import java.util.Collections;
import java.util.PriorityQueue;

public class Q_124_Find_Median_from_Data_Stream {
    public static void main(String[] args) {
           MedianFinder mf = new MedianFinder();
        mf.addNum(1);        mf.addNum(2);
          //System.out.println("maxHeap");
        System.out.println(mf.findMedian());   // 1.5
        mf.addNum(3);
        System.out.println(mf.findMedian());   // 2.0
    }
    public static class MedianFinder{
        PriorityQueue<Integer> maxHeap;    PriorityQueue<Integer> minHeap;
      
        public MedianFinder(){
            maxHeap=new PriorityQueue<>(Collections.reverseOrder());
            minHeap=new PriorityQueue<>();
        }

        public void addNum(int num){
            maxHeap.offer(num);
            minHeap.offer(maxHeap.poll());

            if(maxHeap.size()<minHeap.size()){
                maxHeap.offer(minHeap.poll());
            }
        }
        public double findMedian(){
            if(maxHeap.size()>minHeap.size()){
                return maxHeap.peek();
            }else{
                return (maxHeap.peek()+minHeap.peek())/2.0;
            }
        }

    }
}
