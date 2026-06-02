package LeetCode150.LeetCode150_1;

public class Q_62_Reverse_Nodes_in_k_Group {
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode head2 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

      System.out.println("Input List : [1, 2, 3, 4, 5]");System.out.println("k          : 2");
        System.out.println("Output     : " + listToString(reverseKGroup(head1, 2)));

        System.out.println("\\nInput List : [1, 2, 3, 4, 5]");
        System.out.println("k          : 3");
        System.out.println("Output     : " + listToString(reverseKGroup(head2, 3)));
    }
    public static ListNode reverseKGroup(ListNode head,int k){
        if(head==null || k==1){return head;}
        ListNode dummy=new ListNode(0);
        dummy.next=head;ListNode prev=dummy;

        while(true){
            ListNode check=prev;
            for(int i=0;i<k;i++){
                check=check.next;
                if(check==null){return dummy.next;      }
            }
            ListNode curr=prev.next;
            ListNode next;
            ListNode firstOfGroup=curr;
            
            for(int i=0;i<k;i++){
                next=curr.next;
                curr.next=prev.next;
                prev.next=curr;
                curr=next;
            }
            firstOfGroup.next=curr;
            prev=firstOfGroup;
        }
    }
     public static String listToString(ListNode head){
        StringBuilder sb=new StringBuilder();
        sb.append("["); ListNode temp=head;
        while(temp !=null){
            sb.append(temp.val);
            if(temp.next!=null){ sb.append(",");}
            temp=temp.next;
        }
            sb.append("]");            return sb.toString();
    }
    public static class ListNode{
        int val;ListNode next;public ListNode(){};
        public ListNode(int val){this.val=val;this.next=null;}
        public ListNode(int val,ListNode next){this.val=val;this.next=next;}
    }
}
