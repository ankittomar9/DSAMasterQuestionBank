package LeetCode150.LeetCode150_1;
public class Q_80_Count_Complete_Tree_Nodes_1 {
    public static void main(String[] args) {
     // Build complete tree: [1,2,3,4,5,6]
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2, new TreeNode(4), new TreeNode(5));
        root.right = new TreeNode(3, new TreeNode(6), null);

        System.out.println("Input Tree : [1, 2, 3, 4, 5, 6]");
        System.out.println("Total Nodes: " + countNodes(root));
    }
    public static int countNodes(TreeNode root){
          if (root == null) {  return 0;        }
        int leftHeight=getHeight(root.left);
        int rightHeight=getHeight(root.right);

        if (leftHeight == rightHeight) {
            return (1<<leftHeight)+countNodes(root.right);        }
        else {
            return (1<<rightHeight)+countNodes(root.left);        }
    }
    public static int getHeight(TreeNode node){
        int height = 0;
        while (node != null) {
            height++;
            node = node.left;
        }
        return height;
    }
     public static class TreeNode{
        int val;TreeNode left;TreeNode right;
        TreeNode (){};
        TreeNode (int val){this.val=val;}
        TreeNode(int val,TreeNode left,TreeNode right){
            this.val=val;this.left=left;this.right=right;        }
    }
}
