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

}
