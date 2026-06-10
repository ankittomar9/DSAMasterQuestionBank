package LeetCode150.LeetCode150_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q_83_Average_of_Levels_in_Binary_Tree {
    public static void main(String[] args) {
         // Build tree: [3,9,20,null,null,15,7]
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20, new TreeNode(15), new TreeNode(7));

        System.out.println("Input Tree : [3, 9, 20, null, null, 15, 7]");
        System.out.println("Average of Levels: " + averageOfLevels(root));
    }
    public static List<Double> averageOfLevels(TreeNode root){
        List<Double> result=new ArrayList<>();
        if(root==null) return result;

        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelSize=queue.size();
            double sum=0;
           for(int i=0;i<levelSize;i++){
               TreeNode node=queue.poll();  
            sum=sum+node.val;

            if(node.left!=null){ queue.offer(node.left);}
            if(node.right!=null){ queue.offer(node.right);}
           }
           double average=sum/levelSize;
           result.add(average);
        }
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
