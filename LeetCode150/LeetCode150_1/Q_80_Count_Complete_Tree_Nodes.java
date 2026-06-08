package LeetCode150.LeetCode150_1;

public class Q_80_Count_Complete_Tree_Nodes {
    public static void main(String[] args) {
         // Build complete tree: [1,2,3,4,5,6]
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2, new TreeNode(4), new TreeNode(5));
        root.right = new TreeNode(3, new TreeNode(6), null);

        System.out.println("Input Tree : [1, 2, 3, 4, 5, 6]");
        System.out.println("Total Nodes: " + countNodes(root));
    }
    public static int countNodes(TreeNode root){
        if(root==null ){return 0;}
        int leftHeight=getHeight(root.left);
        int rightHeight=getHeight(root.right);

        if(leftHeight==rightHeight){
            return (1<<(leftHeight+1))-1;
        }

        int left=1<<leftHeight;
        int right=(1<<(leftHeight+1))-1;

        while(left<right){
            int mid=left+(right-left+1)/2;
            if(exists(root,leftHeight,mid)){
                left=mid;
            }else{
                right=mid-1;
            }
        }
        return (1<<leftHeight)+left;
    }
    public static int getHeight(TreeNode node){
        int height=0;
        while(node!=null){
            height++;
            node=node.left;
        }
        return height;
    }
    public static boolean exists(TreeNode node,int height,int index){
        int mask=1<<(height-1);
        while(mask>0 && node !=null){
          if((index & mask)==0){
            node=node.left;
          } else{
            mask >>=1;
          } 
        }
        return node!=null;
    }

     public static class TreeNode{
        int val;TreeNode left;TreeNode right;
        TreeNode (){};
        TreeNode (int val){this.val=val;}
        TreeNode(int val,TreeNode left,TreeNode right){
            this.val=val;this.left=left;this.right=right;
        }
    }
}
