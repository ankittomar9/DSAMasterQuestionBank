package LeetCode150.LeetCode150_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q_82_Binary_Tree_Right_Side_View {
    public static void main(String[] args) {
          // Build tree: [1,2,3,null,5,null,4]
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2, null, new TreeNode(5));
        root.right = new TreeNode(3, null, new TreeNode(4));

        System.out.println("Input Tree : [1, 2, 3, null, 5, null, 4]");
        System.out.println("Right Side View: " + rightSideView(root));
    }
    public static List<Integer> rightSideView(TreeNode root){
        List<Integer> result=new ArrayList<>();
            if(root==null){return result;}

        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelSize=queue.size();

            for(int i=0;i<levelSize;i++){
                TreeNode node=queue.poll();

                if(node.left!=null){    queue.offer(node.left);}
                  if(node.right!=null){    queue.offer(node.right);}
                  if(i==levelSize-1){
                    result.add(node.val);                  }
            }
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
