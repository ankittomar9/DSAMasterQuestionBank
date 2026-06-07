package LeetCode150.LeetCode150_1;

public class Q_75_Flatten_Binary_Tree_to_Linked_List {
    public static void main(String[] args) {
   TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2, new TreeNode(3), new TreeNode(4));
        root.right = new TreeNode(5, null, new TreeNode(6));

        System.out.println("Input Tree : [1, 2, 5, 3, 4, null, 6]");
        flatten(root);
        System.out.println("Flattened  : " + treeToString(root));

    }
    public static void flatten(TreeNode  root){
        if(root==null){ return ;}
        flatten(root.left);
        flatten(root.right);

        TreeNode originalRight=root.right;
        root.right=root.left;
        root.left=null;

        TreeNode current=root;
        while(current.right!=null){
            current=current.right;
        }
        current.right=originalRight;
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
