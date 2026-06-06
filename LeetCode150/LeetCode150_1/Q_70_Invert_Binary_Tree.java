package LeetCode150.LeetCode150_1;

import java.util.LinkedList;
import java.util.Queue;

public class Q_70_Invert_Binary_Tree {
    public static void main(String[] args) {
         // Build tree: [4,2,7,1,3,6,9]
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        root.right = new TreeNode(7, new TreeNode(6), new TreeNode(9));

        System.out.println("Input Tree : [4, 2, 7, 1, 3, 6, 9]");
          System.out.println("Input Tree \n"+treeToString(root));
        TreeNode inverted = invertTree(root);
        System.out.println("Inverted   : \n" + treeToString(inverted));
    }
    public static TreeNode invertTree(TreeNode root){
        if(root==null){ return null;}
    
        TreeNode left=invertTree(root.left);
        TreeNode right=invertTree(root.right);

        root.left=right; 
        root.right=left;
        return root;
    }
    public static String treeToString(TreeNode root){
        if(root==null ){return "[]";}
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        StringBuilder sb=new StringBuilder();
        sb.append("[");

        while(!queue.isEmpty()){
            TreeNode node =queue.poll();
            if(node !=null){
                sb.append(node.val).append(", ");
                queue.offer(node.left);
                queue.offer(node.right);
            }else{
                    sb.append("null, ");
            }
        }
        String result=sb.toString();
        if(result.endsWith(", ")){
        result = result.substring(0, result.length() - 2);
        }
        return result +"]";
    }
    public static class TreeNode{
        int val;TreeNode left; TreeNode right;
        TreeNode(){}        TreeNode(int val){this.val=val;}
        TreeNode(int val,TreeNode left,TreeNode right){
            this.val=val;this.left=left;this.right=right;       }    }
}
