package LeetCode150.LeetCode150_1;

public class Q_75_Flatten_Binary_Tree_to_Linked_List {
    public static void main(String[] args) {
        
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
