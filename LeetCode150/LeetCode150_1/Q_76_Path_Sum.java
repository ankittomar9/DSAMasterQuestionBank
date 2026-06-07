package LeetCode150.LeetCode150_1;

public class Q_76_Path_Sum {
    public static void main(String[] args) {
      // Build tree: [5,4,8,11,null,13,4,7,2,null,null,null,1]
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4, new TreeNode(11, 
            new TreeNode(7), new TreeNode(2)), null);
        root.right = new TreeNode(8, new TreeNode(13), 
        new TreeNode(4, null, new TreeNode(1)));

        System.out.println("Input Tree   : [5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1]");
        System.out.println("Target Sum   : 22");
        System.out.println("Has Path Sum : " + hasPathSum(root, 22));   
    }
    public static boolean hasPathSum(TreeNode root,int targetSum){
        if(root==null){return false;}
        if(root.left==null && root.right==null){
            return root.val==targetSum;
        }
        boolean leftAndRightSubtreeCall=hasPathSum(root.left, targetSum-root.val)||
        hasPathSum(root.right, targetSum-root.val);
        return leftAndRightSubtreeCall;
    }
    public static class TreeNode{
        int val;TreeNode left;TreeNode right;
        public TreeNode(){};
        public TreeNode(int val){this.val=val;}
        public TreeNode(int val,TreeNode left,TreeNode right){
            this.val=val;this.left=left;this.right=right;
        };
    }
}
