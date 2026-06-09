package LeetCode150.LeetCode150_1;

public class Q_83_Average_of_Levels_in_Binary_Tree {
    public static void main(String[] args) {
         // Build tree: [3,9,20,null,null,15,7]
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20, new TreeNode(15), new TreeNode(7));

        System.out.println("Input Tree : [3, 9, 20, null, null, 15, 7]");
        System.out.println("Average of Levels: " + averageOfLevels(root));
    }
}
