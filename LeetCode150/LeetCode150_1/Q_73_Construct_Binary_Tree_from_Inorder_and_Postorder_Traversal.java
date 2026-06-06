package LeetCode150.LeetCode150_1;

import java.util.HashMap;
import java.util.Map;

public class Q_73_Construct_Binary_Tree_from_Inorder_and_Postorder_Traversal {
    public static void main(String[] args) {
       int[] inOrder = {9, 3, 15, 20, 7};         int[] postOrder = {9, 15, 7, 20, 3};

        System.out.println("Input postOrder : [9, 15, 7, 20, 3]");
        System.out.println("Input Inorder  : [9, 3, 15, 20, 7]");

        TreeNode root = buildTree(postOrder, inOrder);
        
        System.out.println("Tree constructed successfully.");
        System.out.println("Root value     : " + root.val);
    }
    public static TreeNode buildTree(int[] postOrder,int[] inOrder){
        if(inOrder==null || postOrder==null  || inOrder.length==0){return null;}
        Map<Integer,Integer> inOrderIndexMap=new HashMap<>();
        for(int i=0;i<inOrder.length;i++){
            inOrderIndexMap.put(inOrder[i], i);
        }

        return buildTreeHelper( inOrder,0,inOrder.length-1,
            postOrder,0,postOrder.length-1, inOrderIndexMap);
    }
    public static TreeNode buildTreeHelper(int[] inOrder, int inStart,int inEnd ,
        int[] postOrder,int postStart,int postEnd,Map<Integer,Integer> inOrderIndexMap){

            if( inStart>inEnd || postStart>postEnd ){   return null;}

            int rootVal=postOrder[postEnd];
            TreeNode root =new TreeNode(rootVal);
            int rootIndex=inOrderIndexMap.get(rootVal);
           
            int leftSubtreeSize = rootIndex - inStart;

             root.left = buildTreeHelper( inOrder, inStart, rootIndex - 1,
            postOrder, postStart, postStart + leftSubtreeSize - 1,     inOrderIndexMap
        );

        root.right = buildTreeHelper(  inOrder, rootIndex + 1, inEnd,
            postOrder, postStart + leftSubtreeSize, postEnd - 1,   inOrderIndexMap);
           
            return root;
    }
    public static class TreeNode{
        int val; TreeNode left;TreeNode right;
        public TreeNode(){};        public TreeNode(int val){this.val=val;}
        public TreeNode(int val,TreeNode left,TreeNode right){
            this.val=val;this.left=left;this.right=right;
        }
    }

}
