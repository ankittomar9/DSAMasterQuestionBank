package LeetCode150.LeetCode150_1;

public class Q_57_Linked_List_Cycle {
    public static void main(String[] args) {
        ListNode head1=new ListNode(3);
        ListNode node2=new ListNode(2);
        ListNode node0=new ListNode(0);
        ListNode node4=new ListNode(-4);
        head1.next=node2;
        node2.next=node0;
        node0.next=node4;
        node4.next=node2;
        System.out.println("Input List with cycle: " + hasCycle(head1));
       //    System.out.println("Input List with cycle: " + listToString(head1));
        // Test case 2: without cycle
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);

        System.out.println("Input List without cycle: " + hasCycle(head2));
    }
    public static boolean hasCycle(ListNode head){
        if(head==null || head.next==null){ return false;}
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    //  //Printing the LinkedList on Console 
    //  public static String listToString(ListNode head){
    //     StringBuilder sb=new StringBuilder();
    //     sb.append("[");
    //     ListNode temp=head;
    //     while(temp!=null){
    //         sb.append(temp.val);
    //         if(temp.next!=null){
    //             sb.append(",");
    //         }
    //         temp=temp.next;
    //     }
    //      sb.append("]");
    //     return sb.toString();
    // }
    public static class ListNode{
        int val; ListNode next;  ListNode(int x){ this.val=x;  this.next=null;    }
    }
}
