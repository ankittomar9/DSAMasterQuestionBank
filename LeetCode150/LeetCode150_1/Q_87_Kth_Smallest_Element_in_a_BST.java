package LeetCode150.LeetCode150_1;

public class Q_87_Kth_Smallest_Element_in_a_BST {
    public static void main(String[] args) {
        //Test Case 1
        TreeNode root1=new TreeNode();
        root1.left=new TreeNode(1,null,new TreeNode(2));
        root1.right=new TreeNode(4);

        System.out.println("Input Tree : [3,1,4,null,2]");
        System.out.println("k       : 1");
        System.out.println("Kth Smallest : "+kthSmallest(root1, 1));
    
        
        //Test Case 2
        TreeNode root2=new TreeNode(5);
        root2.left = new TreeNode(3, new TreeNode(2, new TreeNode(1), null), new TreeNode(4));
        root2.right=new TreeNode(6);

        System.out.println("\nInput Tree :[5, 3, 6, 2, 4, null, null, 1]");
        System.out.println("k       : 3");
        System.out.println("Kth Smallest : "+kthSmallest(root2, 3));
    
    }
    public static int count=0;
    public static int result=0;

    public static int kthSmallest(TreeNode root,int k){
        count=0; result=0; 
        inorder(root,k); 
        return result;
    }
    public static void inorder(TreeNode node,int k){
        if(node==null) return;
        inorder(node.left,k);
        count++;
        if(count==k){
            result=node.val;
            return;
        }
        inorder(node.right, k);

    }
    public static class TreeNode{
        int val;TreeNode left;TreeNode right;
        public TreeNode(){};
        public TreeNode(int val){this.val=val;}
        public TreeNode(int val,TreeNode left,TreeNode right){
            this.val=val;this.left=left;this.right=right;
        }
    }
}
