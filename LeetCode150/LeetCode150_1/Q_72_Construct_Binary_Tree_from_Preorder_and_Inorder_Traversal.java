package LeetCode150.LeetCode150_1;

import java.util.HashMap;
import java.util.Map;

public class Q_72_Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal {
    public static void main(String[] args) {
        int[] preOrder={3,9,20,15,7};        int[] inOrder={9,3,15,20,7};
         System.out.println("Input Preorder : [3, 9, 20, 15, 7]");
        System.out.println("Input Inorder  : [9, 3, 15, 20, 7]");

        TreeNode root = buildTree(preOrder, inOrder);
        System.out.println("Tree constructed successfully.");
        System.out.println("Root value     : " + root.val);
    }
    public static TreeNode buildTree(int[] preOrder,int[] inOrder){
        if(preOrder==null || inOrder==null || preOrder.length==0){return null;}
        Map<Integer,Integer> inOrderIndexMap=new HashMap<>();
        for(int i=0;i<inOrder.length;i++){
            inOrderIndexMap.put(inOrder[i], i);
        }

        return buildTreeHelper(preOrder,0,preOrder.length-1,
            inOrder,0,inOrder.length-1,inOrderIndexMap);
    }
    public static TreeNode buildTreeHelper(int[] preOrder,int preStart,int preEnd,
        int[] inOrder, int inStart,int inEnd ,Map<Integer,Integer> inOrderIndexMap){

            if(preStart>preEnd || inStart>inEnd){   return null;}

            int rootVal=preOrder[preStart];
            TreeNode root =new TreeNode(rootVal);
            int rootIndex=inOrderIndexMap.get(rootVal);
            int leftSubtreeSize = rootIndex-inStart;

            root.left=buildTreeHelper(preOrder, preStart+1, preStart+leftSubtreeSize, 
                inOrder, inStart, rootIndex-1, inOrderIndexMap);
            root.right=buildTreeHelper(preOrder, preStart+leftSubtreeSize+1, preEnd, 
                          inOrder, rootIndex+1, inEnd, inOrderIndexMap)    ;


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
