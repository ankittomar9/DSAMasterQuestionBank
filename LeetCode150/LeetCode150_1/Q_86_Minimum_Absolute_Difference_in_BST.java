package LeetCode150.LeetCode150_1;

public class Q_86_Minimum_Absolute_Difference_in_BST {
    public static void main(String[] args) {
        // Build BST: [4,2,6,1,3]
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        root.right = new TreeNode(6);

        System.out.println("Input Tree : [4, 2, 6, 1, 3]");
        System.out.println("Minimum Absolute Difference: " + getMinimumDifference(root)); 
    }
    public static int minDiff=Integer.MAX_VALUE;
    public static TreeNode prev=null;

    public static int getMinimumDifference(TreeNode root){
        minDiff=Integer.MAX_VALUE;
        prev=null;
        inorder(root);
        return minDiff;
    }
    public static void inorder(TreeNode node){
        if(node==null){ return;}
        inorder(node.left);
        if(prev!=null){
            int newDiff=node.val-prev.val;
            minDiff=Math.min(minDiff, newDiff);
        }
        prev=node;
        inorder(node.right);
    }
     public static class TreeNode{
        int val;TreeNode left;TreeNode right;
        TreeNode(){};        TreeNode(int val){this.val=val;}
        TreeNode(int val,TreeNode left,TreeNode right){
            this.val=val;this.left=left;this.right=right;
        };
    }
}
