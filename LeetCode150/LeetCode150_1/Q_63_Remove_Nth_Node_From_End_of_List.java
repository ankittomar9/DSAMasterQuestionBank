package LeetCode150.LeetCode150_1;

public class Q_63_Remove_Nth_Node_From_End_of_List {
    public static void main(String[] args) {
        ListNode head1=new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,
            new ListNode(5)))));
            ListNode head2=new ListNode(1);
             System.out.println("Input List : [1, 2, 3, 4, 5]");  System.out.println("n : 2");
               System.out.println("Output : "+listToString(removeNthFromEnd(head1, 2)));

             System.out.println("\nInput List : [1]");  System.out.println("n : 1");
               System.out.println("Output : "+listToString(removeNthFromEnd(head2, 1)));
    }
    public static ListNode removeNthFromEnd(ListNode head, int n){
        ListNode dummy=new ListNode(0);
        dummy.next=head; 
        ListNode fast=dummy; ListNode slow=dummy;
        for(int i=0;i<=n;i++){
            fast=fast.next;
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return dummy.next;

    }
    public static String listToString(ListNode head){
        StringBuilder sb=new StringBuilder();
        sb.append("["); ListNode temp=head;
        while(temp!=null){
            sb.append(temp.val);
            if(temp.next!=null){ sb.append(",");}
            temp=temp.next;
        }
        sb.append("]");return sb.toString();
    }
    public static class ListNode{
        int val;        ListNode next;
        public ListNode(){};
        public ListNode(int val){this.val=val; this.next=null;}
        public ListNode(int val,ListNode next){this.val=val; this.next=next;}
    }
}
