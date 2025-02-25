package Tree;



class LCA {
    // Method to check if a node exists in the tree
    public boolean exists(TreeNode root, TreeNode node) {
        if (root == null) return false;
        if (root == node) return true;
        return exists(root.left, node) || exists(root.right, node);
    }

    // Method to find the Lowest Common Ancestor
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;

        boolean pLiesInLST = exists(root.left, p);
        boolean qLiesInLST = exists(root.left, q);

        // If both are in the left subtree
        if (pLiesInLST && qLiesInLST)
            return lowestCommonAncestor(root.left, p, q);

        // If both are in the right subtree
        if (!pLiesInLST && !qLiesInLST)
            return lowestCommonAncestor(root.right, p, q);

        // If one is in left and the other is in right
        return root;
    }
}
