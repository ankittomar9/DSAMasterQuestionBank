package LeetCode150.LeetCode150_1;

public class Q_108_Convert_Sorted_Array_to_Binary_Search_Tree {
    public static void main(String[] args) {
         int[] nums = {-10, -3, 0, 5, 9};
        TreeNode root = sortedArrayToBST(nums);

        System.out.println("Input: " + java.util.Arrays.toString(nums));
        System.out.println("BST constructed successfully.");
        System.out.println("Root value: " + root.val);

        // Verify with inorder traversal
        System.out.print("Inorder traversal (should be sorted): \n");
        printInorder(root);
        System.out.println();
    }
    public static TreeNode sortedArrayToBST(int[] nums){
        if(nums==null || nums.length==0){return null;}
        return buildBST(nums, 0, nums.length-1);
    }
    public static class TreeNode{
        int val;TreeNode left; TreeNode right;
        TreeNode(){} TreeNode(int val){this.val=val;}
        TreeNode(int val,TreeNode left,TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }
    public static TreeNode buildBST(int[] nums,int left,int right){
        if(left>right) return null;
        
        int mid=left+(right-left)/2;
        TreeNode root=new TreeNode(nums[mid]);
        
        root.left=buildBST(nums, left, mid-1);
        root.right=buildBST(nums, mid+1, right);
        
        return root;
    }
    public static void printInorder(TreeNode node){
        if(node==null){return;}
        printInorder(node.left);
        System.out.print(node.val+" ");
        printInorder(node.right);
    }
}
