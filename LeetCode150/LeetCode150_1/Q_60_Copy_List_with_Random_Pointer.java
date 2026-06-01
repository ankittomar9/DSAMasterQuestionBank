package LeetCode150.LeetCode150_1;

public class Q_60_Copy_List_with_Random_Pointer {
    public static void main(String[] args) {
        // Create test case: 1 -> 2 -> 3 with random pointers
        Node node1 = new Node(1);Node node2 = new Node(2); Node node3 = new Node(3);
        node1.next = node2;  node2.next = node3;        node1.random = node3;
        node2.random = node1; node3.random = null;  System.out.println("Original List created.");
          System.out.println("Original List:      : " + listToString(node1)); 
      

        Node copied = copyRandomList(node1);
        System.out.println("Copied List created successfully.");
         System.out.println("Output      : " + listToString(copied)); 
         System.out.println("\nDeep Copy Verification (Should be false): " + (node1 == copied));
    }
    public static Node copyRandomList(Node head){
        if(head == null){ return null;}
        Node current=head;
        while(current!=null){
            Node copy=new Node(current.val);
            copy.next=current.next;
            current.next=copy;
            current=copy.next;
        }
        current =head;
        while(current !=null){
            if(current.random!=null){
                current.next.random=current.random.next;
            }
            current=current.next.next;
        }
        Node copyHead=head.next;
        current=head;
        while(current!=null){
            Node copy=current.next;
            current.next=copy.next;
            if(copy.next!=null){
                copy.next=copy.next.next;
            }
            current=current.next;
        }
        return copyHead;
    } 
    public static String listToString(Node head){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node temp = head;
        while (temp != null) {
            sb.append("[val: ").append(temp.val);
            if (temp.random != null) {
                sb.append(", rand: ").append(temp.random.val).append("]");
            } else {
                sb.append(", rand: null]");
            }
            if (temp.next != null) {   sb.append(", ");       }
            temp = temp.next;
        }
        sb.append("]");
        return sb.toString();
    }
   public static class Node{
        int val;       Node next;        Node random;
        Node(int val){    this.val=val;   this.next=null; this.random=null;    }   }
}
