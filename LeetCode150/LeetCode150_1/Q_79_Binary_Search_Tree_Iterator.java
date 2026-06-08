package LeetCode150.LeetCode150_1;
import java.util.Stack;
public class Q_79_Binary_Search_Tree_Iterator {
    public static void main(String[] args) {
         // Build BST: [7, 3, 15, null, null, 9, 20]
        TreeNode root = new TreeNode(7);
        root.left = new TreeNode(3);
        root.right = new TreeNode(15, new TreeNode(9), new TreeNode(20));

        BSTIterator iterator = new BSTIterator(root);

        System.out.println("next()    → " + iterator.next());    // 3
        System.out.println("next()    → " + iterator.next());    // 7
        System.out.println("hasNext() → " + iterator.hasNext()); // true
        System.out.println("next()    → " + iterator.next());    // 9
        System.out.println("next()    → " + iterator.next());    // 15
        System.out.println("next()    → " + iterator.next());    // 20
        System.out.println("hasNext() → " + iterator.hasNext()); // false
    }
    public static class BSTIterator{
        private final Stack<TreeNode> stack=new Stack<>();
        public BSTIterator(TreeNode root){
            pushAllLeft(root);
        }
        public int next(){
            TreeNode node=stack.pop();
            pushAllLeft(node.right);
            return node.val;
        }
        public boolean hasNext(){
            return !stack.isEmpty();
        }
        private void pushAllLeft(TreeNode node){
            while(node!=null){
                stack.push(node);
                node=node.left;
            }
        }

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
