package LeetCode150.LeetCode150_1;
public class Q_110_Construct_Quad_Tree {
    public static void main(String[] args) {
        int[][] grid = {{0,1},{1,0}};
        Node root = construct(grid);

        System.out.println("Input Grid: [[0,1],[1,0]]");
        System.out.println("Quad Tree constructed successfully.");
        System.out.println("Root isLeaf: " + root.isLeaf);

    }
    public static Node construct(int[][] grid){
        return construct(grid,0, 0, grid.length);
    }
    public static Node construct(int[][] grid,int row,int col,int size){
        if(size==1){
            return new Node(grid[row][col]==1 ,true);
        }
        int newSize=size/2;

        Node topLeft=construct(grid, row, col, newSize);
        Node topRight=construct(grid, row, col+newSize, newSize);
        Node bottomLeft=construct(grid, row+newSize, col, newSize);
          Node bottomRight = construct(grid, row + newSize, col + newSize, newSize);

        if(
         topLeft.isLeaf && topRight.isLeaf && bottomLeft.isLeaf && bottomRight.isLeaf &&
         topLeft.val==topRight.val && topRight.val ==bottomLeft.val && bottomLeft.val==bottomRight.val){
            return new Node(topLeft.val,true);

         }
         return new Node(false, false, topLeft, topRight, bottomLeft, bottomRight);

    }
    public static class Node{
        public boolean val;        public boolean isLeaf;        public Node topLeft;
        public Node topRight;        public Node bottomLeft;        public Node bottomRight;

           public Node(boolean val, boolean isLeaf) {
            this.val = val;
            this.isLeaf = isLeaf;
        }

        public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
            this.val = val;
            this.isLeaf = isLeaf;
            this.topLeft = topLeft;
            this.topRight = topRight;
            this.bottomLeft = bottomLeft;
            this.bottomRight = bottomRight;
        }

    }
}
