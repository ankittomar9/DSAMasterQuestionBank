package LeetCode150.LeetCode150_1;

public class Q_77_Sum_Root_to_Leaf_Numbers {
    public static void main(String[] args) {
          // Test case 1: [1,2,3]
        TreeNode root1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        System.out.println("Input Tree : [1, 2, 3]");
        System.out.println("Output     : " + sumNumbers(root1));

        // Test case 2: [4,9,0,5,1]
        TreeNode root2 = new TreeNode(4);
        root2.left = new TreeNode(9, new TreeNode(5), new TreeNode(1));
        root2.right = new TreeNode(0);
        System.out.println("\nInput Tree : [4, 9, 0, 5, 1]");
        System.out.println("Output     : " + sumNumbers(root2));
    }
    public static int sumNumbers(TreeNode root){
        return dfs(root,0);
    }
    public static int dfs(TreeNode node,int current){
        if(node ==null){            return 0;        }
        current=current*10+node.val;

        if(node.left==null && node.right==null){
            return current;
        }
        int leftAndRightSubtreeCall=dfs(node.left,current) + dfs(node.right,current);
        return leftAndRightSubtreeCall;
    }
    public static class TreeNode{
        int val;TreeNode left;TreeNode right;
        TreeNode(){}
        TreeNode(int val){this.val=val;}
        TreeNode(int val,TreeNode left,TreeNode right){
            this.val=val;this.left=left;this.right=right;
        };
    }
}
