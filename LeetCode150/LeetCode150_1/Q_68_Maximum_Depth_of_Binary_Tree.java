package LeetCode150.LeetCode150_1;

public class Q_68_Maximum_Depth_of_Binary_Tree {
    public static void main(String[] args) {
        // Build tree: [3,9,20,null,null,15,7]
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println("Input Tree : [3, 9, 20, null, null, 15, 7]");
        System.out.println("Maximum Depth: " + maxDepth(root));
    }
    public static int maxDepth(TreeNode root){
        if(root==null){            return 0;        }
        int leftHeight=maxDepth(root.left);
           int rightHeight=maxDepth(root.right);
           return leftHeight+rightHeight+1;
    }

    public static class TreeNode{
        int val;TreeNode left;TreeNode right;
            TreeNode (){};        TreeNode (int val){this.val=val;}
              TreeNode (int val,TreeNode left,TreeNode right){this.val=val;this.left=left;this.right=right;}
        
    }
}
