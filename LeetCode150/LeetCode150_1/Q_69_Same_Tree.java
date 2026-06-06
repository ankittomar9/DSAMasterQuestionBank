package LeetCode150.LeetCode150_1;
public class Q_69_Same_Tree {
    public static void main(String[] args) {
         TreeNode p1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));

        System.out.println("Input p : [1, 2, 3]"); System.out.println("\nInput q : [1, 2, 3]");
        System.out.println("Output  : " + isSameTree(p1, q1));

        // Test case 2: different structure
        TreeNode p2 = new TreeNode(1, new TreeNode(2), null);
        TreeNode q2 = new TreeNode(1, null, new TreeNode(2));

        System.out.println("\nInput p : [1, 2]");
        System.out.println("Input q : [1, null, 2]");
        System.out.println("Output  : " + isSameTree(p2, q2));
    }
    public static boolean isSameTree(TreeNode p,TreeNode q){
        if(p==null && q==null ){            return true;        }
        
        if(p==null ||q==null  || p.val!=q.val){return false;}
        
        boolean result =isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        return result;
    }   

    public static class TreeNode{
        int val;TreeNode left;TreeNode right;
            TreeNode (){};        TreeNode (int val){this.val=val;}
              TreeNode (int val,TreeNode left,TreeNode right){this.val=val;this.left=left;this.right=right;}
        
    }
}
