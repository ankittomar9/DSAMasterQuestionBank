package LeetCode150.LeetCode150_1;

public class Q_61_Reverse_Linked_List_II {
    public static void main(String[] args) {
       ListNode head=new ListNode(
        1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));
          System.out.println("Input List : [1, 2, 3, 4, 5]");
        System.out.println("Left=2, Right=4");
        ListNode result = reverseBetween(head, 2, 4);
        System.out.println("Output     : " + listToString(result));
    }
    public static ListNode reverseBetween(ListNode head,int left,int right){
        if(head==null || left==right){return head;}
        ListNode dummy = new ListNode(0);
        dummy.next=head;        ListNode prev=dummy;

        for(int i=1;i<left;i++){
            prev=prev.next;
        }
        ListNode curr=prev.next;
        ListNode next;

        for(int i=left;i<right;i++){
            next=curr.next;
            curr.next=next.next;
            next.next=prev.next;
            prev.next=next;
        }
        return dummy.next;
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
