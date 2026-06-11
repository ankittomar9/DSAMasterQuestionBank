package LeetCode150.LeetCode150_1;

public class Q_88_Validate_Binary_Search_Tree {
    public static void main(String[] args) {
         // Valid BST
        TreeNode root1 = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        System.out.println("Input Tree : [2, 1, 3]");
        System.out.println("Is Valid BST: " + isValidBST(root1));

        // Invalid BST
        TreeNode root2 = new TreeNode(5);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(4, new TreeNode(3), new TreeNode(6));
        System.out.println("\nInput Tree : [5, 1, 4, null, null, 3, 6]");
        System.out.println("Is Valid BST: " + isValidBST(root2));
    }
    public static boolean isValidBST(TreeNode root){
        return validate(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    private static boolean validate(TreeNode node,long min, long max){
        if(node== null){ return true;}
          if(node.val<=min || node.val>=max){
            return false;
          }
          boolean result=validate(node.left, min, node.val) && validate(node.right, node.val, max);
          return result;
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
