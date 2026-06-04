package LeetCode150.LeetCode150_1;

public class Q_69_Same_Tree {
    public static void main(String[] args) {
        
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
