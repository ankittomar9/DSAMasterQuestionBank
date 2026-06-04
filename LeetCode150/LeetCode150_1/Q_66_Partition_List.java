package LeetCode150.LeetCode150_1;

public class Q_66_Partition_List {
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1, new ListNode(4, new ListNode(3, 
            new ListNode(2, new ListNode(5, new ListNode(2))))));
        ListNode head2 = new ListNode(2, new ListNode(1));

           System.out.println("Input List : "+listToString(head1));
        System.out.println("x          : 3");
        System.out.println("Output     : " + listToString(partition(head1, 3)));

            System.out.println("\nInput List : "+listToString(head2));
        System.out.println("x          : 2");
        System.out.println("Output     : " + listToString(partition(head2, 2)));
        
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
                high.next=current;
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
