package LeetCode150.LeetCode150_1;

public class Q_74_Populating_Next_Right_Pointers_in_Each_Node_II {
    public static void main(String[] args) {
         Node root = new Node(1);
        root.left = new Node(2, new Node(4), new Node(5), null);
        root.right = new Node(3, null, new Node(7), null);

        System.out.println("Input Tree: [1,2,3,4,5,null,7]");
        connect(root);
        System.out.println("Next pointers populated level by level.\n");
        printLevelOrder(root);
    }
    public static Node connect(Node root){
        if(root==null) return null;
        Node curr=root;
        while(curr!=null){
            Node dummy=new Node(0);
            Node prev=dummy;
            while(curr!=null){
                if(curr.left!=null){
                    prev.next=curr.left;
                    prev=prev.next;
                }
                if(curr.right !=null){
                    prev.next=curr.right;
                    prev=prev.next;
                }
                curr=curr.next;
            }
            curr=dummy.next;
        }   
        return root;
    }
    // Helper method to visually print the levels using ONLY the next pointers!
    public static void printLevelOrder(Node root) {
        Node curr = root;
        int level = 1;
        
        while (curr != null) {
            System.out.print("Level " + level + ": ");
            Node temp = curr;
            
            // Print the current level traversing horizontally
            while (temp != null) {
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }
            System.out.println("null");

            // Find the start of the next level to continue printing
            Node nextLevelStart = null;
            while (curr != null) {
                if (curr.left != null) { nextLevelStart = curr.left; break; }
                if (curr.right != null) { nextLevelStart = curr.right; break; }
                curr = curr.next;
            }
            curr = nextLevelStart;
            level++;
        }
    }
    public static class Node{
        int val;
        Node left;Node right; Node next;
        public Node(){};
        public Node(int val){this.val=val;}
        public Node(int val,Node left,Node right,Node next){
            this.val=val;this.left=left;this.right=right;this.next=next;}
        }
    }

