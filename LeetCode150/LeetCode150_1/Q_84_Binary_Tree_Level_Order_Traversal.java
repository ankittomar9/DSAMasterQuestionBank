package LeetCode150.LeetCode150_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q_84_Binary_Tree_Level_Order_Traversal {
    public static void main(String[] args) {
         TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20, new TreeNode(15), new TreeNode(7));

        System.out.println("Input Tree : [3, 9, 20, null, null, 15, 7]");
        System.out.println("Level Order Traversal: " + levelOrder(root));
    }
    public static List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> result=new ArrayList<>();
        if(root==null) return result;

        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelSize=queue.size();
            List<Integer> currentLevel=new ArrayList<>();

            for(int i=0;i<levelSize;i++){
                TreeNode node=queue.poll();
                currentLevel.add(node.val);

                if(node.left!=null )queue.offer(node.left);
                if(node.right!=null )queue.offer(node.right);
            }
            result.add(currentLevel);
        }
        return result;
    }

    public static class TreeNode{
        int val;TreeNode left;TreeNode right;
        TreeNode(){};        TreeNode(int val){this.val=val;}
        TreeNode(int val,TreeNode left,TreeNode right){
            this.val=val;this.left=left;this.right=right;
        };
    }
}
