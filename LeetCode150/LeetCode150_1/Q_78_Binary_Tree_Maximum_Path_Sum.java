package LeetCode150.LeetCode150_1;

public class Q_78_Binary_Tree_Maximum_Path_Sum {
    public static void main(String[] args) {
          // Build tree: [-10,9,20,null,null,15,7]
        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20, new TreeNode(15), new TreeNode(7));

        System.out.println("Input Tree : [-10, 9, 20, null, null, 15, 7]");
        System.out.println("Maximum Path Sum: " + maxPathSum(root)); 
    }
    public static int maxPathSum(TreeNode root){
        int[] maxSum=new int[1];
        maxSum[0]=Integer.MIN_VALUE;
        dfs(root,maxSum);
        return maxSum[0];
    }
    public static int dfs(TreeNode node,int[] maxSum){
        if(node==null){ return 0;}
        int leftGain= Math.max(0, dfs(node.left, maxSum));
        int rightGain=Math.max(0, dfs(node.right, maxSum));

        int currentPathSum=node.val+leftGain+rightGain;
        maxSum[0]=Math.max(maxSum[0], currentPathSum);

        return node.val+Math.max(leftGain, rightGain);
    }
    public static class TreeNode{
        int val;TreeNode left;TreeNode right;
        TreeNode (){};
        TreeNode (int val){this.val=val;}
        TreeNode(int val,TreeNode left,TreeNode right){
            this.val=val;this.left=left;this.right=right;
        }
    }
}
