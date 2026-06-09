package LeetCode150.LeetCode150_1;

public class Q_81_Lowest_Common_Ancestor_of_a_Binary_Tree {
    public static void main(String[] args) {
         // Build tree: [3,5,1,6,2,0,8,null,null,7,4]
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5, new TreeNode(6), new TreeNode(2, new TreeNode(7), new TreeNode(4)));
        root.right = new TreeNode(1, new TreeNode(0), new TreeNode(8));

        TreeNode p = root.left;      // node 5
        TreeNode q = root.right;     // node 1

        System.out.println("Input Tree : [3,5,1,6,2,0,8,null,null,7,4]");
        System.out.println("p = 5, q = 1");
        System.out.println("LCA        : " + lowestCommonAncestor(root, p, q).val);
    }
    public static TreeNode lowestCommonAncestor(TreeNode root,TreeNode p,TreeNode q){
        if(root ==null ){return null;}
        if(root==p|| root==q){
            return root;
        }
        TreeNode left= lowestCommonAncestor(root.left, p, q);
        TreeNode right=lowestCommonAncestor(root.right, p, q);

        if(left!=null && right!=null){
            return root;
        }
        TreeNode result= left!=null ? left:right; 
        return result;

    }
     public static class TreeNode{
        int val;TreeNode left;TreeNode right;
        TreeNode (){};
        TreeNode (int val){this.val=val;}
        TreeNode(int val,TreeNode left,TreeNode right){
            this.val=val;this.left=left;this.right=right;        }
    }
}
