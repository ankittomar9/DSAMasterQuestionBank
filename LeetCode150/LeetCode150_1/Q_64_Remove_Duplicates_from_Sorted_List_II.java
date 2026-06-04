package LeetCode150.LeetCode150_1;
public class Q_64_Remove_Duplicates_from_Sorted_List_II {
    public static void main(String[] args) {
    ListNode head1=new ListNode(1,new ListNode(2,
        new ListNode(3,new ListNode(3,new ListNode(4,new ListNode(4,new
            ListNode(5)))))));
        
        ListNode head2=new ListNode(1,new ListNode(1, new ListNode(1,
            new ListNode(2,new ListNode(3)))));
            System.out.println(" Input List : "+listToString(head1));
             System.out.println(" Output    : "+listToString(deleteDuplicates(head1)));

             System.out.println("\nInput List : "+listToString(head2));
             System.out.println(" Output    : "+listToString(deleteDuplicates(head2)));
    }
    public static ListNode deleteDuplicates(ListNode head){
        if(head==null|| head.next==null){return head;}
        ListNode dummy= new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy; ListNode current=head;
    
            while(current!=null ){
                if(current.next!=null && current.val==current.next.val){
                    while(current.next!=null && current.val==current.next.val){
                        current=current.next;
                    }
                        prev.next=current.next;
                }else{
                    prev=prev.next;
                }
                    current=current.next;
            }
            return dummy.next;
    }
    public static String listToString(ListNode head){
        StringBuilder sb=new StringBuilder();
        sb.append("[");ListNode temp=head;
        while(temp!=null){
            sb.append(temp.val);
            if(temp.next!=null){ sb.append(", ");}
            temp=temp.next;
        }
        sb.append("]");return sb.toString();

    }
    public static class ListNode{
        int val;        ListNode next;
        public ListNode(){};public ListNode(int val){this.val=val;}
        public ListNode(int val,ListNode next){this.val=val;this.next=next;}
    }
}
