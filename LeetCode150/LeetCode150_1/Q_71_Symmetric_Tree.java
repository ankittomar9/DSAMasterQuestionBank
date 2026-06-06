package LeetCode150.LeetCode150_1;

public class Q_71_Symmetric_Tree {
    public static void main(String[] args) {
        // Symmetric tree: [1,2,2,3,4,4,3]
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2, new TreeNode(3), new TreeNode(4));
        root1.right = new TreeNode(2, new TreeNode(4), new TreeNode(3));

        System.out.println("Input Tree : [1, 2, 2, 3, 4, 4, 3]");
        System.out.println("Is Symmetric: " + isSymmetric(root1));

        // Non-symmetric tree: [1,2,2,null,3,null,3]
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2, null, new TreeNode(3));
        root2.right = new TreeNode(2, null, new TreeNode(3));

        System.out.println("\nInput Tree : [1, 2, 2, null, 3, null, 3]");
        System.out.println("Is Symmetric: " + isSymmetric(root2));
    }
    public static boolean isSymmetric(TreeNode root){
        if(root==null ) return true;
        return isMirror(root.left,root.right);
    }
    public static boolean isMirror(TreeNode left,TreeNode right){
        if(left==null && right ==null ){return true;}
        if(left==null ||right ==null || left.val!=right.val){return false;}
        boolean leftCheck=isMirror(left.left, right.right);
        boolean rightCheck=isMirror(left.right, right.left);
        return leftCheck && rightCheck;
    }
     public static class TreeNode{
        int val;TreeNode left; TreeNode right;
        TreeNode(){}        TreeNode(int val){this.val=val;}
        TreeNode(int val,TreeNode left,TreeNode right){
            this.val=val;this.left=left;this.right=right;       }    }
}
