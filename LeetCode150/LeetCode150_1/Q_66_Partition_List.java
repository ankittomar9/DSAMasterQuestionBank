package LeetCode150.LeetCode150_1;

public class Q_66_Partition_List {
    public static void main(String[] args) {

        
    }
    public static ListNode partition(ListNode head,int x){
        if(head==null || head.next==null){ return head;}
        ListNode lowDummy=new ListNode(0);        ListNode highDummy=new ListNode(0); 
       ListNode low=lowDummy;        ListNode high=highDummy;
        ListNode current=head;

        while(current!=null){
            if(current.val<x){
                low.next=current;
                low=low.next;
            }else{
                high.next=highDummy;
                high=high.next;
            }
            current=current.next;
        }
        high.next=null;
        low.next=highDummy.next;
        return lowDummy.next;    
    }
    public static String listToString(ListNode head){
        StringBuilder sb=new StringBuilder();
        sb.append("[");ListNode temp=head;
        while(temp!=null){
            sb.append(temp.val);
            if(temp.next!=null){  sb.append(", ");  }
            temp=temp.next;
        }
        sb.append("]");return sb.toString();
    }
    public static class ListNode{
        int val;ListNode next; public ListNode(){};
        public ListNode(int val){this.val=val;}
        public ListNode(int val,ListNode next){this.val=val;this.next=next;}
    }

}
