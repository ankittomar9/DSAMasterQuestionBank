package LeetCode150.LeetCode150_1;
public class Q_75_Flatten_Binary_Tree_to_Linked_List_1 {
     public static void main(String[] args) {
   TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2, new TreeNode(3), new TreeNode(4));
        root.right = new TreeNode(5, null, new TreeNode(6));

        System.out.println("Input Tree : \n[1, 2, 5, 3, 4, null, 6]");
        // Reset prev before running in case this is called multiple times
        prev = null;
        flatten(root);
        System.out.println("Flattened  : \n" + treeToString(root));

    }
    private static TreeNode prev = null;
    public static void flatten(TreeNode root){
        if (root == null) {
            return;
        }
        // 1. Go to the absolute furthest right node first
        flatten(root.right);
        // 2. Then go to the left node
        flatten(root.left);
        // 3. Process the current root:
        // Attach the previously processed block to the right
        root.right = prev;
        // Sever the left connection (required by LeetCode rules)
        root.left = null;
        // The current node is now fully processed, so it becomes the new "prev"
        prev = root;
    }
    public static String treeToString(TreeNode root){
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        TreeNode curr=root;
        while(curr!=null){
            sb.append(curr.val);
            if(curr.right!=null){ sb.append(",null, ");}
            curr=curr.right;
        }
        sb.append("]");return sb.toString();
    }
    public static class TreeNode{
        int val;        TreeNode left;TreeNode right;
        public TreeNode(){};
        public TreeNode(int val){this.val=val;};
        public TreeNode(int val,TreeNode left,TreeNode right){
           this.val=val; this.left=left;this.right=right;
        };
    }
}
