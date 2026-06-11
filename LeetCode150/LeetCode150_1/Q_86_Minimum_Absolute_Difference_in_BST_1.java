package LeetCode150.LeetCode150_1;

public class Q_86_Minimum_Absolute_Difference_in_BST_1 {
    public static void main(String[] args) {
        // Build BST: [4,2,6,1,3]
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        root.right = new TreeNode(6);

        System.out.println("Input Tree : [4, 2, 6, 1, 3]");
        System.out.println("Minimum Absolute Difference: " + getMinimumDifference(root)); 
    }
    
    public static int getMinimumDifference(TreeNode root){
        int[] minDiff = new int[] { Integer.MAX_VALUE };
        TreeNode[] prev = new TreeNode[1]; 
        
        inorder(root, prev, minDiff);
        
        return minDiff[0];
    }
    public static void inorder(TreeNode node,TreeNode[] prev,int[] minDiff){
        if(node==null){ return;}
        inorder(node.left, prev, minDiff);
        if(prev[0]!=null){
            int currentDiff=node.val-prev[0].val;
            minDiff[0]=Math.min(minDiff[0], currentDiff);
        }
        prev[0]=node;
        inorder(node.right, prev, minDiff);
    }
     public static class TreeNode{
        int val;TreeNode left;TreeNode right;
        TreeNode(){};        TreeNode(int val){this.val=val;}
        TreeNode(int val,TreeNode left,TreeNode right){
            this.val=val;this.left=left;this.right=right;
        };
    }
}
