package LeetCode150.LeetCode150_1;

import java.util.PriorityQueue;

public class Q_111_Merge_k_Sorted_Lists {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(4, new ListNode(5)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode l3 = new ListNode(2, new ListNode(6));
        ListNode[] lists = {l1, l2, l3};

        System.out.println("Input Lists: [[1,4,5], [1,3,4], [2,6]]");
        ListNode merged = mergeKLists(lists);

        System.out.print("Merged List : [");
        while (merged != null) {
            System.out.print(merged.val);
            if (merged.next != null) System.out.print(", ");
            merged = merged.next;
        }
        System.out.println("]");
    }

    public static ListNode mergeKLists(ListNode[] lists){
        if(lists==null || lists.length==0){return null;}
        
        PriorityQueue<ListNode> pq=new PriorityQueue<>((a,b)->a.val-b.val);
        for(ListNode node :lists){
            if(node!=null){
                pq.offer(node);
            }
        }
        ListNode dummy=new ListNode(0);
        ListNode tail=dummy;

        while(!pq.isEmpty()){
            ListNode minNode=pq.poll();
            tail.next=minNode;
            tail=tail.next;
            if(minNode.next!=null){
                pq.offer(minNode.next);
            }
        }
        return dummy.next;
    }
    public static class ListNode{
        int val; ListNode next; ListNode(){}
        ListNode(int val){ this.val=val;}
        ListNode(int val,ListNode next){
            this.val=val; this.next=next;
        }
    }
}
