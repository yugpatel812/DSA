package Tree;

class  TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val=x;
    }
}
public class DiameterTree {
    static int max =0;

    public int diameterOfBinaryTree(TreeNode root){
        diameter(root);
        return max;
    }

    public int diameter (TreeNode root){
        if(root==null )return 0;
        int left=diameter(root.left);
        int right= diameter(root.right);
        max = Math.max(max,left+right);
        return 1+ Math.max(left,right);
    }
}
