package LeetCode150.LeetCode150_1;
public class Q_109_Sort_List {
    public static void main(String[] args) {
        ListNode head = new ListNode(4, new ListNode(2,
             new ListNode(1, new ListNode(3))));

        System.out.println("Input List : [4, 2, 1, 3]");
        ListNode sorted = sortList(head);
        System.out.print("Sorted List: [");
        while (sorted != null) {
            System.out.print(sorted.val);
            if (sorted.next != null) System.out.print(", ");
            sorted = sorted.next;
        }
        System.out.println("]");
    }
    public static ListNode sortList(ListNode head){
        if(head==null || head.next==null){ return head;}

        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;

        ListNode left=sortList(head);
        ListNode right=sortList(slow);
        return merge(left,right);
    }
    public static ListNode merge(ListNode l1,ListNode l2){
        ListNode dummy =new ListNode();
        ListNode tail=dummy;
        while(l1!=null && l2!=null){
            if(l1.val <l2.val){
                tail.next=l1;
                l1=l1.next;
            }else{
                tail.next=l2;
                l2=l2.next;
            }
            tail=tail.next;
        }
        if(l1!=null ){
            tail.next=l1;
        }else{
            tail.next=l2;
        }
        return dummy.next;
    }
   
    public static class ListNode{
        int val;ListNode next;ListNode(){}
        ListNode(int val){this.val=val;}
        ListNode(int val,ListNode next){this.val=val;this.next=next;}
    }
   
}
