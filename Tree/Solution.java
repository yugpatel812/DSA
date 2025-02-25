package Tree;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public int levels(TreeNode root) {
        if (root == null)
            return 0;
        return 1 + Math.max(levels(root.left), levels(root.right));
    }

    public void nthlevel(TreeNode root, int level, int n, List<Integer> arr) {
        if (root == null)
            return;
        if (level == n)
            arr.add(root.val);
        nthlevel(root.left, level + 1, n, arr);
        nthlevel(root.right, level + 1, n, arr);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root == null) return res;
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> l = new ArrayList<>();
            for(int i=0;i<n;i++){
                if(q.peek().left!=null) q.add(q.peek().left);
                if(q.peek().right!=null) q.add(q.peek().right);
                l.add(q.remove().val);
            }
            res.add(l);
        }
        return res;

        //List<List<Integer>> ans = new ArrayList<>();
        // int lvl = levels(root);
        // for (int n = 0; n <= lvl - 1; n++) {
        //     List<Integer> arr = new ArrayList<>();
        //     // nthlevel(root, 0, n, arr);
        //     ans.add(arr);
        // }
        // Bfs()
        // return ans;
    }
}