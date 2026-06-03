package LeetCode150.LeetCode150_1;

public class Q_64_Remove_Duplicates_from_Sorted_List_II {
    public static void main(String[] args) {
        
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
