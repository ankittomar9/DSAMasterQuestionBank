package LeetCode150.LeetCode150_1;

public class Q_58_Add_Two_Numbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        System.out.println("Input l1 : [2, 4, 3]");System.out.println("Input l2 : [5, 6, 4]");
        System.out.println("Output   : " + listToString(addTwoNumbers(l1, l2)));

        // Test case 2
        ListNode l3 = new ListNode(0);       ListNode l4 = new ListNode(0);

        System.out.println("\nInput l1 : [0]"); System.out.println("Input l2 : [0]");
        System.out.println("Output   : " + listToString(addTwoNumbers(l3, l4)));
    }
    public static ListNode addTwoNumbers(ListNode l1,ListNode l2 ){
        ListNode dummy=new ListNode(0);
        ListNode current =dummy;
        int carry=0;

        while(l1!=null || l2!=null || carry!=0){
            int sum=carry;
            if(l1!=null){
                sum=sum+l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                  sum=sum+l2.val;
                l2=l2.next;
            }
            carry=sum/10;
            int sumMod=sum%10;
            current.next=new ListNode(sumMod);
            current=current.next;
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
        public ListNode(int val){ this.val=val; //this.next=null; this null is not required i guess;

        }
         public ListNode(int val,ListNode next){ this.val=val; this.next=next;}
    }
}
