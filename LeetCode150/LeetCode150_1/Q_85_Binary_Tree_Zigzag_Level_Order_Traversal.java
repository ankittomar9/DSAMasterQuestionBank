package LeetCode150.LeetCode150_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q_85_Binary_Tree_Zigzag_Level_Order_Traversal  {
    public static void main(String[] args) {
          // Build tree: [3,9,20,null,null,15,7]
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20, new TreeNode(15), new TreeNode(7));

        System.out.println("Input Tree : [3, 9, 20, null, null, 15, 7]");
        System.out.println("Zigzag Level Order: " + zigzagLevelOrder(root));
    }
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root){
        List<List<Integer>> result=new ArrayList<>();
        if(root==null) return result;

        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        boolean leftToRight=true;

        while(!queue.isEmpty()){
            int levelSize= queue.size();
            List<Integer> currentLevel=new ArrayList<>();

            for(int i=0;i<levelSize;i++){
                TreeNode node=queue.poll();
                currentLevel.add(node.val);

                if(node.left!=null )queue.offer(node.left);
                if(node.right!=null )queue.offer(node.right);
            }
            if(!leftToRight){
                Collections.reverse(currentLevel);
            }
            result.add(currentLevel);
            leftToRight=!leftToRight;
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
