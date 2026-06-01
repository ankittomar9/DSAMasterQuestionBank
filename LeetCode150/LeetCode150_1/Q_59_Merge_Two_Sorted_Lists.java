package LeetCode150.LeetCode150_1;

public class Q_59_Merge_Two_Sorted_Lists {
    public static void main(String[] args) {
      ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

 System.out.println("Input list1 : [1, 2, 4]"); System.out.println("Input list2 : [1, 3, 4]");
        System.out.println("Output      : " + listToString(mergeTwoLists(list1, list2)));

        // Test case 2
        ListNode list3 = null;        ListNode list4 = new ListNode(0);

        System.out.println("\nInput list1 : []"); System.out.println("Input list2 : [0]");
        System.out.println("Output      : " + listToString(mergeTwoLists(list3, list4)));  
    }
    public static ListNode mergeTwoLists(ListNode list1,ListNode list2){
       ListNode dummy=new ListNode(0);
        ListNode current=dummy;

        while(list1!=null && list2!=null ){
            if(list1.val<= list2.val){
                current.next=list1;
                list1=list1.next;
            }else{
                 current.next=list2;
                list2=list2.next;
            }   
            current=current.next;         
        }
        if(list1!=null){
            current.next=list1;
        }else{
            current.next=list2;
        }
        return dummy.next;
    }
    public static String listToString(ListNode head){
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        ListNode temp=head;
        while(temp!=null){
            sb.append(temp.val);
            if(temp.next!=null){
                sb.append(",");
            }
            temp=temp.next;
        }
         sb.append("]");
        return sb.toString();
    }
    public static class ListNode{
        int val; ListNode next; 
        public ListNode(int val){ this.val=val;        }
         public ListNode(int val,ListNode next){ this.val=val; this.next=next;}
    }
}
 